import java.util.Scanner;

public class XNestedIfElseVote {
    public static void main(String[] args) {
        boolean citizen = true;
        boolean voter = true;
        System.out.print("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            if (citizen == true) {
                if (voter == true) {
                    System.out.println("You can vote");
                } else {
                    System.out.println("You don't have a voter ID");
                }
            } else {
                System.out.println("You're not an Indian citizen");
            }
        } else {
            System.out.println("Your age is less than 18");
        }
    }
}