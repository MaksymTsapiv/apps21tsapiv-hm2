package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    ImmutableLinkedList queue;

    public Queue() {
        this.queue = new ImmutableLinkedList();
    }

    public Object peek() {
        return this.queue.get(0);
    }

    public Object dequeue() {
        Object el = peek();
        this.queue.remove(0);
        return el;
    }

    public void enqueue(Object e) {
        this.queue.add(e);
    }
}
