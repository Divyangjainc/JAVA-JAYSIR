package Module_2java;
//Create a class with a method that prints "This is a parent class" and its subclass 
//with another method that prints "This is child class". Now, create an object for 
//each of the class and call 1 - method of parent class by object of parent class 2 
//- method of child class by object of child class 3 - method of parent class by 
//object of child class
class ParentClass {
    public void printParent() {
        System.out.println("This is a parent class");
    }
}

class ChildClass extends ParentClass {
    public void printChild() {
        System.out.println("This is a child class");
    }
}

public class Question10 {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();
        
        // Calling method of parent class by object of parent class
        parentObj.printParent();
        
        // Calling method of child class by object of child class
        childObj.printChild();
        
        // Calling method of parent class by object of child class
        childObj.printParent();
    }
}
