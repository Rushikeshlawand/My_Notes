import java.util.Scanner;

public class XOperators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean voter=true;
        int age=19;

        System.out.println("addition is: " + (a + b));
        System.out.println("Substraction is: "+ (a - b));
        System.out.println("Multiplication is: " + (a * b));
        System.out.println("Dividation is: "+ (a / b));
        System.out.println("Remainder is: "+ (a % b));

        
        // Relational Operator
        System.out.println("a>b " + (a > b));
        System.out.println("a<b " + (a < b));
        System.out.println("a==b " + (a == b));
        System.out.println("a!=b " + (a != b));
        System.out.println("a<=b " + (a <= b));
        System.out.println("a>=b " + (a >= b));

        //logical op
        System.out.println(voter==true && age>=18);
        System.out.println(voter==true || age>=18);
        System.out.println(!true);
    }
}