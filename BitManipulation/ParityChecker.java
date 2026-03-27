package BitManipulation;

public class ParityChecker {
    
    public static short computeParity(long n) {

        n ^= n >>> 32;
        n ^= n >>> 16;
        n ^= n >>> 8;
        n ^= n >>> 4;
        n ^= n >>>2;
        n ^= n >>> 1;

        return (short) (n & (0x1));
    }
}
// Time complexity is O(long N);