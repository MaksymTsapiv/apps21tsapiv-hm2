package ua.edu.ucu.collections.immutable;

public final class ImmutableLinkedList implements ImmutableList {
    private Object[] elements;
    private Node[] nodes;
    private final Node head;
    private Node tail;

    public ImmutableLinkedList(Object[] elements) {
        this.nodes = new Node[elements.length];
        this.head = new Node(elements[0]);
        this.tail = new Node(elements[elements.length - 1]);
        this.nodes[0] = this.head;
        this.nodes[elements.length - 1] = this.tail;
        for (int i = 0; i < elements.length; ++i) {
            this.nodes[i] = new Node(elements[i]);
        }
        for (int i = 1; i < this.nodes.length - 1; i++) {
            this.nodes[i].setPrevious(nodes[i - 1]);
            this.nodes[i].setNext(nodes[i + 1]);
        }
    }

    public ImmutableLinkedList() {
        this.head = null;
    }

    @Override
    public ImmutableList add(Object e) {
        ImmutableLinkedList linkedList = new ImmutableLinkedList(this.elements);
        Node node = new Node(e);
        linkedList.tail.setNext(node);
        node.setPrevious(linkedList.tail);
        linkedList.tail = node;
        return linkedList;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        int flag = 0;
        Object[] temp = new Object[this.elements.length + 1];
        for (int i = 0; i < this.elements.length + 1; i++) {
            if (i == index) {
                flag = 1;
                temp[i] = e;
            }
            temp[i + flag] = this.elements[i];
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        Object[] temp = new Object[this.elements.length + c.length];
        for (int i = 0; i < this.elements.length + c.length; i++) {
            if (i < this.elements.length) {
                temp[i] = elements[i];
            } else {
                temp[i] = c[i - elements.length];
            }
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        Object[] temp = new Object[this.elements.length + c.length];
        for (int i = 0; i < this.elements.length + c.length; i++) {
            if (i == index) {
                temp[i] = c[i - index];
            }
            temp[i] = this.elements[i];
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public Object get(int index) {
        return this.nodes[index].getValue();
    }

    @Override
    public ImmutableList remove(int index) {
        Object[] temp = new Object[this.elements.length - 1];
        for (int i = 0; i < this.elements.length; i++) {
            if (i == index) {
                continue;
            }
            temp[i] = this.elements[i];
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        Object[] temp = new Object[this.elements.length];
        for (int i = 0; i < this.elements.length; i++) {
            if (i == index) {
                temp[i] = e;
            }
            temp[i] = this.elements[i];
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return this.nodes.length;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public Object[] toArray() {
        return this.nodes;
    }

    public ImmutableLinkedList addFirst(Object e) {
        return (ImmutableLinkedList) add(0, e);
    }

    public ImmutableLinkedList addLast(Object e) {
        return (ImmutableLinkedList) add(this.elements.length - 1, e);
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public Object getFirst() {
        return this.head.getValue();
    }

    public Object getLast() {
        return this.tail.getValue();
    }

    public ImmutableLinkedList removeFirst() {
        return (ImmutableLinkedList) remove(0);
    }

    public ImmutableLinkedList removeLast() {
        return (ImmutableLinkedList) remove(this.elements.length - 1);
    }
}
