import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        // Create a hash set
        HashSet<String> hashSet = new HashSet<>();

        // Add elements
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Check if an element is in the set
        System.out.println(hashSet.contains("banana"));  // Output: true
        System.out.println(hashSet.contains("grape"));   // Output: false

        // Remove an element
        hashSet.remove("apple");
        System.out.println(hashSet);  // Output: [banana, orange]

        // Adding duplicate elements does nothing
        hashSet.add("banana");
        System.out.println(hashSet);  // Output: [banana, orange]
    }
}
