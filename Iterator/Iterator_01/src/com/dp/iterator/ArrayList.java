package com.dp.iterator;

public class ArrayList implements Collection {
    Object[] objects = new Object[10];
    int index = 0;

    @Override
    public void add(Object object) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = object;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    public Iterator iterator(){
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator{
        private int currentIndex = 0;

        @Override
        public Object next() {
            Object object = objects[currentIndex];
            currentIndex++;
            return object;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }
    }
}
