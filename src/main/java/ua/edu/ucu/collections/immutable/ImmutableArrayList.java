package ua.edu.ucu.collections.immutable;

public final class ImmutableArrayList implements ImmutableList {
    private Object[] elements;

    public ImmutableArrayList(Object[] elements) {
        this.elements = new Object[elements.length];
        for (int i = 0; i < elements.length - 1; i++) {
            this.elements[i] = elements[i];
        }
    }

    public ImmutableArrayList() {
        elements = new Object[0];
    }

    @Override
    public ImmutableList add(Object e) {
        Object[] temp = new Object[this.elements.length + 1];
        for (int i = 0; i < this.elements.length - 1; i++) {
            temp[i] = this.elements[i];
        }
        temp[this.elements.length] = e;
        return new ImmutableArrayList(temp);
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
            temp[i - flag] = this.elements[i];
        }
        return new ImmutableArrayList(temp);
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
        return new ImmutableArrayList(temp);
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
        return new ImmutableArrayList(temp);
    }

    @Override
    public Object get(int index) {
        return this.elements[index];
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
        return new ImmutableArrayList(temp);
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
        return new ImmutableArrayList(temp);
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
        return this.elements.length;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return this.elements.length == 0;
    }

    @Override
    public Object[] toArray() {
        Object [] temp = new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        return temp;
    }
}
