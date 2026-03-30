package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    
    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        for(int i  = 0; i < numRows; ++i) {

            List<Integer> currRow = new ArrayList<>();

            for(int j = 0; j <= i; ++j) {
                currRow.add((0 < j && j < i) ? result.get(i-1).get(j-1) + result.get(i-1).get(j) : 1);
            }
            result.add(currRow);
        }
        return result;
    }
}
