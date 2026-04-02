package Strings;

public class FirstOccuranceOfSubstring {
    
    public static int rabinKarpAlgorithm(String t, String s) {

        if(t.length() < s.length()) {
            return -1;
        }

        final int BASE = 26;
        int tHash = 0;
        int sHash = 0;
        int powerS = 1;

        for(int i = 0; i < s.length(); i++) {
            tHash = tHash * BASE + t.charAt(i);
            sHash = sHash * BASE + s.charAt(i);
            powerS = (i > 0) ? powerS * BASE : 1;
        }

        for(int i = s.length(); i < t.length(); i++) {

            if(tHash == sHash && t.substring(i-s.length(),i).equals(s)) {
                return i - s.length();
            }

            tHash -= t.charAt(i - s.length()) * powerS;
            tHash = tHash * BASE + t.charAt(i);

            if(tHash == sHash && t.substring(t.length() - s.length()).equals(s)) {
                return t.length() - s.length();
            }
        }
        return -1;
    }
}

// Time complexity is O(N+M)
// Space complexity is O(1)