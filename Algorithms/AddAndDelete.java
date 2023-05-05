package Algorithms;

import java.util.ArrayList;

public class AddAndDelete {

    ArrayList<Integer> list;

    public AddAndDelete() {
        list = new ArrayList<Integer>();
    }

    public static void main (String [] args) {
        
        AddAndDelete list = new AddAndDelete();

        System.out.println(list.add(1));
        System.out.println(list.add(2));
        System.out.println(list.remove(2));
        System.out.println(list.add(3));
    


      
    }

    public String add(int value) {

        if (!list.contains(value)) {
            return "Value " + value + " has been added";
        } else { 
            return "Value " + value + " is already present in the list.";
        }

    }

    public String remove(int value) {

        if (list.contains(value)) {
            list.remove(value);
            return "Value " + value + " has been removed.";
        } else {
            return "Value " + value + " does not exist.";
        }
    } 



    
 
    
}
