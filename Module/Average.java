package Module;

import java.util.Scanner;
public class Average {
    int number1;
    int number2;
    int number3;

    void calculate(int number1, int number2, int number3) {
        int result = (number1 + number2 + number3) / 3;
        System.out.println("result is: "+result);
    }
    public static void main(String[] args) {
        Average obj = new Average();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:" );
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        obj.calculate(number1, number2, number3);
    }
}