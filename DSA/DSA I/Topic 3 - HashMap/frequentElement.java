import java.util.HashMap;
import java.util.Map;

public class frequentElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> std = new HashMap<>();
        int arr[] = { 10, 20, 10, 30, 40, 50 };
        for (int i : arr) {
            if (std.containsKey(i)) {
                int fre = std.get(i);
                fre++;
                std.put(i, fre);
            } else {
                std.put(i, 1);
            }
        }

        System.out.println(std);
        int max = 0, res = -1;
        for (Map.Entry<Integer, Integer> stdd : std.entrySet()) {
            if (stdd.getValue() > max) {
                max = stdd.getValue();
                res = stdd.getKey();
            }
        }
        System.out.println(res);
    }
}