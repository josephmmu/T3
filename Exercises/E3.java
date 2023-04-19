package Exercises;
import java.util.*;

public class E3 {
    public static void main(String [] args) {

        int[] arr = new int[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five integer values to fill the array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value #" + (i+1) + " : ");
            arr[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0;i < arr.length;i++) {
            sum += arr[i];
            
        }

        System.out.println("The sum of the array's values is : " + sum);
        input.close();
    }
    
}
