package com.dp.iterator;

public class LinkedList implements Collection{
    Node head = null;
    Node tail = null;
    int size;

    public void add(Object object) {
        Node node = new Node(object, null);
        if (head == null) {
            head = node;
            tail = node;
        }
            tail.setNext(node);
            tail = node;
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

}
