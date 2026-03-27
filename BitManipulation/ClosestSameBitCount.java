package BitManipulation;

public class ClosestSameBitCount {

    static final int NUM_SIGNED_BITS = 63;

    public static long sameBitCount(long x) {

        for(int i = 0; i < NUM_SIGNED_BITS-1; ++i) {

            if(((x>>>i)&1) != ((x>>>(i+1))&1)) {

                long bitMask = (1L << i) | (1L << (i+1));
                x ^= bitMask;

                return x;
            }
        }
        throw new IllegalArgumentException("All are either 1 or 0");
    }
}

// Time complexity is O(N)
// Space complexity is O(1)