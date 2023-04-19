package Exercises;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String [] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Original List: " + fruits);

        fruits.addFirst("Orange");

        System.out.println("List after adding orange: " + fruits);

        fruits.remove(2);

        System.out.println("List after removing an element: " + fruits);

        String element = fruits.get(1);
        System.out.println("Element at index 1: " + element);

        int size = fruits.size();
        System.out.println("Size of the list " + size);
        

    }
}
