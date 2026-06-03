package Searching;

import java.util.List;

/**
 * Chapter 12: Binary Search Master Patterns
 * This class compiles the core search templates and edge-case defenses.
 */
public class BinarySearchPatterns {

    /**
     * Pattern 1: Find First Occurrence (The Left-Steering Pattern)
     * Trap Defeated: Built-in library duplicate ambiguity.
     */
    public static int searchFirstOfK(List<Integer> A, int k) {
        int left = 0, right = A.size() - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents Integer Overflow

            if (A.get(mid) > k) {
                right = mid - 1;
            } else if (A.get(mid) < k) {
                left = mid + 1;
            } else {
                result = mid; // Record candidate
                right = mid - 1; // Steer left to find earlier duplicates
            }
        }
        return result;
    }

    /**
     * Pattern 2: Find Peak Element (The Mountain Pattern)
     * Trap Defeated: Array Out of Bounds (by not using mid-1) and Stepping off the
     * peak.
     */
    public static int findPeakElement(List<Integer> A) {
        int left = 0, right = A.size() - 1;

        // Notice: left < right (No equals sign, stops exactly on the peak)
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (A.get(mid) < A.get(mid + 1)) {
                left = mid + 1; // Trail goes up, peak is to the right
            } else {
                right = mid; // Trail goes down, we might be STANDING on the peak
            }
        }
        return left;
    }

    /**
     * Pattern 3: Real Square Root (The Continuous Pattern)
     * Trap Defeated: Infinite loops caused by floating-point precision.
     */
    public static double realSquareRoot(double x) {
        double left = x < 1.0 ? 0.0 : 1.0;
        double right = x < 1.0 ? 1.0 : x;
        double tolerance = 0.000001; // Precision boundary

        // Keep squeezing until the window is microscopic
        while ((right - left) > tolerance) {
            double mid = left + (right - left) / 2.0;
            double midSquared = mid * mid;

            if (midSquared < x) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    /**
     * Pattern 4: 2D Matrix Pathfinding (The Top-Right Trick)
     * Trap Defeated: O(M*N) time limit and Off-By-One boundary crashes.
     */
    public static boolean searchMatrix(List<List<Integer>> matrix, int target) {
        if (matrix == null || matrix.isEmpty())
            return false;

        int row = 0;
        int col = matrix.get(0).size() - 1; // 0-indexed safety

        // Safe boundaries (Inclusive of the 0th column!)
        while (row < matrix.size() && col >= 0) {
            int current = matrix.get(row).get(col);

            if (current == target) {
                return true;
            } else if (current < target) {
                row = row + 1; // Steer Down
            } else {
                col = col - 1; // Steer Left
            }
        }
        return false;
    }
}
