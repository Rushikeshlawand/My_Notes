public class arraySearchIndex {
    public static void main(String[] args) {
        int[] array = { 876, 765, 564, 99 };
        int target = 99;
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                System.out.println(i);
            }

        }
    }
}
