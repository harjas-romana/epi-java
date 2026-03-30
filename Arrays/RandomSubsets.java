package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomSubsets {
    
    public static List<Integer> randomSubsets(int n, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        Random r = new Random();
        
        for(int i = 0; i < k; ++i) {

            int rIdx = i + r.nextInt(n-i);


            int ptr1 = map.getOrDefault(rIdx, rIdx);
            int ptr2 = map.getOrDefault(i,i);

            map.put(rIdx, ptr2);
            map.put(i, ptr1);
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < k; ++i) {
            result.add(map.get(i));
        }
        return result;
    }
}
