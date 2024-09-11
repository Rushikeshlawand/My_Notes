package Module;

class MathOperations {

    void sqrt(double x) {
        double result=Math.sqrt(x);
        System.out.println(result);
    }
 void cbrt(double x){
    double result=Math.cbrt(x);
    System.out.println(result);
}

void factorial(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    System.out.println( result);
}

void factorial(long n) {
    long result = 1;
    for (long i = 1; i <= n; i++) {
        result *= i;
    }
    System.out.println(result);
}
public static void main(String[] args) {
    MathOperations obj=new MathOperations();
    obj.sqrt(5);
    obj.cbrt(5);
    obj.factorial(5);
    obj.factorial(4);
}
}