public class powerOfNumber {
    public static int power(int num, int power) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return num;
        } else {
            return num * power(num, power - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int power = 4;
        int result = power(num, power);
        System.out.println(result);
    }
}