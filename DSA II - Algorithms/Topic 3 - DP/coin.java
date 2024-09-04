public class coin {
    public static int rec(int sum, int[] narray, int index) {
        if (sum == 0) {
            return 1;
        }
        if (sum < 0 || index < 0) {
            return 0;
        }
        int count = 0;
        count += rec(sum - narray[index], narray, index);
        count += rec(sum, narray, index - 1);
        return count;
    }

    public static void main(String[] args) {
        int sum = 4;
        int[] narray = {1, 2, 3};
        int result = rec(sum, narray, narray.length - 1);
        System.out.println(result);
    }
}
