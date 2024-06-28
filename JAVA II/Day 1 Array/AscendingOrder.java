public class AscendingOrder {
    public static void main(String[] args) {
        // Step 1: Initialize the array of numbers
        int[] numbers = {5, 3, 8, 1, 2, 7, 4, 6};

        // Step 2: Sort the array using Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Step 3: Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
