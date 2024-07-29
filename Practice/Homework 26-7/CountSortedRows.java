public class CountSortedRows {

    private static boolean isStrictlyIncreasing(int[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] >= row[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Function to check if a row is sorted in strictly decreasing order
    private static boolean isStrictlyDecreasing(int[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] <= row[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Function to count all sorted rows in the matrix
    public static int countSortedRows(int[][] matrix) {
        int count = 0;

        for (int[] row : matrix) {
            if (isStrictlyIncreasing(row) || isStrictlyDecreasing(row)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {4, 3, 1, 2, 6},
            {8, 7, 6, 5, 4},
            {5, 7, 8, 9, 10}
        };

        int result = countSortedRows(matrix);
        System.out.println("Number of sorted rows: " + result);
    }
}
