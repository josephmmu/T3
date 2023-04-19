package Exercises;
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String parentheses) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < parentheses.length(); i++ ) {
            
            char c = parentheses.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        

        return stack.isEmpty();
    }

    public static void main(String [] args) {

        String parentheses1 = "((()))";
        String parentheses2 = "(()())";
        String parentheses3 = "(()";
        String parentheses4 = "())";

        System.out.println(isBalanced(parentheses1));
        System.out.println(isBalanced(parentheses2));
        System.out.println(isBalanced(parentheses3));
        System.out.println(isBalanced(parentheses4));
        

    }
    
}
