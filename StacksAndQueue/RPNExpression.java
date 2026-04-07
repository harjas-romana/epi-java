package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class RPNExpression {
    
    public static int evaluate(String expression) {

        Deque<Integer> stack = new ArrayDeque<>();
        String[] tokens = expression.split(",");

        for(String token : tokens) {
            token = token.trim();

            if(token.length() == 1 && "+-*/".contains(token)) {

                int y = stack.pop();
                int x = stack.pop();

                switch (token.charAt(0)) {
                    case '+' : stack.addFirst(x+y);
                    case '-' : stack.addFirst(x-y);
                    case '*' : stack.addFirst(x*y);
                    case '/' : stack.addFirst(x/y);
                    default : throw new IllegalArgumentException("Malformed RPN");
                }

            } else {
                stack.addFirst(Integer.parseInt(token));
            }
        }
        return stack.removeFirst();
    }
}
