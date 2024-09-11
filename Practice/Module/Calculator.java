package Module;

public class Calculator {

    void operation(int a, int b) {
        int Addition = a + b;
        System.out.println(Addition);
    }

    void operation(double a, double b) {
        double Substraction = a - b;
        System.out.println(Substraction);
    }

    void operation(float a, float b) {
        float Multiplication = a * b;
        System.out.println(Multiplication);
    }

    void operation(long a, long b) {
        long Divide = a / b;
        System.out.println(Divide);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.operation(10, 10);
        obj.operation(10, 5);
        obj.operation(20, 20);
        obj.operation(12, 6);
    }
}
