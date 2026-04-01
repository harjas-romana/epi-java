package Strings;
//  ReplaceAndRemove.java
//  
//
//  Created by Harjas Partap Singh Romana on 4/1/26.
//

import java.util.List;

public class ReplaceAndRemove {
    
    public static int replaceAndRemoveCode(List<Character> A, int size) {
        
        int writeIdx = 0;
        int aCount = 0;
        
        for(int i = 0; i < size; ++i) {
            
            if(A.get(i) != 'b' ) {
                A.set(writeIdx++, A.get(i));
            }
            
            if(A.get(i) == 'a') {
                ++aCount;
            }
        }
        
        int currIdx = writeIdx - 1;
        writeIdx = writeIdx + aCount - 1;
        final int finalSize = writeIdx + 1;
        
        while(currIdx >= 0) {
            
            if(A.get(currIdx) == 'a') {
                A.set(writeIdx--, 'd');
                A.set(writeIdx--, 'd');
            } else {
                A.set(writeIdx--, A.get(currIdx));
            }
            --currIdx;
        }
        return finalSize;
    }
}
