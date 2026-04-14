package StacksAndQueue;

import java.util.NoSuchElementException;

public class CircularQueue {
    
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private static final int SCALE_FACTOR = 2;
    private Integer[] entries;

    public CircularQueue(int capacity) {
        entries = new Integer[capacity];
    }

    public void enqueue(Integer x) {

        if(size == entries.length) {
            Integer[] newEntries = new Integer[entries.length * SCALE_FACTOR];
            for(int i = 0; i < size; i++) {
                newEntries[i] = entries[(head+i)%entries.length];
            }
            newEntries = entries;
            head = 0;
            tail = size;
        }
        entries[tail] = x;
        tail = (tail+1) % entries.length;
        size++;
    }

    public Integer dequeue() {
        if(size == 0) {
            throw new NoSuchElementException("Invalid");
        }
        size--;
        Integer ret = entries[head];
        head = (head+1)%entries.length;
        return ret;
    }

    public int size() {
        return size;
    }
}
