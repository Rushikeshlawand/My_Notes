public class Array {
    public static void main(String[] args) {
        // Static initialization
        int[] staticArray = {1, 2, 3, 4, 5};

        // Dynamic initialization
        int[] dynamicArray = new int[5]; // Array of 5 integers

        // Assigning values to the dynamic array
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i + 1;
            System.out.println(dynamicArray);
        }
    }
}