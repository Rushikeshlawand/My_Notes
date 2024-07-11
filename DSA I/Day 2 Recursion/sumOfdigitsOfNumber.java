public class sumOfdigitsOfNumber {
    public static int result(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number % 10 + result(number / 10);
        }
    }
    public static void main(String[] args) {
        int[] array = { 334644 };
        int result = result(array[0]);
        System.out.println(result);
    }
}