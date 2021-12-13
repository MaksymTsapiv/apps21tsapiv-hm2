package ua.edu.ucu.collections.immutable;

import junit.framework.TestCase;

public class ImmutableLinkedListTest extends TestCase {


    public void testAdd() {
        Object[] numbers1 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers1);
        Object elem1 = 4;
        ImmutableLinkedList list = (ImmutableLinkedList) immutableLinkedList.add(elem1);
        assertEquals(4, list.toArray()[3]);
        assertEquals(3, list.toArray()[2]);
        assertEquals(4, list.toArray().length);

        ImmutableLinkedList linkedList = new ImmutableLinkedList();
        Object elem2 = 5;
        ImmutableLinkedList list1 = (ImmutableLinkedList) linkedList.add(elem2);
        assertEquals(1, list1.toArray().length);
        assertEquals(5, list1.toArray()[0]);
    }

    public void testTestAdd() {
        Object[] numbers = {6, 7, 8};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers);
        Object elem3 = 9;
        ImmutableLinkedList arrayList = (ImmutableLinkedList) immutableLinkedList.add(1, elem3);
        assertEquals(9, arrayList.toArray()[1]);
        assertEquals(6, arrayList.toArray()[0]);
        assertEquals(7, arrayList.toArray()[2]);
        assertEquals(4, arrayList.toArray().length);
    }

    public void testAddAll() {
        Object[] numbers = {1, 2, 3};
        Object[] nums = {4, 5, 6};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers);
        ImmutableLinkedList linkedList = (ImmutableLinkedList) immutableLinkedList.addAll(nums);
        assertEquals(4, linkedList.toArray()[3]);
        assertEquals(6, linkedList.toArray()[5]);
        assertEquals(6, linkedList.toArray().length);
    }

    public void testTestAddAll() {
        Object[] numbers = {1, 2, 3};
        Object[] nums = {4, 5, 6};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers);
        ImmutableLinkedList arrayList = (ImmutableLinkedList) immutableLinkedList.addAll(2, nums);
        assertEquals(2, arrayList.toArray()[1]);
        assertEquals(1, arrayList.toArray()[0]);
        assertEquals(4, arrayList.toArray()[2]);
        assertEquals(3, arrayList.toArray()[5]);
        assertEquals(6, arrayList.toArray().length);
    }

    public void testGet() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(1, immutableLinkedList.get(0));
        assertEquals(2, immutableLinkedList.get(1));
        assertEquals(3, immutableLinkedList.get(2));
    }

    public void testRemove() {
        Object[] numbers3 = {1, 2, 3, 4};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        ImmutableLinkedList arrayList = (ImmutableLinkedList) immutableLinkedList.remove(1);
        assertEquals(1, arrayList.toArray()[0]);
        assertEquals(3, arrayList.toArray()[1]);
        assertEquals(4, arrayList.toArray()[2]);
        assertEquals(3, arrayList.toArray().length);
    }

    public void testSet() {
        Object[] numbers3 = {1, 2, 3, 4};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        ImmutableLinkedList arrayList = (ImmutableLinkedList) immutableLinkedList.set(2, 7);
        assertEquals(1, arrayList.toArray()[0]);
        assertEquals(2, arrayList.toArray()[1]);
        assertEquals(7, arrayList.toArray()[2]);
        assertEquals(4, arrayList.toArray().length);
    }

    public void testIndexOf() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(-1, immutableLinkedList.indexOf(0));
        assertEquals(0, immutableLinkedList.indexOf(1));
        assertEquals(2, immutableLinkedList.indexOf(3));

    }

    public void testSize() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(3, immutableLinkedList.size());
    }

    public void testClear() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(3, immutableLinkedList.size());
        ImmutableLinkedList linkedList = (ImmutableLinkedList) immutableLinkedList.clear();
        assertEquals(0, linkedList.size());
    }

    public void testIsEmpty() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertFalse(immutableLinkedList.isEmpty());
        ImmutableLinkedList linkedList = (ImmutableLinkedList) immutableLinkedList.clear();
        assertTrue(linkedList.isEmpty());
    }

    public void testToArray() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(immutableLinkedList.toArray()[0], numbers3[0]);
        assertEquals(immutableLinkedList.toArray()[1], numbers3[1]);
        assertEquals(immutableLinkedList.toArray()[2], numbers3[2]);
    }

    public void testAddFirst() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        ImmutableLinkedList linkedList = immutableLinkedList.addFirst(4);
        assertEquals(4, linkedList.toArray()[0]);
        assertEquals(1, linkedList.toArray()[1]);
        assertEquals(2, linkedList.toArray()[2]);
    }

    public void testAddLast() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        ImmutableLinkedList linkedList = immutableLinkedList.addLast(4);
        assertEquals(1, linkedList.toArray()[0]);
        assertEquals(2, linkedList.toArray()[1]);
        assertEquals(4, linkedList.toArray()[2]);
        assertEquals(3, linkedList.toArray()[3]);
    }

    public void testGetHead() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(1, immutableLinkedList.getHead().getValue());
    }

    public void testGetTail() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(3, immutableLinkedList.getTail().getValue());
    }

    public void testGetFirst() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(1, immutableLinkedList.getFirst());
    }

    public void testGetLast() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        assertEquals(3, immutableLinkedList.getLast());
    }

    public void testRemoveFirst() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        ImmutableLinkedList linkedList = immutableLinkedList.removeFirst();
        assertEquals(2, linkedList.toArray()[0]);
        assertEquals(2, linkedList.size());
    }

    public void testRemoveLast() {
        Object[] numbers3 = {1, 2, 3};
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(numbers3);
        ImmutableLinkedList linkedList = immutableLinkedList.removeLast();
        assertEquals(1, linkedList.toArray()[0]);
        assertEquals(2, linkedList.toArray()[1]);
        assertEquals(2, linkedList.size());
    }
}