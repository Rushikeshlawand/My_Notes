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
        if (Subtotal > 50.00) {
            double discount = Subtotal * 0.10;
            Subtotal -= discount;
        }

        if (QMainCourse > 0 && QDessert > 0) {
            double dessertDiscount = TotalDessert * 0.20;
            TotalDessert -= dessertDiscount;
        }
        double totalBill = Subtotal;

        System.out.println("\nBill Details:");
        System.out.println("Subtotal:  " + Subtotal);

        // Display discounts if applied
        if (Subtotal != totalBill) {
            System.out.println("Discount applied:  " + (Subtotal - totalBill));
        }

        System.out.println("Total Bill: "+ totalBill);
    }
}