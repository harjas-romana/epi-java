package Heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedArrays {

    private static class ArrayEntry {
        public Integer value;
        public Integer arrayId;

        public ArrayEntry(Integer value, Integer arrayId) {
            this.value = value;
            this.arrayId = arrayId;
        }
    }

    public static List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays) {

        List<Iterator<Integer>> iters = new ArrayList<>(sortedArrays.size());
        for (List<Integer> array : sortedArrays) {
            iters.add(array.iterator());
        }

        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(sortedArrays.size(),
                (a, b) -> Integer.compare(a.value, b.value));

        for (int i = 0; i < iters.size(); i++) {
            if (iters.get(i).hasNext()) {
                minHeap.add(new ArrayEntry(iters.get(i).next(), i));
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            ArrayEntry headEntry = minHeap.poll();
            result.add(headEntry.value);

            int beltId = headEntry.arrayId;

            if (iters.get(beltId).hasNext()) {
                minHeap.add(new ArrayEntry(iters.get(beltId).next(), beltId));
            }
        }
        return result;
    }
}
