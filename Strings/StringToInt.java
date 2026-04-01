package Strings;

public class StringToInt {
    
    public static int stringToInteger(String s) {

        final int startIndex = (s.charAt(0) == '-' ? 1 : 0);
        int result = 0;

        for(int i = startIndex; i < s.length(); ++i) {

            final int digit = s.charAt(i) - '0';
            result = result*10 + digit;

        }
        return s.charAt(0) == '-' ? -result : result;
    }
}
