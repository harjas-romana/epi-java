package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArbitraryPrecisionMultiply {
    
    public static List<Integer> arbitraryPrecisionMultiplySolution(List<Integer> A, List<Integer> B) {

        if(A.get(0) == 0 || B.get(0) == 0) {
            return Arrays.asList(0);
        }

        final int sign = A.get(0) < 0 ^ B.get(0) < 0 ? -1 : 1;

        List<Integer> result = new ArrayList<>(Collections.nCopies(A.size()+B.size(), null));

        for(int i = A.size()-1; i >= 0; --i) {
            for(int j = B.size()-1; j >= 0; --j) {

                result.set(i+j+1, result.get(i+j+1)+A.get(i)*B.get(j));

                result.set(i+j, result.get(i+j+1)/10);

                result.set(i+j+1, result.get(i+j+1)%10);
            }
        }

        int firstNonZero = 0;
        while(firstNonZero < result.size() && result.get(firstNonZero) == 0) {
            ++firstNonZero;
        }

        result = result.subList(firstNonZero, result.size());
        result.set(0, result.get(0)*sign);

        return result;
    }
}
