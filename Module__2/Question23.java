package Module__2;
//Print the sum, difference and product of two complex numbers by creating a class 
//named 'Complex' with separate methods for each operation whose real and 
//imaginary parts are entered by user. using nesting of try-catch 
//block. try { 
//try 
//{//code} 
//catch (Exception e) 
//{//code} 
//catch (Exception e) 
//{//code}

import java.util.Scanner;

class complex{
	private double real;
	private double imaginary;
	
	public complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public complex add(complex other) {
		double realsum = this.real + other.real;
		double imaginarysum = this.imaginary + other.imaginary;
		return new complex(realsum , imaginarysum);
	}
	
	public complex subtract(complex other) {
		double realdiff = this.real + other.real;
		double imaginarydiff = this.imaginary + other.imaginary;
		return new complex(realdiff , imaginarydiff);
	}
	
	public complex multiply(complex other) {
		double realproduct = (this.real + other.real) - (this.imaginary + other.imaginary);
		double imaginaryproduct = (this.real + other.imaginary) + (this.imaginary + other.real);
		return new complex(realproduct , imaginaryproduct);
	}
	
	@Override
	public String toString(){
		return real + " + " + imaginary + "i";
	}
}
public class Question23 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		try {
            System.out.println("Enter the real of the first complex number:");
            double real1 = sr.nextDouble();
            System.out.println("Enter the imaginary of the first complex number:");
            double imaginary1 = sr.nextDouble();

            System.out.println("Enter the real of the second complex number:");
            double real2 = sr.nextDouble();
            System.out.println("Enter the imaginary of the second complex number:");
            double imaginary2 = sr.nextDouble();
		
            complex c1 = new complex(real1, imaginary1);
            complex c2 = new complex(real2, imaginary2);
		
            complex sum = c1.add(c2);
            complex difference = c1.subtract(c2);
            complex product = c1.multiply(c2);
            
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
	}
	catch (Exception e) {
            System.out.println("An error occurred. Please enter valid numeric values.");
	}
	}
}