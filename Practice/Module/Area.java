package Module;

import java.util.Scanner;

public class Area {

    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        obj.setDim(length,breadth);
        double area=obj.getArea();
       System.out.println("The area of reactangle is: "+ area);
    }
}