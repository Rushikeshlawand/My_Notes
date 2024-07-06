package Module;

import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    Complex add(Complex other){
return new Complex(this.real+other.real, this.imaginary+other.imaginary);
    }
    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    void print() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.print("Sum: ");
        sum.print();
        System.out.print("Difference: ");
        difference.print();
        System.out.print("Product: ");
        product.print();
    }
}

// Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
// with separate methods for each operation whose real and imaginary parts are entered by user.