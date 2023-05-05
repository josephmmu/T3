package Algorithms;

public class Bubble {
    public static void main (String [] args) {

        // integer array to hold unsorted integers and variable to hold onto numbers
        int[] jumbledInt = {4,1,6,9,5,7,2} ;
        int hold;

        // for loop to bubble sort
        for (int i = 0; i < jumbledInt.length;i++) {
            for (int f = i + 1; f < jumbledInt.length; f++) {
            
                if (jumbledInt[i] > jumbledInt[f]) {
                    hold = jumbledInt[i];
                    jumbledInt[i] = jumbledInt[f];
                    jumbledInt[f] = hold;
                }
            }

        }

        // for loop to print array
        for (int i = 0; i < jumbledInt.length; i++) {
            System.out.println(jumbledInt[i]);
        }

    }
}
