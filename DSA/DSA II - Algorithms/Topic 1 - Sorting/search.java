import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int low = 0;
        int high = array.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == mid) {
                flag = true;
                break;
            }
            if (array[mid] > target) {
                low = mid - 1;
            } else {
                high = mid + 1;
            }
        }
        if (flag) {
            System.out.println(array[mid]);
        }
    }
}
