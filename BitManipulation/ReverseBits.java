package BitManipulation;

public class ReverseBits {
    
    public static long reverseBits(long x) {

        long result = 0;

        for(int i = 0; i < 64; ++i) {

            result |= (x&1);
            x >>>= 1;
        }
        return result;
    }
}

// Time complexity is O(size of long);