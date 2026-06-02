package Searching;

import java.util.List;

public class EntryEqualToIndex {

    public static int searchEntryEqualToItsIndex(List<Integer> A) {
        int left = 0;
        int right = A.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A.get(mid) == mid) {
                // WE FOUND IT!
                return mid;
            }
            // 1. The value has outpaced the index. The answer must be to the left.
            else if (A.get(mid) > mid) {
                // Steer Left
                right = mid - 1;
            }
            // 2. The value is lagging behind. The answer must be to the right.
            else {
                // Steer Right
                left = mid + 1;
            }
        }

        // Target not found
        return -1;
    }
}
