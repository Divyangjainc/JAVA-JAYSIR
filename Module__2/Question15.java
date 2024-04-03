package Module__2;
//Create an abstract class 'Parent' with a method 'message'. It has two subclasses 
//each having a method with the same name 'message' that prints "This is first 
//subclass" and "This is second subclass" respectively. Call the methods 
//'message' by creating an object for each subclass. 
abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

public class Question15 {
    public static void main(String[] args) {
        FirstSubclass firstObj = new FirstSubclass();
        SecondSubclass secondObj = new SecondSubclass();
        
        firstObj.message();
        secondObj.message();
    }
}
