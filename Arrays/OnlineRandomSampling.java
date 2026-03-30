package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class OnlineRandomSampling {
    
    public static List<Integer> onlineRandomSampling(Iterator<Integer> sequence, int k) {

        List<Integer> runningSamples = new ArrayList<>();

        for(int i = 0; sequence.hasNext() && i < k; ++i) {
            runningSamples.add(sequence.next());
        }

        int numSeenSoFar = k;
        Random r = new Random();

        while(sequence.hasNext()) {

            Integer x = sequence.next();
            ++numSeenSoFar;

            final int idxToReplace = r.nextInt(numSeenSoFar);

            if(idxToReplace < k) {
                runningSamples.set(idxToReplace, x);
            }
        }
        return runningSamples;
    }
}

// Time complexity is O(N)
// Space complexity is O(k)