package divyang;
//2.Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending 
//on the user input. If the user input is not a letter (between a & z or A and Z), or is a string of length
//> 1, print an error message.
import java.util.*;

public class third {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please Provide single character from the alphabet: ");
        String letter = scan.next();
        
        if (scan.hasNext())
        {
            letter = letter.toLowerCase();
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
            {
                System.out.println("Vowel");
            }
            else if (letter.length() > 1)
            {
                System.out.println("Error");
            }
            else
            {
                System.out.println("Consonant");
            }
        }
        else
        {
            System.out.println("Error");
        }
    }

}