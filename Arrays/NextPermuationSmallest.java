package Arrays;

import java.util.Collections;
import java.util.List;

public class NextPermuationSmallest {
    
    public static List<Integer> nextSmallestPermutation(List<Integer> A) {

        int k = A.size() - 2;

        while( k >= 0 && A.get(k) > A.get(k+1)) {
            --k;
        }

        if(k == -1) {
            return Collections.emptyList();
        }

        for(int i = A.size()-1; i > k; --i) {

            if(A.get(i) > A.get(k)) {
                Collections.swap(A,k,i);
                break;
            }
        }

        Collections.reverse(A.subList(k+1, A.size()));
        return A;
    }
}
