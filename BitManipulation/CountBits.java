package BitManipulation;

public class CountBits {

    public static int countBits( int n ) {

        if (n == 0) return 0;
        int numOfBits = 0;

        while( n != 0 ) {
            numOfBits++;
            n = n & (n - 1);
        }
        return numOfBits;
    }

}
// Time Complexity is O(K) where K is the no. of 1s
// Space Complexity is O(1) as we are using only constant space to store the count of bits.