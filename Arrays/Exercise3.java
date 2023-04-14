package Arrays;

import java.util.*;
public class Exercise3 {
    
    public static void main(String [] args) {

        // declaration of Scanner input
        Scanner input = new Scanner(System.in);

        // intialization of int array variable with a set size, and sum variable
        int[] numbers = new int[5];
        int sum = 0;

        // for loop that asks for an input and also sums the values added into the array
        for (int i = 0; i < numbers.length;i++) {
            System.out.print("Input a integer: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // prints out sum
        System.out.println("Total Sum: " + sum);

    }

}
