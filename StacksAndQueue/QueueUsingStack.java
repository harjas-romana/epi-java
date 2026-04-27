package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStack {
    
    public Deque<Integer> enq = new ArrayDeque<>();

    public Deque<Integer> deq = new ArrayDeque<>();

    public void enqueue(Integer x) {
        enq.addFirst(x);
    }

    public Integer dequeue() {

        if(deq.isEmpty()) {
            while(!enq.isEmpty()) {
                deq.addFirst(enq.removeFirst());
            }
        }

        if(deq.isEmpty()) {
            throw new IllegalArgumentException("Invalid");
        }
        return deq.removeFirst();
    }
}

// Time complexity is O(1)
// Space complexity is O(N)