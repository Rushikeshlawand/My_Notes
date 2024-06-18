public class AreaOfCircleUsingMethod {
    public static void main(String args[]){
double radius=5.5;
double area=calculateArea(radius);
System.out.println("Area of circle is: "+ area);
}
public static double calculateArea(double radius){
    return Math.PI * radius *radius;
}
}
