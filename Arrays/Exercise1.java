package Arrays;

public class Exercise1 {
    public static void main(String [] args) {

        // initialization of the array and sum variable
        int[] numbers = {25,4,16,9,10};
        int sum = 0;

        // f or loop to sum up all the numbers
        for (int i = 0; i < numbers.length;i++) {

            sum += numbers[i];

        }

        // prints out the sum
        System.out.println(sum);
    }
    
}
