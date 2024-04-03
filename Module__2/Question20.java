package Module__2;
//W.A.J. P to demonstrate try catch block
public class Question20 {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This line will cause an ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
        	
        }
    }
}