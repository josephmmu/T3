package Exercises;
import java.util.Stack;

public class StackExample {

    public static void main(String [] args) {

        Stack<String> names = new Stack<>();

        names.push("Alice");
        names.push("Bob");
        names.push("Charlie");

        while(!names.isEmpty()) {
            String popped = names.pop();
            System.out.println(popped);
        }

        System.out.println(names.isEmpty());
 
    }
    
}
