public class fibonaciiArray {
    static int[] Fib(int n) {
        int fib[] = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static void main(String[] args) {
        int fibArr[] = Fib(14);
        System.out.println(fibArr[2]);
        System.out.println(fibArr[6]);
        System.out.println(12);
    }
}
