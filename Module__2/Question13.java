package Module__2;
//Write a program to print the area and perimeter of a triangle having sides of 3, 
//4 and 5 units by creating a class named 'Triangle' without any parameter in its 
//constructor.
class Triangle {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle() {
        side1 = 3.0;
        side2 = 4.0;
        side3 = 5.0;
    }
    
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    
    public double calculateArea() {
        // Using Heron's formula to calculate area of a triangle
        double s = calculatePerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    public void printDetails() {
        System.out.println("Triangle sides: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }
}

public class Question13 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printDetails();
    }
}
