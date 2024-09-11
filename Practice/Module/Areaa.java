package Module;

import java.util.Scanner;

public class Areaa {
    private int l;
    private int b;

    void returnArea(int l, int b) {
        this.l = l;
        this.b = b;
        int area = l * b;
        System.out.println("Area is: " + area);
    }
    public static void main(String[] args) {
        Areaa obj = new Areaa();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        obj.returnArea(l, b);
    }
}