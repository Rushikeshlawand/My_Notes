import java.util.Scanner;

public class XifElse {
    public static void main(String[] args) {
        System.out.print("Enter ur Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("U can vote");
        } else {
            System.out.println("U cant vote");
        }
    }
}