package Heaps;

import java.util.Iterator;
import java.util.PriorityQueue;

public class SortAlmostSorted {

    public static void sortApproximatelySortedData(Iterator<Integer> sequence, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // ==========================================================
        // MISSION 1: THE WARM-UP
        // Add the first 'k' elements from the sequence into the heap.
        // (Careful: Make sure to check that the sequence actually has next elements!)
        // ==========================================================
        for (int i = 0; i < k; i++) {
            if (sequence.hasNext()) {
                minHeap.add(sequence.next());
            }
        }

        // ==========================================================
        // MISSION 2: THE MAIN PIPELINE
        // As long as the sequence has more numbers:
        // 1. Add the next number from the sequence to the heap.
        // 2. Extract the smallest number from the heap and print it.
        // ==========================================================

        // Write your loop here...
        while (sequence.hasNext()) {
            minHeap.add(sequence.next());

            int num = minHeap.poll();
            System.out.println("Smallest: " + num);
        }

        // ==========================================================
        // MISSION 3: THE CLEANUP
        // The sequence is completely empty, but the heap still has 'k' numbers trapped
        // inside!
        // Extract and print them one by one until the heap is empty.
        // ==========================================================

        // Write your loop here...

        while (!minHeap.isEmpty()) {
            System.out.println("Smallest: " + minHeap.poll());
        }
    }
}
