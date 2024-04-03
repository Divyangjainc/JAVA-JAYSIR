package Module_2java;
//Create a class named 'Shape' with a method to print "This is this is shape". 
//Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape 
//class, both having a method to print "This is rectangular shape" and "This is 
//circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a 
//method to print "Square is a rectangle". Now call the method of 'Shape' and 
//'Rectangle' class by the object of 'Square' class. 
import java.util.*;
class Shape1 {
    public void printShape1() {
        System.out.println("This is a shape.");
    }
}

class Rectangle1 extends Shape1 {
    public void printRectangle() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle1 extends Shape1 {
    public void printCircle() {
        System.out.println("This is a circular shape.");
    }
}

class Square1 extends Rectangle1 {
    public void printSquare() {
        System.out.println("Square is a rectangle.");
    }
}

public class Question19 {
    public static void main(String[] args) {
        Square1 square = new Square1();
        
        square.printShape1();     // Calling method of 'Shape' class
        square.printRectangle(); // Calling method of 'Rectangle' class through inheritance
    }
}
