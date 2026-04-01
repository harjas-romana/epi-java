package Strings;
//  ValidPalindrome.java
//  
//
//  Created by Harjas Partap Singh Romana on 4/1/26.
//

public class ValidPlaindrome {
    
    public static boolean isValidPalindrome(String A) {
        
        int i = 0, j = A.length() - 1;
        
        while ( i < j ) {

            while ( i < j && !Character.isLetterOrDigit(A.charAt(i))) {
                ++i;
            }

            while( i < j && !Character.isLetterOrDigit(A.charAt(j))) {
                --j;
            }

            if( Character.toLowerCase(A.charAt(i)) != Character.toLowerCase(A.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}

// Time complexity is O(N)
// Space complexity is O(1)