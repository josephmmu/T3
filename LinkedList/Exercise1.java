package LinkedList;

// import the linkedlist class
import java.util.LinkedList;

public class Exercise1 {
    public static void main(String [] args) {

        // intialization of the fruits linkedlist
        LinkedList<String> fruits = new LinkedList<String>();

        // adding the strings that were required.
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        
        // printing original list
        System.out.println("Original List: " + fruits);

        // adding orange
        fruits.addFirst("Orange");

        // printing fruits Linkedlist after addition
        System.out.println("List after addition: " + fruits);

        // removing an element in the linkedlist
        fruits.remove(3);   

        // printing out list
        System.out.println("List after removal: " + fruits);

        // printing out a specific element in the list, and the size of the list
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

    }
    
}
