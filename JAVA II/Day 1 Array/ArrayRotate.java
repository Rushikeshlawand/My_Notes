import java.util.Scanner;
class ArrayRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = { 2, 3, 3, 4, 5, 5, 5 };
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
