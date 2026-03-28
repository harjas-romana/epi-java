package Arrays;

import java.util.List;

public class CanReachEnd {
    
    public static boolean canReadEndCode(List<Integer> maxSteps) {

        int furtherReach = 0, lastIndex = maxSteps.size()-1;

        for(int i = 0; i <= furtherReach && furtherReach < lastIndex; ++i) {
            furtherReach = Math.max(furtherReach, i + maxSteps.get(i));
        }

        return furtherReach >= lastIndex;
    }
}
// Time complexity is O(N)
// Space complexity is O(1)