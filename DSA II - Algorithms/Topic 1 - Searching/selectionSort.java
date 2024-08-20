public class selectionSort {
    public static void main(String[] args) {
        int[] array = { 7, 2, 5, 3, 6, 4, 1 };
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (array[m] > array[j]) {
                    m=j;
                }
            }
            int temp=array[i];
            array[i]=array[m];
            array[m]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}