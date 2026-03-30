package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    
    public static List<Integer> spiralMatrixSolution(List<List<Integer>> matrix) {

        final int[][] SHIFT = {{0,1},{0,-1},{1,0},{-1,0}};

        int dir = 0, row = 0, col = 0;
        List<Integer> spiralOrder = new ArrayList<>();
        int n = matrix.size();

        for(int i = 0; i < n; ++i) {

            spiralOrder.add(matrix.get(row).get(col));
            matrix.get(row).set(col,0);

            int nextRow = row + SHIFT[dir][0];
            int nextCol = col + SHIFT[dir][1];

            if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || matrix.get(nextRow).get(nextCol) == 0) {

                dir = (dir + 1) % 4;

                nextRow = row + SHIFT[dir][0];
                nextCol = col + SHIFT[dir][1];
            }
            row = nextRow;
            col = nextCol;
        }
        return spiralOrder;
    }
}
