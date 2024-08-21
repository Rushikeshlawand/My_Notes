public class Insertionsort {
    public static void main(String[] args) {
        int[] array = { 4, 55, -22, 26 };

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}