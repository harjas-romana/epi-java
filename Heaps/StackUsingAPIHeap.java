package Heaps;

import java.util.PriorityQueue;

public class StackUsingAPIHeap {

    public static class ValueWithIndex {
        int value;
        int timeTicket;

        ValueWithIndex(int value, int timeTicket) {
            this.value = value;
            this.timeTicket = timeTicket;
        }
    }

    public static PriorityQueue<ValueWithIndex> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.timeTicket, a.timeTicket));
    static int timeTicket = 0;

    public static void insert(int value) {
        heap.add(new ValueWithIndex(value, timeTicket++));
    }

    public static int remove() {

        return (heap.isEmpty()) ? -1 : heap.poll().value;
    }

    public static int peek() {

        if (heap.isEmpty())
            throw new IllegalArgumentException("Invalid");

        return heap.peek().value;
    }
}
