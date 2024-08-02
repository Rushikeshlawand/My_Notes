import java.util.HashMap;

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
    }
}
