package Module__2;
//W.A.J. P to demonstrate try catch block, take two numbers from the user 
//by Command line argument and perform the division operation and 
//handle Arithmetic o O/P-
public class Question24 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double result = num1 / num2;
            System.out.println("Division result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
