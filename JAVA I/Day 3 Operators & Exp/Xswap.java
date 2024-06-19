public class Xswap {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("After swap a= " + (c - a)+", value of b=  " + (c - b));

        // without using 3rd variable
        a = a + b;
        b = a - b; 
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}