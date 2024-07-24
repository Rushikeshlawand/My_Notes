public class arrayAscendingOrder {
    public static void main(String[] args) {
        int[] array = { 24, 88, 8, 54, 3, 2, 357, 8, 9 };
        int n = array.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {  //for descending just changes the oper
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
