import java.util.HashSet;

public class sumOfTwoElements {
    public static void main(String[] args) {
        HashSet<Integer> std = new HashSet<>();

        int arr[] = { 0, 11, 6, 4, 5, 3, 2, 4, 6, 10 };
        int key = 10;
        for (int i = 0; i < arr.length; i++) {
            int res = key - arr[i - 1];
            if (std.contains(res)) {
                System.out.println(res + " " + arr[i]);
            }
            std.add(arr[i]);
        }
    }
}
