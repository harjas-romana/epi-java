package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class MaxStack {
    // Helper class to store a maximum value and how many times it appears consecutively
    private static class MaxWithCount {
        public int max;
        public int count;

        public MaxWithCount(int max, int count) {
            this.max = max;
            this.count = count;
        }
    }

    // Main stack holds the actual numbers
    private Deque<Integer> elementStack = new ArrayDeque<>();
    // Auxiliary stack holds the history of maximums
    private Deque<MaxWithCount> cachedMaxStack = new ArrayDeque<>();

    public boolean empty() {
        return elementStack.isEmpty();
    }

    public int max() {
        if (empty()) throw new IllegalStateException("max(): empty stack");
        return cachedMaxStack.peekFirst().max;
    }

    public int pop() {
        if (empty()) throw new IllegalStateException("pop(): empty stack");
        
        int popElement = elementStack.removeFirst();
        
        // If the element we are popping is the current max, we must decrement its count
        if (popElement == cachedMaxStack.peekFirst().max) {
            cachedMaxStack.peekFirst().count--;
            
            // If the count hits 0, that maximum is completely gone. Remove it!
            if (cachedMaxStack.peekFirst().count == 0) {
                cachedMaxStack.removeFirst();
            }
        }
        return popElement;
    }

    public void push(int x) {
        elementStack.addFirst(x);
        
        if (cachedMaxStack.isEmpty() || x > cachedMaxStack.peekFirst().max) {
            // We found a brand new maximum! Add it to the aux stack.
            cachedMaxStack.addFirst(new MaxWithCount(x, 1));
        } else if (x == cachedMaxStack.peekFirst().max) {
            // We pushed a duplicate of the current max. Just increment the count.
            cachedMaxStack.peekFirst().count++;
        }
        // If x is less than the current max, we do nothing to the aux stack!
    }
}
// Time complexity of push(), pop(), max(), and empty() is O(1) because we are using stacks to store the elements and the maximums.
// Space complexity is O(N) in the worst case when all elements are the same and we have to store the count of each maximum in the auxiliary stack. In general, it can be less