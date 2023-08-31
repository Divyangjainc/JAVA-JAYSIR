package Module_2;
//Print the sum, difference and product of two complex numbers by creating a 
//class named 'Complex' with separate methods for each operation whose real 
//and imaginary parts are entered by user
import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public Complex subtract(Complex other) {
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new Complex(diffReal, diffImaginary);
    }

    public Complex multiply(Complex other) {
        double productReal = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(productReal, productImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.println("Enter real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        scanner.close();
    }
}
