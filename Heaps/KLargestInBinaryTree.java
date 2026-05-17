package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestInBinaryTree {

    public static class HeapEntry {
        int value;
        int index;

        HeapEntry(int value, int index) {
            this.value = value;
            this.index = index;
        }

    }

    public static List<Integer> kLargestCode(List<Integer> A, int k) {

        PriorityQueue<HeapEntry> candidateHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.value, a.value));

        List<Integer> res = new ArrayList<>();

        candidateHeap.add(new HeapEntry(A.get(0), 0));

        for (int i = 0; i < k; i++) {

            HeapEntry winner = candidateHeap.poll();
            res.add(winner.value);

            int winnerIdx = winner.index;
            int leftWinnerIdx = 2 * winnerIdx + 1;
            int rightWinnerIdx = 2 * winnerIdx + 2;

            if (leftWinnerIdx < A.size()) {
                candidateHeap.add(new HeapEntry(A.get(leftWinnerIdx), leftWinnerIdx));
            }

            if (rightWinnerIdx < A.size()) {
                candidateHeap.add(new HeapEntry(A.get(rightWinnerIdx), rightWinnerIdx));
            }

        }
        return res;
    }
}
