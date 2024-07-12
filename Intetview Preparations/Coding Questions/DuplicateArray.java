public class duplicateArray {
    public static void main(String[] args) {
        int[]array={1,1,1,2,2,3};
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.print(array[i] + " ");
                while (i < array.length - 1 && array[i] == array[i + 1]) {
                    i++;
                }
            }
        }
    }
}