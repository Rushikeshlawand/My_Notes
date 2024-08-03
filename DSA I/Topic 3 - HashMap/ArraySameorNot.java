import java.util.HashMap;

public class ArraySameorNot {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hmm = new HashMap<>();

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 2, 4, 1, 3 };

        for (int i : arr1) {
            hm.put(i, 1);
        }
        for (int j : arr2) {
            hmm.put(j, 1);
        }
        if (hm.equals(hmm)) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}
