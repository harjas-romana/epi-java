package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueWithMaxAPI {
    
    public Queue<Integer> queue = new ArrayDeque<>();
    public Deque<Integer> maxQueue = new ArrayDeque<>();

    public void enqueue(Integer x) {
        queue.add(x);

        while(!maxQueue.isEmpty() && maxQueue.peekFirst() < x) {
            maxQueue.removeLast();
        }
        maxQueue.addLast(x);
    }

    public Integer dequeue() {
        if(queue.isEmpty()) {
            throw new IllegalArgumentException("Invalid");
        }

        Integer res = queue.remove();

        if(res.equals(maxQueue.peekFirst())) {
            maxQueue.removeFirst();
        }
        return res;
    }
}
// Time complexity is O(1)
// Space complexity is O(N)