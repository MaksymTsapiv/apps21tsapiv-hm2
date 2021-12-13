package ua.edu.ucu.collections.immutable;

public final class ImmutableLinkedList implements ImmutableList {
    private final Node head;
    private final Node[] nodes;
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
        this.nodes = new Node[0];
        this.head = null;
    }

    @Override
    public ImmutableList add(Object e) {
        if (this.size() == 0){
            Object[] temp = new Object[1];
            temp[0] = e;
            return new ImmutableLinkedList(temp);
        }
        Object[] temp = new Object[this.nodes.length + 1];
        for (int i = 0; i < this.nodes.length; i++) {
            temp[i] = this.nodes[i].getValue();
        }
        temp[this.nodes.length] = e;
        return new ImmutableLinkedList(temp);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        int flag = 0;
        Object[] temp = new Object[this.nodes.length + 1];
        for (int i = 0; i < this.nodes.length; i++) {
            if (i == index) {
                flag = 1;
                temp[i] = e;
            }
            temp[i + flag] = this.nodes[i].getValue();
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        Object[] temp = new Object[this.nodes.length + c.length];
        for (int i = 0; i < this.nodes.length + c.length; i++) {
            if (i < this.nodes.length) {
                temp[i] = this.nodes[i];
            } else {
                temp[i] = c[i - nodes.length];
            }
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        int j = 0;
        Object[] temp = new Object[this.nodes.length + c.length];
        for (int i = 0; i < this.nodes.length; i++) {
            if (i == index) {
                for (; j < c.length; j++) {
                    temp[i + j] = c[j];
                }
            }
            temp[i + j] = this.nodes[i].getValue();
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public Object get(int index) {
        return this.nodes[index].getValue();
    }

    @Override
    public ImmutableList remove(int index) {
        if(this.nodes.length == 1) return new ImmutableLinkedList();
        int flag = 0;
        Object[] temp = new Object[this.nodes.length - 1];
        for (int i = 0; i < this.nodes.length; i++) {
            if (i == index) {
                flag = 1;
                continue;
            }
            temp[i - flag] = this.nodes[i].getValue();
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        Object[] temp = new Object[this.nodes.length];
        for (int i = 0; i < this.nodes.length; i++) {
            if (i == index) {
                temp[i] = e;
                continue;
            }
            temp[i] = this.nodes[i].getValue();
        }
        return new ImmutableLinkedList(temp);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < this.nodes.length; i++) {
            if (this.nodes[i].getValue() == e) {
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
        Object[] temp = new Object[this.nodes.length];
        for (int i = 0; i < this.nodes.length; i++) {
            temp[i] = this.nodes[i].getValue();
        }
        return temp;
    }

    public ImmutableLinkedList addFirst(Object e) {
        return (ImmutableLinkedList) add(0, e);
    }

    public ImmutableLinkedList addLast(Object e) {
        return (ImmutableLinkedList) add(this.nodes.length - 1, e);
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
        return (ImmutableLinkedList) remove(this.nodes.length - 1);
    }
}
