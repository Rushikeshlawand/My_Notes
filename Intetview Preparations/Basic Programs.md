## Even or odd
```java
if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
```
## Even or odd without %
```java
if((num&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
```
```java
String numstr=Integer.toString(num);
char lastchar=numstr.charAt(numstr.length()-1);

        if(lastchar=='0' || lastchar=='2' ||lastchar=='4' ||lastchar=='6' ||lastchar=='8'  ){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
```
## Prime Number
### the number who divisible by 1 & the number itself
```java
if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    
```
























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

Find the Second Largest Element in an Array

int[] numbers = {10, 20, 4, 45, 99, 6};

        // If the array has fewer than 2 elements, there can't be a second largest element
        if (numbers.length < 2) {
            System.out.println("Array is too small to have a second largest element.");
            return;
        }

        // Initialize the largest and second largest to the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse through the array
        for (int num : numbers) {
            // If current number is greater than the largest found so far
            if (num > largest) {
                // Update second largest to be the previous largest
                secondLargest = largest;
                // Update largest to be the current number
                largest = num;
            } 
            // If current number is not the largest but greater than the second largest
            else if (num > secondLargest && num != largest) {
                // Update second largest to be the current number
                secondLargest = num;
            }
        }


public class ThirdFourthLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99, 6, 78, 33, 50};

        // If the array has fewer than 4 elements, we can't find the third and fourth largest elements
        if (numbers.length < 4) {
            System.out.println("Array is too small to have third and fourth largest elements.");
            return;
        }

        // Initialize the largest, second largest, third largest, and fourth largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        int fourthLargest = Integer.MIN_VALUE;

        // Traverse through the array
        for (int num : numbers) {
            if (num > largest) {
                // Shift down
                fourthLargest = thirdLargest;
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Shift down
                fourthLargest = thirdLargest;
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != secondLargest && num != largest) {
                // Shift down
                fourthLargest = thirdLargest;
                thirdLargest = num;
            } else if (num > fourthLargest && num != thirdLargest && num != secondLargest && num != largest) {
                fourthLargest = num;
            }
        }

        // Print the results
        System.out.println("Largest Element: " + largest);
        System.out.println("Second Largest Element: " + secondLargest);
        System.out.println("Third Largest Element: " + thirdLargest);
        System.out.println("Fourth Largest Element: " + fourthLargest);
    }
}

Finding the First Unique Element in an Array
int[] numbers = {4, 5, 1, 2, 0, 4};

        // Traverse each element of the array
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;

            // Check if the current element is unique
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }


Find All Pairs with a Given Sum

int[] numbers = {1, 4, 3, 2, 5, 6};
        int targetSum = 7;

        // Flag to check if any pairs are found
        boolean foundPair = false;

        // Traverse each element of the array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // Check if the sum of the current pair equals the target sum
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("Pair with sum " + targetSum + ": (" + numbers[i] + ", " + numbers[j] + ")");
                    foundPair = true;
                }
            }
        }

        Find the Missing Number in a Range

      int[] numbers = {1, 2, 4, 5, 6}; // Example array with a missing number
        int n = numbers.length + 1; // Total count including the missing number

        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }

        // Find the missing number
        int missingNumber = expectedSum - actualSum;
  