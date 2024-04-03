package Module__2;
//Create a class to print an integer and a character with two methods having 
//the same name but different sequence of the integer and the character 
//parameters. For example, if the parameters of the first method are of the form 
//(int n, char c), then that of the second method will be of the form (char c, int 
//n).
public class Question8 {
    public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }
    
    public void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }
    
    public static void main(String[] args) {
        Question8 printer = new Question8();
        
        printer.print(5, 'A'); // Calls the first method
        printer.print('B', 10); // Calls the second method
    }
}
