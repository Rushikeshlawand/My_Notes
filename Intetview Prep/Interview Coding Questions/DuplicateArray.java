//1. Write a program to remove duplicates from any array ?
import java.util.ArrayList;
import java.util.List;

public class DuplicateArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 4, 4, 5 };
        int[] uniqueArr = removeDuplicates(arr); // We call the removeDuplicates method with the array arr as an
                                                 // argument. This method will return an array uniqueArr with duplicates
                                                 // removed.

        System.out.println("Array without duplicates: ");

        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>(); // We create an ArrayList named list to store unique elements from the
                                                // input array arr.

        for (int num : arr) { // We iterate through each element num in the input array arr. For each element:
            if (!list.contains(num)) { // We check if list already contains the element num using list.contains(num).
                list.add(num); // If num is not already in list, we add it to list using list.add(num). This
                               // ensures that only unique elements are added to list.

            }
        }
        int[] uniqueArr = new int[list.size()]; // After all unique elements are added to list, we create a new integer
                                                // array uniqueArr with size equal to list.size().
        for (int i = 0; i < list.size(); i++) { // We iterate through list using a for loop.
            uniqueArr[i] = list.get(i); // For each element in list, we retrieve the element using list.get(i) and
                                        // assign it to uniqueArr[i].
        }
        return uniqueArr;
    }
}