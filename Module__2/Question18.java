package Module__2;
//Write a program to print the factorial of a number by defining a method named 
//'Factorial'. Factorial of any number n is represented by n! and is equal to 
//1*2*3*. *(n-1) *n. E.g.- o 4! = 1*2*3*4 = 24 o 3! = 3*2*1 = 6 o 2! = 2*1 = 
//2 o Also, 1! = 1 o 0! = 0 
public class Question18 {
    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 4; // Change this value to calculate factorial for a different number
        int result = Factorial(number);
        System.out.println(number + "! = " + result);
    }
}
