package Module__2;
//Write a Java program to get a collection view of the values contained in 
//this map.
import java.util.*;  
public class Question62 {  
     public static void main(String args[]){  
 
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
    hash_map.put(1,"Red");
  hash_map.put(2,"Black");
  hash_map.put(3,"Grey");
  hash_map.put(4,"Blue");
  hash_map.put(5,"Pink");
       
   // checking collection view of the map
   System.out.println("Collection view is: "+ hash_map.values());
 }
}
