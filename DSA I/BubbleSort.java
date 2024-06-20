public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {599, 20, 40, 10, 30};

        // Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Printing sorted array
        System.out.println("Sorted array: " + java.util.Arrays.toString(array));
    }
}
