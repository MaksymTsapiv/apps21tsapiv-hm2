package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList stack;

    public Stack() {
        this.stack = new ImmutableLinkedList();
    }

    public void push(Object e) {
        this.stack.add(this.stack.size() - 1, e);
    }

    public Object pop() {
        Object el = peek();
        this.stack.remove(this.stack.size() - 1);
        return el;
    }

    public Object peek() {
        return this.stack.get(this.stack.size() - 1);
    }
}
