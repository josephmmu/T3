package Queue;

// imported vital java classes
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String [] args) {

        // declaration of Queue named line, with LinkedList as type
        Queue<String> line = new LinkedList<>();

        // Scanner declaration named input
        Scanner input = new Scanner(System.in);
        
        boolean menu = false;

            // do while for the queue menu
        do {

            System.out.print("Welcome to the Queue (Join, Order, Leave): ");
            String process = input.nextLine();

            // Switch statement for the program menu
            switch(process) {
                // Allows the user to join the queue, and also provide a name
                case "Join":
                    System.out.print("Enter your name: ");
                    
                    String name = input.nextLine();
                    line.add(name);

                    System.out.println(name + " has joined the line.");
                    break;

                    // removes the head of the queue 
                case "Order":
                    if (line.isEmpty()) {
                        System.out.println("Queue is empty, no on is in the line.");
                    } else {
                        System.out.println(line.poll() + " has been served.");
                        
                    }
                    break;

                // Exists the program
                case "Leave":
                    System.out.println("Exiting the queue.");
                    menu = true;
                    break;

                default:
                System.out.println("Prompt not within the options.");
                break;
            }
        } while (!menu);

        input.close();

    }
    
}
