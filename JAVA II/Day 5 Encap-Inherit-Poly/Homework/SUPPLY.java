import java.util.Scanner;
public class SUPPLY {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

 void GetType(String Sticker,String FoodType){
    if (Sticker.equals("Green")) {
       this. FoodType="Vegetarian";        
    }else if (Sticker.equals("Yellow")) {
        this.FoodType="Contains Egg";
    }else if (Sticker.equals("Red") ){
        this.FoodType="Non Vegetarian";
    }else{
        this.FoodType="Unknown";
    }
 }
    public void FoodIn(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the code: ");
        Code=sc.nextInt();

        System.out.println("Enter the food name: ");
        FoodName=sc.next();

        System.out.println("Enter the sticker: (Green,Yellow,Red):  ");
        Sticker =sc.next();

        GetType(Sticker,FoodName);
}
public void foodOut() {
    System.out.println("Code: " + Code);
    System.out.println("Food Name: " + FoodName);
    System.out.println("Sticker: " + Sticker);
    System.out.println("Food Type: " + FoodType);
}
    public static void main(String[] args) {
        SUPPLY obj=new SUPPLY();
        obj.FoodIn();
       obj.foodOut();
    }        
}
// Define a class SUPPLY in Java with the following descriptions :
// Data Members are : Code of int type, FoodName of type String, Sticker of type String, FoodType of type String.
// Memeber Functions :
// A member function GetType() to assign the following values for FoodType as per the given sticker
//Sticker FoodType
//Green Vegetarian
//Yellow Contains Egg
//Red Non Vegetarian
// A function FoodIn() to allow user to enter values for Code, FoodName, Sticker
//and call function GetType() to assign respective FoodType.
// A function FoodOut() to allow user to view the content of all the data members