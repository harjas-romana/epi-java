package Searching;

import java.util.List;

public class CyclicallySortedArray {

    // We are finding the index of the Peak element
    public static int findPeakElement(List<Integer> A) {
        int left = 0;
        int right = A.size() - 1;

        // Notice: left < right (No equals sign!)
        // We want the loop to stop exactly when left and right trap the peak.
        while (left < right) {

            int mid = left + (right - left) / 2;

            // Scenario 1: The trail goes UP. Peak is strictly to the right.
            if (A.get(mid) < A.get(mid + 1)) {
                left = mid + 1;
            }
            // Scenario 2: The trail goes DOWN. Peak is here, or to the left.
            else {
                right = mid;
            }
        }

        // The loop breaks when left == right. We trapped the peak!
        return left;
    }
}
