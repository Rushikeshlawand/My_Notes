import java.util.Scanner;

public class XMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks ");
        int Marks = sc.nextInt();

        if (Marks >= 91 && Marks<=100) {
            System.out.println("A+");
        } else if (Marks >= 81 && Marks <= 90) {
            System.out.println("A");
        } else if (Marks >= 71 && Marks <= 80) {
            System.out.println("B+");
        } else if (Marks >= 61 && Marks <= 70) {
            System.out.println("B");
        } else if (Marks >= 51 && Marks <= 60) {
            System.out.println("C");
        } else if(Marks<100) {
            System.out.println("fail");
        }
        else{
            System.out.println("Marks Incorrect");
        }
    }
}