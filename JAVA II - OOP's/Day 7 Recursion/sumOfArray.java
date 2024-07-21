public class sumOfArray {
    public static int sum(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sum(array, index + 1);
    }
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4395796, 235 };
        int sums = sum(array, 0);
        System.out.println(sums);
    }
}