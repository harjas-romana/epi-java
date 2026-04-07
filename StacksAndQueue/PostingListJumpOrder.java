package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostingListJumpOrder {
    
    public static void setJumpOrder(PostListNode n) {
        Deque<PostListNode> stack = new ArrayDeque<>();

        stack.push(n);

        while(!stack.isEmpty()) {
            PostListNode curr = stack.removeFirst();

            if(curr != null && curr.count == -1 ) {
                curr.count = count++;

                stack.pushFirst(curr.next);
                stack.pushFirst(curr.jump);
            }
        }
    }
}
// Time complexity is O(N)
// Space complexity is O(1)