package Strings;

import java.util.ArrayList;
import java.util.List;

public class ComputeAllMnemonicsForAPhoneNumber {

    public static List<String> generateMnemonics(String phoneNumber) {

        List<String> mnemonics = new ArrayList<>();
        char[] partialMnemonics = new char[phoneNumber.length()-1];

        generateMnemonicsHelper(phoneNumber, 0, partialMnemonics, mnemonics);

        return mnemonics;
    }

    private static final String[] MAPPING = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    private static void generateMnemonicsHelper(String phoneNumber, int digitIdx, char[] partialMnemonics, List<String> mnemonics) {

        if(digitIdx == phoneNumber.length()) {
            mnemonics.add( new String(partialMnemonics));
            return;
        }

        char currDigit = phoneNumber.charAt(digitIdx);
        String letters = MAPPING[currDigit - '0'];

        for(int i = 0; i < letters.length(); ++i) {

            partialMnemonics[digitIdx] = letters.charAt(i);

            generateMnemonicsHelper(phoneNumber, digitIdx + 1, partialMnemonics, mnemonics);
        }
    }
}

// Time complexity is O((4^N) * N)
// Space complexity is O(N)