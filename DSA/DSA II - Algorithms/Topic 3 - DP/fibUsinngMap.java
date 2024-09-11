import java.util.HashMap;
import java.util.Map;

public class fibUsinngMap {
    private static Map<Integer, Integer> map = new HashMap<>();

    static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (!map.containsKey(n)) {
            map.put(n, fib(n - 1) + (n - 2));
        }
        return map.get(n);
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(fib(n));
    }
}
