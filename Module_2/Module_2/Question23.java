package Module_2;
//W.A.J. P to implement the above program (pro.no-B27) using nesting of 
//try-catch block. try { o try o {//code} o catch (Exception e) o {//code} 
//o catch (Exception e) o {//code} 
public class Question23 {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block start");
            
            try {
                // Inner try block 1
                System.out.println("Inner try block 1 start");
                int result = 10 / 0; // This will cause an ArithmeticException
                System.out.println("Result: " + result); // This won't be executed
                System.out.println("Inner try block 1 end");
            } catch (ArithmeticException e) {
                // Inner catch block 1
                System.out.println("Inner catch block 1: Caught ArithmeticException");
            }
            
            try {
                // Inner try block 2
                System.out.println("Inner try block 2 start");
                String str = null;
                int length = str.length(); // This will cause a NullPointerException
                System.out.println("String length: " + length); // This won't be executed
                System.out.println("Inner try block 2 end");
            } catch ()
}
    }
}
