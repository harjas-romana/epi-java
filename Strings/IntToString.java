package Strings;

public class IntToString {
    
    public static String intToString(int x) {

        boolean isNegative = false;

        StringBuilder sb = new StringBuilder();

        if(x < 0) {
            isNegative = true;
        }
        do {
            sb.append( (char) '0' + Math.abs(x % 10));
            x /= 10;
        } while (x != 0);

        if(isNegative) {
            sb.append('-');
        }

        sb.reverse();

        return sb.toString();
    }
}
