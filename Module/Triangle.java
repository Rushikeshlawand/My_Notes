package Module;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public void calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area is: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = a + b + c;
        System.out.println("Perimeter is: " + perimeter);
    }

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.calculateArea();
        obj.calculatePerimeter();
    }
}
