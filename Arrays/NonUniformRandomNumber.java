package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NonUniformRandomNumber {
    
    public static int NonUniformRandomNumberCode(List<Integer> values, List<Double> prob) {
        
        List<Double> A = new ArrayList<>();
        A.add(0,(double) 0);

        for(double p : prob) {
            double lastSum = A.get(A.size()-1);
            A.add(lastSum+p);
        }

        Random r = new Random();

        final double uniform01 = r.nextDouble();

        int it = Collections.binarySearch(A, uniform01);

        if(it < 0) {
            int insertionPoint = Math.abs(it) - 1;
            int intervalIdx = insertionPoint - 1;
            return values.get(intervalIdx);
        } else {
            return values.get(it);
        }
    }
}

// Time complexity is O(N)
// Space complexity is O(N)