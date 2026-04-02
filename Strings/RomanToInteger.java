package Strings;

public class RomanToInteger {
    
    public static int romanToIntegerCode(String roman) {

        int sum = romanChar(roman.charAt(roman.length()-1));

        for(int i = roman.length()-2; i >= 0; --i) {
            char curr = romanChar(roman.charAt(i));
            char right = romanChar(roman.charAt(i+1));

            if(curr < right) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }
    private static char romanChar(char c) {

        switch (c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}
