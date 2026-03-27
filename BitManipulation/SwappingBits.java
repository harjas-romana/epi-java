package BitManipulation;

public class SwappingBits {

    public static long swapBits(long x, int i, int j) {

        if(((x >>> i) & 1) != ((x >>> j) & 1)) {

            long bitMask = (1L << i) | (1L << j);
            x ^= bitMask;
        }
        return x;
    }
    
}
// Time complexity is O(1);