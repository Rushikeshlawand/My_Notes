public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9,-1, 3, 2, -1, 4, -1,-1,-1,-1};
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] < n) {
                result[arr[i]] = arr[i];
            }
        }
        System.out.print("Rearranged array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}