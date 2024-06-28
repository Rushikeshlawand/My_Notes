import java.util.Scanner;

public class GretestOfThreeNum {

        static int salary(int salaryAmount) {
            if (salaryAmount > 20000 && salaryAmount < 40000)
                return salaryAmount;
            return 0;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the salary: ");
            int salaryAmount=sc.nextInt();
        System.out.println(salaryAmount+ " true");
        }
}