package Strings;

public class RandomStringProblem {
    public static String randomString(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            char c = (char)('a' + (int)(Math.random() * 26));
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = 10; // Length of the random string
        String randomStr = randomString(n);
        System.out.println("Random String of length " + n + ": " + randomStr);
    }
}
// Time complexity is O(N) where N is the length of the string
// Space complexity is O(N) for the StringBuilder and the resulting string.