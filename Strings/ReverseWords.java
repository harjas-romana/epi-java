package Strings;

public class ReverseWords {
    
    public static void reverseWordsCode(char[] inputArray) {

        reverse(inputArray, 0, inputArray.length-1);

        int start = 0;

        for(int end = 0; end < inputArray.length-1; ++end) {

            if(inputArray[end] == ' ') {
                reverse(inputArray, start, end-1);
                start = end + 1;
            }
        }
        reverse(inputArray, start, inputArray.length-1);
    }

    private static void reverse(char[] arr, int start, int end) {

        while ( start < end ) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
