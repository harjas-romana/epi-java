package Strings;

public class RunLenghEncoding {
    
    public static String decode(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = 0; i < s.length(); ++i) {

            if(Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i) - '0');
            } else {

                while(count > 0) {
                    sb.append(s.charAt(i));
                    count--;
                }

            }
        }
        return sb.toString();
    }

    public static String encode(String s) {

        if(s == null) return "";

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 1; i <= s.length(); ++i) {

            if(i == s.length() || s.charAt(i) != s.charAt(i-1)) {
                sb.append(count);
                sb.append(s.charAt(i));
            } else {
                ++count;
            }
        }
        return sb.toString();
    }
}

// Time complexity is O(N)
// Space complexity is O(N)