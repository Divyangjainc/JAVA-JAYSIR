package Module_2java;
//Create a class named 'Member' having the following members: 
//Data members 
//a) Name 
//b) Age 
//c) Phone number 
//d) Address 5 - Salary 
//e) It also has a method named 'printSalary' which prints the salary of the 
//members. 
//f) Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
//'Employee' and 'Manager' classes have data members 'specialization' 
//and 'department' respectively. Now, assign name, age, phone number, 
//address and salary to an employee and a manager by making an object 
//of both of these classes and print the same. 
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Question11 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Mayank";
        employee.age = 30;
        employee.phoneNumber = "123-456-7890";
        employee.address = "123 Main St, City";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";

        Manager manager = new Manager();
        manager.name = "Jalak";
        manager.age = 29;
        manager.phoneNumber = "987-654-3210";
        manager.address = "456 Park Ave, Town";
        manager.salary = 80000.0;
        manager.department = "HR";

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
