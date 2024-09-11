public class minandmax {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 7, 2, 8, 4, 5, 1 };
        int window = 3;
        int number = array.length - window + 1;
        int[] min = new int[number];
        int[] max = new int[number];
        for (int i = 0; i < number; i++) {
            int Min = Integer.MAX_VALUE;
            int Max = Integer.MIN_VALUE;
            for (int j = 0; j < window; j++) {
                int value = array[i + j];
                if (value < Min) {
                    Min = value;
                }
                if (value > Max) {
                    Max = value;
                }
            }
            min[i] = Min;
            max[i] = Max;
        }
        for (int i = 0; i < min.length; i++) {
            System.out.print(min[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + " ");
        }
    }
}