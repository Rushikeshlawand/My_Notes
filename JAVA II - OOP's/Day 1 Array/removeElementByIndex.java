import java.util.Scanner;

public class removeElementByIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int n = array.length;
        System.out.println("Enter the index to remove: ");
        int UserNumber = sc.nextInt();

        if (UserNumber >=n ) {
            System.out.println("this index is not available in array");
        } else {
            for (int i = UserNumber; i < n - 1; i++) {
                array[i] = array[i + 1];
            }

            int[] newArray = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                newArray[i] = array[i];
            }

            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}