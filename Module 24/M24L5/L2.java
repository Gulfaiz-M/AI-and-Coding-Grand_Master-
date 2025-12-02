// The Collections framework is defined in the java.util package
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> animals = new ArrayList<>();

        // Add elements
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");

        System.out.println("============= Printing Current Array ============");
        System.out.println(animals);

        // Clear all elements
        animals.clear();
        System.out.println("============= Printing Cleared Array ============");
        System.out.println("Empty Array : " + animals);

        // Check if empty
        if (animals.isEmpty()) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Array is not empty");
        }

        // Add elements again
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");

        // Check size
        System.out.println("The size of Array: " + animals.size());

        // Add another element
        animals.add("Dog");
        System.out.println("After adding Dog: " + animals);

        // Remove element at index 2
        animals.remove(2);
        System.out.println("After removing element at index 2: " + animals);
    }
}
