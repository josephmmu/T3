package Exercises;
public class E2 {
    public static void main(String [] args) {
        
        int[] arr = {3, 7, 12, 6, 18};

        int valueToCheck = 6; 

        boolean containsValue = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToCheck) {
                containsValue = true;
                break;
            }
        }

        if (containsValue) {
            System.out.println("The array contains the value " + valueToCheck);
        } else {
            System.out.println("The array does not contain the value " + valueToCheck);
        }

    }
}
