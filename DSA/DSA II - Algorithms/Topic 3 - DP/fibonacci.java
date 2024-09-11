public class fibonacci {
    static int fibonacciS(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciS(n - 1) + fibonacciS(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 13;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciS(i) + " ");
        }
    }
}