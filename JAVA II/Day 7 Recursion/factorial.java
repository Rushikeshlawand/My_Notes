public class factorial {
    static int fact(int x) {
        if (x == 1)
            return 1;
        return x * fact(x - 1);
    }
    public static void main(String[] args) {
        int num = fact(5);
        System.out.println("Factorial is: "+num);
    }
}