import java.util.Scanner;

public class multiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = i + j;
                System.out.println(array[i][j] + " ");
                // count += array[i][j];
            }
            System.out.println();
        }
        System.out.println("/////////////////");

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.println(array[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
