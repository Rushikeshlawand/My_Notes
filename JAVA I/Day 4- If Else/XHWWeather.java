//You're developing a weather recommendation program that suggests activities based
//on the current temperature. Implement a Java program using if-else statements to
//provide recommendations as follows:
// If the temperature is below 10°C, recommend skiing.
// If the temperature is between 10°C and 20°C (inclusive), recommend hiking.
// If the temperature is between 20°C and 30°C (inclusive), recommend cycling.
// If the temperature is above 30°C, recommend swimming.
import java.util.Scanner;

public class XHWWeather {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temprature of outside: ");
        int Temp=sc.nextInt();

        if (Temp<=10){
            System.out.print("You should do skiing");
        } else if (Temp>=10 && Temp<=20) {
            System.out.print("You should go for hiking");
        } else if (Temp>=20 && Temp<=30) {
            System.out.print("You should go for cycling");
        }else {
            System.out.println("you should go for swimming");
        }
    }
}
