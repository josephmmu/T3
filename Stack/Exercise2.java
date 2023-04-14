package Stack;

import java.util.Stack;

public class Exercise2 {
    public static void main(String [] args) {
        Stack<String> names = new Stack<>();

        // pushes the names in the "names" stack
        names.push("Alice");
        names.push("BOB");
        names.push("Charlie");

        // while the names stack is not empty, assigns the name that will be popped into a string that will be printed out
        while (!names.isEmpty()) {
            String name = names.pop();
            System.out.println(name);
        }
    }
}
