package Heaps;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MediumOfOnlineData {

    public static void mediumOfOnlineData(Iterator<Integer> seq) {

        // min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        while (seq.hasNext()) {

            int currNum = seq.next();

            if (minHeap.isEmpty() || currNum >= minHeap.peek()) {
                minHeap.add(currNum);
            } else {
                maxHeap.add(currNum);
            }

            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.add(minHeap.poll());
            } else {
                minHeap.add(maxHeap.poll());
            }

            double medium;

            if (minHeap.size() == maxHeap.size()) {
                medium = 0.5 * (minHeap.peek() + maxHeap.peek());
            } else {
                medium = minHeap.poll();
            }

            System.out.println("Curr Med: " + medium);
        }
    }
}
