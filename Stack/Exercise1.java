package Stack;

import java.util.Stack;

public class Exercise1 {
    public static void main(String [] args) {

        // declaration of string values 
        String parentheses1 = "((()))";
        String parentheses2 = "(()())";
        String parentheses3 = "(()";
        String parentheses4 = "())";

        // prints out boolean value
        System.out.println(balance(parentheses1));
        System.out.println(balance(parentheses2));
        System.out.println(balance(parentheses3));
        System.out.println(balance(parentheses4));
        
    }

    public static boolean balance (String parentheses) {

        
        Stack<Character> chara = new Stack<>();

        // for loop to push opening parentheses, and pops it out if closing parentheses is detected. 
        // returns true if stack "chara" is empty
        // when the closing parentheses is detected, returns false, if it detects that the stack "chara" is empty or does not have a opening parentheses in the stack
        for (int p = 0; p < parentheses.length();p++) {

            char ch = parentheses.charAt(p);

            if (ch == ')') {
                if (chara.isEmpty() || chara.peek() != '(') {
                    return false;
                } else {
                    chara.pop();
                }
            } else if (ch == '(') {
                chara.push(ch); 
            }
        }

        return chara.isEmpty();
    }
    
}
