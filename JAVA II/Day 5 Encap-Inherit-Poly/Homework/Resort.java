import java.lang.reflect.Member;
import java.util.Scanner;

public class Resort {
    
//     Question : 4. Define a class Resort with the following description:
// ■ Members are : RNo to store Room Number, Name store customer name,
// Charges to store per day charges, Days to store number of days of stay.
// ■ Member functions :
// ■ Compute() to calculate and return Amount as Days * Charges and if the values of
// Days*Charges is more than 11000 then as 1.02*Days*Charges
// ■ Getinfo() A function to enter the content Rno, Name, Charges and Days.
// ■ DispInfo() A function to enter the content Rno, Name, Charges, Days and
// Amount by calling function Compute().

int rNo;
String name;
float charges;
int day;

float Compute(int days , float charges){
     if(days * charges > 11000 ) {
        return 1.20f * days * charges;
     }  
     return days * charges;
}

void Getinfo(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Roll Number ");
    rNo = sc.nextInt();
    System.out.println("name");
    name = sc.next();
    System.out.println("charges");
    charges = sc.nextFloat();
    System.out.println("Days ");
    day = sc.nextInt();
    
    System.out.println( "Total Charges  "+Compute(day, charges));
}

public static void main(String[] args) {
    
    Resort obj = new Resort();

    obj.Getinfo();
}

}
