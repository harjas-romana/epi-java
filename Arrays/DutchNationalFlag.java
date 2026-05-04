package Arrays;

import java.util.Collections;
import java.util.List;

enum Color {
    RED, WHITE, BLUE
}

public class DutchNationalFlag {

    public static void DNFSolution(List<Color> A, int pivotIndex) {

        Color pivot = A.get(pivotIndex);

        int smaller = 0, equal = 0, larger = A.size();

        while (equal < larger) {

            if (A.get(equal).ordinal() < pivot.ordinal()) {
                Collections.swap(A, smaller++, equal++);
            } else if (A.get(equal).ordinal() == pivot.ordinal()) {
                ++equal;
            } else {
                Collections.swap(A, equal, --larger);
            }
        }
    }
}
