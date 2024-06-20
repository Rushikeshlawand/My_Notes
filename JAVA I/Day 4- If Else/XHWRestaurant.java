import javax.xml.transform.Source;
import java.util.Scanner;

public class XHWRestaurant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Menu Card
        double Starter=5.00;
        double MainCourse=10.00;
        double Dessert=4.50;
        double Drinks=2.50;

        System.out.print("Enter quantity of starter:  ");
        int QStarter=sc.nextInt();

        System.out.print("Enter quantity of Main Course:  ");
        int QMainCourse=sc.nextInt();

        System.out.print("Enter quantity of Dessert:  ");
        int QDessert=sc.nextInt();

        System.out.print("Enter quantity of Drinks:  ");
        int QDrinks=sc.nextInt();

        double TotalStarterCost=Starter*QStarter;
        double TotalMainCourse=MainCourse*QMainCourse;
        double TotalDessert=Dessert*QDessert;
        double TotalDrinks=Drinks*QDrinks;

        double Subtotal=TotalStarterCost+TotalMainCourse+TotalDessert+TotalDrinks;
        double Total=0;
        double TToal=0;

        if (QMainCourse > 0 && QDessert > 0) {
            Total=Subtotal*20/100;
            System.out.println("After applying 20% discount, The final amount is:  "+ (Subtotal-Total));
        }else if (Subtotal > 50.00) {
            TToal=Subtotal*10/100;
            System.out.println("After applying 10% Discount,The final amount is: "+ (Subtotal-TToal));
        }else
        System.out.println("thank u");
    }
}