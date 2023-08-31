package Module_2;
//W.A.J.P to create the validate method that takes integer value as a 
//parameter. If the age is less than 18, then throw an Arithmetic Exception 
//otherwise print a message welcome to vote. 
//o O/P- Enter your age: 16 
//o Exception in thread main java. lang. Arithmetic Exception: not 
//valid
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validate(age);
            System.out.println("Welcome to vote.");
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main java.lang.ArithmeticException: not valid");
        }
    }

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        }
    }
}
