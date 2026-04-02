package Strings;

import java.util.ArrayList;
import java.util.List;

public class GetValidIPAddresses {
    
    public static List<String> ValidIPAddress(String s) {
        
        List<String> resultantIPAddress = new ArrayList<>();

        for(int i = 0; i < 4 && i < s.length(); ++i) {
            String firstPart = s.substring(0,i);

            if(isValidPart(firstPart)) {
                
                for(int j = i; j < 4 && j < s.length(); ++j) {
                    String secondPart = s.substring(i,i+j);

                    if(isValidPart(secondPart)) {

                        for(int k = i+j; k < 4 && k < s.length(); ++k) {
                            String thirdPart = s.substring(i+j, i+j+k);
                            String fourthPart = s.substring(i+j+k);

                            if(isValidPart(thirdPart) && isValidPart(fourthPart)) {
                                resultantIPAddress.add(firstPart+"."+secondPart+"."+thirdPart+"."+fourthPart);
                            }
                        }
                        
                    }
                }
            }
        }
        return resultantIPAddress;
    }

    private static boolean isValidPart(String str) {

        if(str.length() > 3) {
            return false;
        }

        if(str.startsWith("0") && str.length() > 1) {
            return false;
        }

        int valueInInteger = Integer.parseInt(str);

        return valueInInteger <= 255 && valueInInteger >= 0;
    }
}
