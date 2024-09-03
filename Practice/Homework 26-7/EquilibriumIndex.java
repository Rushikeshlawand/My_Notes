public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] array = {-1,1,-1,1,-1};

        int total=0;
        int left=0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            total -= array[i];
            
            if (left == total) {
                System.out.println("index: "+i);
                return;
            }
            left += array[i];
        }
    }
}
