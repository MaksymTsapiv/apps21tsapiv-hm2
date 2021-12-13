package ua.edu.ucu.collections.immutable;

import junit.framework.TestCase;

public class ImmutableArrayListTest extends TestCase {


    public void testAdd() {
        Object [] numbers1 = {1, 2, 3};
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(numbers1);
        Object elem1 = 4;
        ImmutableArrayList list = (ImmutableArrayList) immutableArrayList.add(elem1);
        assertEquals(4, list.toArray()[3]);
        assertEquals(3, list.toArray()[2]);
        assertEquals(4, list.toArray().length);

        ImmutableArrayList arrayList = new ImmutableArrayList();
        Object elem2 = 5;
        ImmutableArrayList list1 = (ImmutableArrayList) arrayList.add(elem2);
        assertEquals(1, list1.toArray().length);
        assertEquals(5, list1.toArray()[0]);
    }

    public void testTestAdd() {
        Object [] numbers3 = {6, 7, 8};
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(numbers3);
        Object elem3 = 9;
        ImmutableArrayList arrayList = (ImmutableArrayList) immutableArrayList.add(1, elem3);
        assertEquals(9, arrayList.toArray()[1]);
        assertEquals(6, arrayList.toArray()[0]);
        assertEquals(7, arrayList.toArray()[2]);
        assertEquals(4, arrayList.toArray().length);
    }

    public void testAddAll() {
        Object [] numbers = {1, 2, 3};
        Object [] nums = {4, 5, 6};
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(numbers);
        ImmutableArrayList arrayList = (ImmutableArrayList) immutableArrayList.addAll(nums);
        assertEquals(2, arrayList.toArray()[1]);
        assertEquals(1, arrayList.toArray()[0]);
        assertEquals(4, arrayList.toArray()[3]);
        assertEquals(6, arrayList.toArray()[5]);
        assertEquals(6, arrayList.toArray().length);
    }

    public void testTestAddAll() {
        Object [] numbers = {1, 2, 3};
        Object [] nums = {4, 5, 6};
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(numbers);
        ImmutableArrayList arrayList = (ImmutableArrayList) immutableArrayList.addAll(2, nums);
        assertEquals(2, arrayList.toArray()[1]);
        assertEquals(1, arrayList.toArray()[0]);
        assertEquals(4, arrayList.toArray()[3]);
        assertEquals(6, arrayList.toArray()[5]);
        assertEquals(6, arrayList.toArray().length);
    }

    public void testGet() {
    }

    public void testRemove() {
    }

    public void testSet() {
    }

    public void testIndexOf() {
    }

    public void testSize() {
    }

    public void testClear() {
    }

    public void testIsEmpty() {
    }

    public void testToArray() {
    }
}