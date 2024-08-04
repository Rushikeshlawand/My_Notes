Reverse an Array: Write a Java program to reverse the elements of an array.

        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }


int[] numbers = {1, 2, 3, 4, 5};

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }


Rotate an Array to the Right by a Given Number of Steps

        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2; // Number of steps to rotate

        int n = numbers.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = numbers[i]; 	//0+2%5=2
        }







