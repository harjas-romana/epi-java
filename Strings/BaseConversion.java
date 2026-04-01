package Strings;

public class BaseConversion {
    
    public static String baseConversionCode(String numAsString, int b1, int b2) {

        boolean isNegative = numAsString.startsWith("-");
        int numAsInt = 0;

        int startIndex = (isNegative ? 1 : 0);

        for(int i = startIndex; i < numAsString.length(); ++i) {

            numAsInt *= b1;
            char c = numAsString.charAt(i);

            numAsInt += Character.isDigit(c) ? c - '0' : c - 'A' + 10;
        }

        if(numAsInt == 0) {
            return "0";
        }

        return (isNegative ? "-" : "" ) + constructFromBase(numAsInt, b2);
    }

    private static String constructFromBase(int numAsInt, int b2) {

        if(numAsInt == 0) {
            return "";
        }

        int remainder = numAsInt % b2;

        char nextDigit = (char) (remainder >= 10 ? 'A' + remainder - 10 : '0' + remainder);

        return constructFromBase(numAsInt/b2, b2) + nextDigit;
    }
}

// Time complexity is O(M+N)] where N is length of input string, M is length of output string
// Space complexity is O(M)