package Module_2java;
//Write a Java program to shuffle elements in an array list. 
import java.util.*;
public class Question44 {
public static void main(String[] args) {
List<String> list = Arrays.asList("one", "two", "three", "four");
System.out.println(list);
Collections.shuffle(list, new Random(2));
System.out.println(list);
}
}