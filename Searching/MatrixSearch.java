package Searching;

import java.util.List;

public class MatrixSearch {

    public static boolean searchMatrix(List<List<Integer>> matrix, int target) {
        if (matrix == null || matrix.isEmpty())
            return false;

        // 1. Set your starting position at the TOP-RIGHT corner.
        int row = 0;
        int col = matrix.get(0).size() - 1;

        // 2. What are the safe boundaries for your row and column pointers?
        // Hint: Don't fall off the bottom, and don't fall off the left edge!
        while (row < matrix.size() && col >= 0) {

            int current = matrix.get(row).get(col);

            if (current == target) {
                return true;
            }
            // 3. If the current number is too small, how do you steer?
            else if (current < target) {
                row = row + 1;
            }
            // 4. If the current number is too big, how do you steer?
            else {
                col = col - 1;
            }
        }

        // We fell off the board without finding it.
        return false;
    }
}
