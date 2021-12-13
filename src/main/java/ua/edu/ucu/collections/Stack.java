package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList stack;

    public Stack() {
        this.stack = new ImmutableLinkedList();
    }

    public void push(Object e) {
        this.stack = (ImmutableLinkedList) this.stack.add(0, e);
    }

    public Object pop() {
        Object el = peek();
        this.stack = (ImmutableLinkedList) this.stack.remove(0);
        return el;
    }

    public Object peek() {
        return this.stack.get(0);
    }
}
