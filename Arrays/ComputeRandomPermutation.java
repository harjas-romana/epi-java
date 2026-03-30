package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ComputeRandomPermutation {
    
    public static List<Integer> computeRandomPermutation(int n) {

        List<Integer> A = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            A.add(i);
        }

        Random r = new Random();

        for(int i = 0; i < n; ++i) {
            int randomIndex = i+ r.nextInt(n-i);
            Collections.swap(A, i, randomIndex);
        }
        return A;
    }
}

// Time complexity is O(N)
// Space complexity is O(1)