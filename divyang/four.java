package divyang;
//3.Write a Java program that takes a year from user and print whether that year
//is a leap year or not. B19. Write a program in Java to display the first 10 
//natural numbers using while loop.
import java.util.Scanner;
public class four {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
   }
}