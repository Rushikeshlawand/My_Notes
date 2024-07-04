import java.util.Scanner;

public class SUPPLY {
    private int Code;
    private String FoodName;
    private String Sticker;
    private String FoodType;

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