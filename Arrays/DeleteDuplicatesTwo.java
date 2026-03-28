package Arrays;

import java.util.List;

public class DeleteDuplicatesTwo {
    
    public static int deleteDuplicatesTwo(List<Integer> A) {

        if(A.size() <= 2) {
            return A.size();
        }

        int writeIndex = 2;

        for(int i = 2; i < A.size(); ++i) {

            if(!A.get(writeIndex-2).equals(A.get(i))) {
                A.set(writeIndex++, A.get(i));
            }
        }
        return writeIndex;
    }
}
