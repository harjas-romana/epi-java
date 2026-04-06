package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class BuildingWithSunsetView {
    private class Building {
        @SuppressWarnings("unused")
        int idx;
        int height;

        Building(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }

    public Deque<Building> computerBuildingsWithSunsetView(Iterator<Integer> sequence) {
        int buildingIndex = 0;
        Deque<Building> stack = new ArrayDeque<>();

        while(sequence.hasNext()) {
            int currHeight = sequence.next();

            while(!stack.isEmpty() && stack.peekFirst().height <= currHeight) {
                stack.removeFirst();
            }
            stack.addFirst(new Building(buildingIndex++, currHeight));
        }
        return stack;
    }
}
// TIme complexity is O(N)
// Space complexity is O(N)