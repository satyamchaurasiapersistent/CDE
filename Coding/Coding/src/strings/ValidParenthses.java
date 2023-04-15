package strings;

import java.util.Stack;

public class ValidParenthses {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> parenthesischkr = new Stack<>();
        boolean flag = true;

        for (Character c : s.toCharArray()) {
            if (c.equals('(')) {
                parenthesischkr.push(')');
            } else if (c.equals('{')) {
                parenthesischkr.push('}');
            } else if (c.equals('[')) {
                parenthesischkr.push(']');
            } else if (parenthesischkr.isEmpty() || parenthesischkr.pop() != c) {
                System.out.println("Not Valid Parentheses.");
                flag = false;
                break;
            }
        }
        if (parenthesischkr.isEmpty() && flag) {
            System.out.println("Valid Parentheses.");

        }
    }

}

