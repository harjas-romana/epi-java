package Searching;

public class IntegerSquareRoot {

    public static int squareRoot(int k) {
        // Upgrade to 64-bit integers to prevent the overflow crash
        long left = 0;
        long right = k;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long midSquared = mid * mid;

            if (midSquared <= k) {
                // The square is too small, or exactly equal.
                // Steer right to see if we can find an even bigger one!
                left = mid + 1;
            } else {
                // The square is too big. Steer left!
                right = mid - 1;
            }
        }

        // When left crosses right, left is exactly 1 step too high.
        return (int) left - 1;
    }
}
