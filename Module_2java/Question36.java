package Module_2java;
//Write a Java program to iterate through all elements in an array list. 
import java.util.*;
public class Question36 {
public static void main(String[] args) {
// Create a list and add some colors to the list
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Red");
list_Strings.add("Green");
list_Strings.add("Orange");
list_Strings.add("White");
list_Strings.add("Black");
// Print the list
for (String element : list_Strings) {
  System.out.println(element);
  }
}
}
