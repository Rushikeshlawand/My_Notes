import java.util.Scanner;

public class Garments {

    String gCode;
    String gType;
    int gSize;
    String gFabric;
    float gPrice ;

    Garments(){
        gCode= "Not Allowed";
        gType= "Not Allowed";
        gFabric= "Not Allowed";
        gPrice = 0;
        gSize = 0;
    }

    void Assing(){

        if(gFabric.equals("Cotton")){
        if(gType.equals("Trouser")){
            gPrice= 1300f;
        }
        else{
            gPrice= 1100f;
      }
    }
    else{
        if(gType.equals("Shirt")){
            gPrice= 1300f * 90 / 100;
        }
        else{
            gPrice= 1100f * 90 /100;
      } 
    }
}


void  Input(){
    Scanner sc = new Scanner(System.in);

    gCode = sc.next();
    gType = sc.next();
    gSize = sc.nextInt();
    gFabric = sc.next();
    Assing();
}

void Dispay(){

    System.out.println( gCode);
    System.out.println(gType);
    System.out.println(gSize);
    System.out.println(gFabric);
    System.out.println(gPrice) ;

}

public static void main(String[] args) {
    Garments obj = new Garments();
    obj.Input();
    obj.Dispay();
}
}