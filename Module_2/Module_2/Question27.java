package Module_2;
//W.A.J.P to create a class Student with attributes roll no, name, age and 
//course. Initialize values through parameterized constructor. If age of 
//student is not in between 15 and 21 then generate user defined exception 
//"AgeNotWithinRangeException". If name contains numbers or special 
//symbols raise exception "NameNotValidException". Define the two 
//exception classes.
//Custom Exception for age validation
class AgeNotWithinRangeException extends Exception {
public AgeNotWithinRangeException(String message) {
   super(message);
}
}

//Custom Exception for name validation
class NameNotValidException extends Exception {
public NameNotValidException(String message) {
   super(message);
}
}

class Student {
private int rollNo;
private String name;
private int age;
private String course;

public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
   this.rollNo = rollNo;

   // Validate and set name
   if (!isValidName(name)) {
       throw new NameNotValidException("Invalid name: " + name);
   }
   this.name = name;

   // Validate and set age
   if (!isValidAge(age)) {
       throw new AgeNotWithinRangeException("Age is not within the valid range: " + age);
   }
   this.age = age;

   this.course = course;
}

private boolean isValidAge(int age) {
   return age >= 15 && age <= 21;
}

private boolean isValidName(String name) {
   return name.matches("^[a-zA-Z\\s]*$");
}

public void display() {
   System.out.println("Roll No: " + rollNo);
   System.out.println("Name: " + name);
   System.out.println("Age: " + age);
   System.out.println("Course: " + course);
}
}

public class Question27 {
public static void main(String[] args) {
   try {
       Student student1 = new Student(1, "Divyang Jain", 20, "Computer Science");
       student1.display();

       System.out.println();

       // This will throw exceptions due to invalid age and name
       Student student2 = new Student(2, "Prakshal123", 22, "Mathematics");
       student2.display();
   } catch (AgeNotWithinRangeException | NameNotValidException e) {
       System.out.println("Exception: " + e.getMessage());
   }
}
}
