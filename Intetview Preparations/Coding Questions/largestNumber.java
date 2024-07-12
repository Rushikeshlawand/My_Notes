public class largestNumber {
    public static void main(String[] args) {
        int[] array = { 12, 234, 2, 4, 445, 554, 23, 888 };
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}