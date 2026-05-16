package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortZigZag {

    public static List<Integer> sortKIncreasingDecreasingArray(List<Integer> A) {
        List<List<Integer>> sortedSubarrays = new ArrayList<>();

        // We assume the first segment starts by going UP.
        boolean isIncreasing = true;
        int startIdx = 0;

        // ==========================================================
        // YOUR MISSION: Write the loop that iterates through array 'A'.
        // ==========================================================

        for (int i = 1; i <= A.size(); i++) {

            // QUESTION 1: What is the `if` condition that tells us to make a cut?
            // (Hint: There are 3 distinct reasons you might need to make a cut.
            // One involves reaching the end, one involves a peak, and one involves a
            // valley).
            if (i == A.size() || (isIncreasing && A.get(i - 1) > A.get(i))
                    || (!isIncreasing && A.get(i) > A.get(i - 1))) {

                // QUESTION 2: How do you extract the piece from startIdx to i?
                List<Integer> subList = new ArrayList<>(A.subList(startIdx, i));

                // QUESTION 3: If the trend was decreasing, how do you flip the sublist?
                if (!isIncreasing) {
                    // subList = A.subList(startIdx, i).reversed();
                    Collections.reverse(subList);
                }

                // Save it to our collection
                sortedSubarrays.add(subList);

                // QUESTION 4: Reset your variables for the next piece of paper!
                startIdx = i;
                isIncreasing = !isIncreasing;
            }
        }

        // Pass the $K$ perfectly sorted lists to the master algorithm from 11.1!
        return MergeSortedArrays.mergeSortedArrays(sortedSubarrays);
    }
}
