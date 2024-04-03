package Module__2;
//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide 
//by zero exception and another one is to handle o Array 
//IndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
public class Question22 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0; // This line will cause exceptions
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (Exception e) {
            System.out.println("Caught an exception");
        }
    }
}
