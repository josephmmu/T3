package Algorithms;

public class Insertion {
    public static void main(String [] args) {

        // declaration of the integer array unsorted and integer variable hold
        int[] unsorted = {9,10,16,5,1,3,20,15,7};
        int hold;
        
        // for loop to
        for (int r = 1; r < unsorted.length;r++) {
            int l = r - 1;
            hold = unsorted[r];

            while ((l > -1) && unsorted[l] > hold) {             
                unsorted[l+1] = unsorted[l];
                l--;  
            }   
        
            for (int p = 0; p < unsorted.length;p++){
                
                System.out.println( unsorted[p]);
            }

            unsorted[l+1] = hold;
        }

        

    } 
    
}
