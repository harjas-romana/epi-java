package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumerateAllPrimes {
    
    public static List<Integer> enumerateAllPrimesTillN(int n) {

        List<Integer> result = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n+1, true));

        isPrime.set(0, false);
        isPrime.set(1, false);

        for(int i = 2; i <= n; ++i) {

            if(isPrime.get(i)) {
                result.add(i);

                for(int j = i; j <= n; j += i) {
                    isPrime.set(j, false);
                }
            }
        }
        return result;
    }
}

// Time complexity is O(N log (log N));
// Space complexity is O(N);