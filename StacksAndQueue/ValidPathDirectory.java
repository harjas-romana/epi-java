package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ValidPathDirectory {

    public static String shortlestPath(String path) {
        if(path == null || path.length() == 0) {
            throw new IllegalArgumentException("Invalid");
        }
        Deque<String> stack = new ArrayDeque<>();

        if(path.startsWith("/")) {
            stack.addFirst("/");
        }

        for(String token : path.split("/")) {
            if(token.isEmpty() || token.equals(".")) {
                continue;
            } else if (token.equals("..")) {
                if(stack.isEmpty() || stack.peekFirst().equals("..")) {
                    stack.addFirst("..");
                } else if (stack.peekFirst().equals("/")) {
                    throw new IllegalArgumentException("Invalid operation");
                } else {
                    stack.removeFirst();
                }
            } else {
                stack.addFirst(token);
            }
        }

        StringBuilder sb = new StringBuilder();
        Iterator<String> it = stack.descendingIterator();

        while(it.hasNext()) {
            String dir = it.next();
            sb.append(dir);

            if(!dir.equals("/") && it.hasNext()) {
                sb.append("/");
            }

        }
        return sb.toString();
    }
}
// Time complexity is O(N)
// Space complexity is O(1)