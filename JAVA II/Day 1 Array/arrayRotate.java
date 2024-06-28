import java.util.Scanner;
class arrayRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.print("Enter the number of right rotations: ");
        int rotations = scanner.nextInt();
        rotations = rotations % n;
        for (int i = 0; i < rotations; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("Array after right rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

//Initialization:
//
//    Initialize an array arr with elements {1, 2, 3, 4, 5}.
//    Get the length of the array n, which is 5.
//
//Input:
//
//    Prompt the user to enter the number of right rotations using Scanner.
//    Read and store this value in rotations.
//
//Adjustment:
//
//    Calculate rotations = rotations % n to handle cases where rotations is greater than the array length.
//
//Rotation Process:
//
//    Perform rotations right rotations on the array:
//        For each rotation:
//            Store the last element of the array (arr[n - 1]) in last.
//            Shift all elements one position to the right using a loop.
//            Place the stored last element at the beginning of the array (arr[0]).
//
//Output:
//
//    Print the rotated array elements using a loop, showing the array after all rotations.