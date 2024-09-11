import java.util.Arrays;

public class arrayMerged {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 6, 7, 8 };
        int n = array1.length;
        int m = array2.length;

        int[] merged = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            merged[k++] = array1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = array2[i];
        }
        Arrays.sort(merged);
        int total = merged.length;

        if (total % 2 == 1) {
            System.out.println(merged[total / 2]);
        } else {
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            System.out.println((middle1 + middle2) / 2.0);
        }
    }
}
