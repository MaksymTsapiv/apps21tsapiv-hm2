package ua.edu.ucu.collections.immutable;

public class Node {
    private Node previous;
    private Node next;
    private Object value;

    public Node(Object value, Node prev, Node next) {
        this.value = value;
        this.previous = prev;
        this.next = next;
    }

    public Node(Object value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }


    @Override
    public String toString() {
        return value.toString();
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node prev) {
        this.previous = prev;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object val) {
        this.value = val;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node ne) {
        this.next = ne;
    }
}

