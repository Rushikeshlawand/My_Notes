// Given a matrix, check whether it’s Magic Square or not. A Magic Square is a n x
// n matrix of the distinct elements from 1 to n2 where the sum of any row, column,
// or diagonal is always equal to the same number.
// Examples:
// Input : n = 3
// 2 7 6
// 9 5 1
// 4 3 8
// Output : Magic matrix
// Explanation:In matrix sum of each
// row and each column and diagonals sum is
// same = 15.
// Input : n = 3
// 1 2 2
// 2 2 1
// 2 1 2
// Output : Not a Magic Matrix
// Explanation:In matrix sum of each
// row and each column and diagonals sum is
// not same.

public class Magic {

    // Function to check if the matrix is a magic square
    public static boolean isMagicSquare(int[][] matrix, int n) {
        if (matrix == null || n <= 0) {
            return false;
        }

        int magicSum = 0;
        int sumDiagonal1 = 0, sumDiagonal2 = 0;

        // Calculate the sum of the first row to use as the reference sum
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }

        // Check if the sum of all rows is the same
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        // Check if the sum of all columns is the same
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        // Calculate the sum of the two diagonals
        for (int i = 0; i < n; i++) {
            sumDiagonal1 += matrix[i][i];
            sumDiagonal2 += matrix[i][n - 1 - i];
        }

        // Check if the diagonal sums are equal to the reference sum
        if (sumDiagonal1 != magicSum || sumDiagonal2 != magicSum) {
            return false;
        }

        // Check if the matrix contains all distinct elements from 1 to n^2
        boolean[] distinctCheck = new boolean[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = matrix[i][j];
                if (value < 1 || value > n * n || distinctCheck[value]) {
                    return false;
                }
                distinctCheck[value] = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        
        int[][] matrix2 = {
            {1, 2, 2},
            {2, 2, 1},
            {2, 1, 2}
        };

        System.out.println("Matrix 1 is " + (isMagicSquare(matrix1, 3) ? "a Magic Matrix" : "Not a Magic Matrix"));
        System.out.println("Matrix 2 is " + (isMagicSquare(matrix2, 3) ? "a Magic Matrix" : "Not a Magic Matrix"));
    }
}
