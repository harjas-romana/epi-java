package Searching;

import java.util.List;

public class FirstOccuranceOfK {

    public static int searchFirstOfK(List<Integer> A, int k) {
        int left = 0;
        int right = A.size() - 1;

        // This will hold the index of the first occurrence we've seen so far.
        int result = -1;

        while (left <= right) {
            // 1. Calculate the midpoint safely!
            int mid = left + (right - left) / 2;

            if (A.get(mid) > k) {
                // The target is smaller, so search the left half
                right = mid - 1;
            } else if (A.get(mid) < k) {
                // The target is bigger, so search the right half
                left = mid + 1;
            } else {
                // WE FOUND IT! (A.get(mid) == k)

                // 2. Record this index as our best answer so far
                result = mid;

                // 3. Force the binary search to keep checking the LEFT half
                // for an even earlier occurrence!
                right = mid - 1;
            }
        }

        return result;
    }
}
