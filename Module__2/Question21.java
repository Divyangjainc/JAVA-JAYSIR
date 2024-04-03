package Module__2;
//Take two numbers from the user and perform the division operation and 
//handle Arithmetic Exception. O/P- Enter two numbers: 10 0 o Exception 
//in thread main java.lang.ArithmeticException:/ by zero 
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main " + e.getClass().getName() + ": " + e.getMessage());
        }

        scanner.close();
    }
}
