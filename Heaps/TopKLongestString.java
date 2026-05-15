package Heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLongestString {
    public List<String> topK(int k, Iterator<String> iter) {

        PriorityQueue<String> heap = new PriorityQueue<>(k, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        while (iter.hasNext()) {
            heap.add(iter.next());

            if (heap.size() > k) {
                heap.poll();
            }

        }
        return new ArrayList<>(heap);
    }
}

// Time complexity is O(Nlog k)
// Space complexity is O(k)
