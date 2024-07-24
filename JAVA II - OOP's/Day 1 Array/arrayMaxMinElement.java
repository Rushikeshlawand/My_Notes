public class arrayMaxMinElement {
    int max;
    int min;

    void maxAndMin(int[] array) {
        max = array[0];
        min = array[0];
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
    }

    public static void main(String[] args) {
        arrayMaxMinElement obj = new arrayMaxMinElement();
        int[] array = { 1, 2, 4, 5, 6, 433, 2, 2, 34, 66 };
        obj.maxAndMin(array);
        System.out.println(obj.max + "  " + obj.min);
    }
}
