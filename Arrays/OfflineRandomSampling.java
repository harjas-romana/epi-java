package Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OfflineRandomSampling {
    
    public static void generateRandomSamples(List<Integer> A, int k) {

        Random r = new Random();

        for(int i = 0; i < k; ++i) {

            int randomIndex = i + r.nextInt(A.size() - i);
            Collections.swap(A, i, randomIndex);
        }
    }
}
