package Arrays;

public class Exercise2 {
    public static void main(String []args ) {


        // initialization and declaration of the array and value to find, and also the identifier boolean
        int[] numbers = {9, 8, 10, 14, 1};
        int find = 1;
        boolean found = false;
        
        // for loop to search the int array for the value, breaks if found and declares boolean "found" true
        for (int i = 0; i < numbers.length;i++) {
            if (numbers[i] == find) {
                found = true;
                break;
            } 
        }
        
        // if else statement to print out whether the file was found or not
        if (found) {
            System.out.println("Number " + find + " found.");
        } else {
            System.out.println("NUmber " + find + " was not found.");
        }

    }
    
}
