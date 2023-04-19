package Exercises;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StoreQueue {

    public static void main(String [] args) {

        Queue<String> line = new LinkedList<>();

        Scanner input = new Scanner(System.in);

        boolean done = false;

        while (!done) {
            System.out.print("Enter a command (join, serve, exit) : ");
            String command = input.nextLine();

            switch (command) {
                case "join":
                System.out.print("Enter you name: ");
                String name = input.nextLine();

                line.add(name);

                System.out.println(name + " has joined the queue.");
                break;

                case "serve":
                if (line.isEmpty()) {
                    System.out.println("No one is in the line.");
                } else {
                    String next = line.remove();

                    System.out.println(next + " has been served.");
                }
                break;

                case "exit":
                System.out.println("Exiting program.");

                done = true;
                break;

                default:
                System.out.println("Invalid command.");
            }

        }
        input.close();

    }
    
}
