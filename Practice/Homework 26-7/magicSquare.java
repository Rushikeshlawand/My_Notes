
import java.util.Scanner;

public class magicSquare {

    public static void main(String[] args) {

//        7. Given a matrix, check whether it’s Magic Square or not. A Magic Square is a n x
//        n matrix of the distinct elements from 1 to n2 where the sum of any row, column,
//        or diagonal is always equal to the same number.
//                Examples:
//        Input : n = 3
//        2 7 6
//        9 5 1
//        4 3 8
//        Output : Magic matrix
//        Explanation:In matrix sum of each
//        row and each column and diagonals sum is
//        same = 15.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        boolean ans = true;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (i == 0)
                    sum += arr[i][j];

            }
        }
// Checking for rows;
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                check += arr[i][j];
            }
        if(check != sum)
            ans = false;
        check = 0;
        }
        // checking for column
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                check += arr[j][i];
            }
            if(check != sum)
                ans = false;
            check = 0;
        }
        // checking for diagonal
        for(int i = 0 ; i < arr.length ; i++){
            check += arr[i][i];
        }
        if(check != sum){
            ans = false;
        }
        check = 0;
        for(int i = 0 ; i < arr.length ; i++){
            check += arr[i][arr.length - 1 - i];
        }
        if(check != sum){
            ans = false;
        }
        check = 0;
        System.out.println(ans);
    }
}
