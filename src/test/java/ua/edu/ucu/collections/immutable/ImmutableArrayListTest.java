package ua.edu.ucu.collections.immutable;

import junit.framework.TestCase;

public class ImmutableArrayListTest extends TestCase {
    ImmutableArrayList arrayList;


    public void setUp(){
        Object[] elements = {1,2,3,4,5};
        arrayList = new ImmutableArrayList(elements);
    }

    public void testAdd() {
        Object [] numbers1 = {1, 2, 3};
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(numbers1);
        Object elem1 = 4;
        ImmutableArrayList ialNew1 = (ImmutableArrayList) immutableArrayList.add(elem1);
//        assertEquals(4, ialNew1.toArray()[3]);
//        assertEquals(3, ialNew1.toArray()[2]);
        assertEquals(4, ialNew1.toArray().length);

        ImmutableArrayList arrayList = new ImmutableArrayList();
        Object elem2 = 5;
        ImmutableArrayList ialNew2 = (ImmutableArrayList) arrayList.add(elem2);
        assertEquals(1, ialNew2.toArray().length);
        assertEquals(5, ialNew2.toArray()[0]);
//
//        Object [] numbers3 = {3, 13, 23};
//        ImmutableArrayList ial3 = new ImmutableArrayList(numbers3);
//        Object elem3 = 25;
//        ImmutableArrayList ialNew3 = (ImmutableArrayList) ial3.add(1, elem3);
//        assertEquals(25, ialNew3.toArray()[1]);
//        assertEquals(3, ialNew3.toArray()[0]);
//        assertEquals(13, ialNew3.toArray()[2]);
//        assertEquals(4, ialNew3.toArray().length);
    }

    public void testTestAdd() {
    }

    public void testAddAll() {
    }

    public void testTestAddAll() {
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