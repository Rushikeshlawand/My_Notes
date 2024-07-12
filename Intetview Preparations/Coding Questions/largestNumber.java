import java.util.Arrays;

public class largestNumber {
    public static void main(String[] args) {
        int[] array = { 99,88,77,66,55,44,33};
        int max = array[0];

        for (int i = 1; i < array.length; i++) { // Method 2
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum number is: " + max);

        int maxx = Arrays.stream(array).max().getAsInt(); // Method 2
        System.out.println("Maximum number is: " + maxx);

        Arrays.sort(array);     //Method 3
        if (array.length >= 5) {
            System.out.println("5th largest number is: "+array[array.length - 5]);
        } else {
            System.out.println("array does not have 5 elements");
        }
    }
}