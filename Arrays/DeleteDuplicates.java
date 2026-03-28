package Arrays;

import java.util.List;

public class DeleteDuplicates {
    
    public static int deleteDuplicates(List<Integer> A) {

        if(A.isEmpty()) {
            return 0;
        }

        int writeIndex = 0;

        for(int i = 1; i < A.size(); ++i) {

            if(!A.get(writeIndex-1).equals(A.get(i))) {
                A.set(writeIndex++, A.get(i));

            }
        }
        return writeIndex;
    }
}
// Time Complexity: O(n) where n is the number of elements in the list A.
// Space Complexity: O(1) since we are modifying the list in place and not using
