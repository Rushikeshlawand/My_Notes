public class MethodOverloadingOfArea {

    // Method to calculate area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Overloaded method to calculate area of a triangle
    public static double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return -1;  // Error code
        }
    }

    public static void main(String[] args) {
        System.out.println("Area of circle: " + calculateArea(5.0));                 // Output: 78.53981633974483
        System.out.println("Area of rectangle: " + calculateArea(4.0, 5.0));        // Output: 20.0
        System.out.println("Area of triangle: " + calculateArea(4.0, 5.0, true));   // Output: 10.0
    }
}
