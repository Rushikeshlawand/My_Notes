package Module;

public class ShapeArea {

    void Area(int l, int w) {
        int areaOfReactangle = l * w;
        System.out.println(areaOfReactangle);
    }

    void Area(double Radius) {
        double areaOfCircle = Math.PI * Radius * Radius;
        System.out.println(areaOfCircle);
    }

    void Area(float h, float b) {
        float areaOfTriangle = (h * b) / 2;
        System.out.println(areaOfTriangle);
    }

    public static void main(String[] args) {
        ShapeArea obj = new ShapeArea();
        obj.Area(10, 10);
        obj.Area(10);
        obj.Area(10, 10);
    }
}
