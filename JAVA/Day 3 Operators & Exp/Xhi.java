import java.util.Scanner;

public class Xhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("addition is: " + (a + b));
        System.out.println("Substraction is: "+ (a - b));
        System.out.println("Multiplication is: " + (a * b));
        System.out.println("Dividation is: "+ (a / b));
        System.out.println("Remainder is: "+ (a % b));
    }
}