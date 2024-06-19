import java.util.Scanner;
public class Xlogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UserId = sc.nextInt();
        int pass = sc.nextInt();

        if (UserId == 123) {
            if (pass == 321) {
                System.out.println("login success");
            } else {
                System.out.println("pass wrong");
            }
        } else {
            System.out.println("Userid wrong");
        }
    }
}