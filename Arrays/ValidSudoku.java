package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidSudoku {
    
    public static boolean ValidSudokuCode(List<List<Integer>> partialAssignment) {

        int n = partialAssignment.size();

        for(int i = 0; i < n; ++i) {
            if(hasDuplicate(partialAssignment, i, i+1, 0, n)){
                return false;
            }
        }
        
        for(int j =0; j < n; ++j) {
            if(hasDuplicate(partialAssignment, 0, n, j, j+1)) {
                return false;
            }
        }

        int regionSize = (int) Math.sqrt(n);

        for(int I = 0; I < regionSize; ++I) {
            for(int J = 0; J < regionSize; ++J) {
                if(hasDuplicate(partialAssignment, regionSize*I, regionSize*(I+1), regionSize*J, regionSize*(J+1))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasDuplicate(List<List<Integer>> partialAssignment, int startRow, int endRow, int startCol, int endCol) {

        List<Boolean> isPresent = new ArrayList<>(Collections.nCopies(partialAssignment.size()+1, false));

        for(int i = startRow; i < endRow; ++i) {
            for(int j = startCol; j < endCol; ++j) {

                int val = partialAssignment.get(i).get(j);
                if(isPresent.get(val)) {
                    return true;
                }
                isPresent.set(val, true);
            }
        }
        return false;
    }
}
