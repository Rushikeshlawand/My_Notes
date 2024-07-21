import java.util.Scanner;

public class Garments {

    String gCode;
    String gType;
    int gSize;
    String gFabric;
    float gPrice;

    Garments() {
        gCode = "Not Allowed";
        gType = "Not Allowed";
        gFabric = "Not Allowed";
        gPrice = 0;
        gSize = 0;
    }

    void Assing() {

        if (gFabric.equals("Cotton")) {
            if (gType.equals("Trouser")) {
                gPrice = 1300f;
            } else {
                gPrice = 1100f;
            }
        } else {
            if (gType.equals("Shirt")) {
                gPrice = 1300- (1300f * 10 / 100);
            } else {
                gPrice = 1100-(1100f * 10 / 100);
            }
        }
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        gCode = sc.next();
        gType = sc.next();
        gSize = sc.nextInt();
        gFabric = sc.next();
        Assing();
    }

    void Dispay() {
        System.out.println(gCode);
        System.out.println(gType);
        System.out.println(gSize);
        System.out.println(gFabric);
        System.out.println(gPrice);
    }

    public static void main(String[] args) {
        Garments obj = new Garments();
        obj.Input();
        obj.Dispay();
    }
}

// Define a class Garments with the following description :
// ■ Members are : GCode of type String, GType of type String, GSize of type
// integer,
// GFabric of type string, GPrice of type float.
// ■ Member functions :
// ■ A function Assign() which calculates and assigns the value of GPrice as
// follows:
// ■ For the value of GFabric “COTTON”,
// GType GPrice
// Trouser 1300
// Shirt 1100
// ■ For GFabric other than “COTTON” the above mentioned GPrice gets reduced by
// 10%.
// ■ A constructor to assign initial values of GCode, GType and GFabric with the
// word
// “Not Allowed” and GSize and GPrice with 0.
// ■ A function Input() to input the values of the data members GCode, Gtype,
// GSize
// and GFabric and invoke the Assign() function.
// ■ A function Display() which displays the content of all the data members for
// a
// Garment