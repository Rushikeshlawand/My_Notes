import java.util.Scanner;
public class XHWFine {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of days the book is overdue: ");
            int daysOverdue = scanner.nextInt();

            double fine = 0.0;

            if (daysOverdue <= 7) {
                fine = 0.0;
            } else if (daysOverdue <= 30) {
                fine = 1.00 * (daysOverdue - 7);
            } else {
                fine = 1.00 * 23 + 2.00 * (daysOverdue - 30);
            }
            if (fine > 0) {
                System.out.println("The fine for %d days overdue is: "+ daysOverdue + fine);
            } else {
                System.out.println("No fine for returning within 7 days.");
            }
        }
    }