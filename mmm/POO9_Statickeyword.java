package mmm;
//static variable : same memory allocation to every object
//static method : called by directly class name
//static block : executes before main or every class function
class Student {
	int id;
	String name;
	String address;
	long contact;
	static String cname = "TOPS";

	Student(int id, String name, String address, long contact) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public void showdata() {
		System.out.println("id : " + id + " name : " + name + " address : " + address + " contact : " + contact
				+ " cname : " + cname);
	}
	public static void staticCall() {
		System.out.println("static function");
	}
	static {
		System.out.println("static block inside Student class");
	}
}

public class POO9_Statickeyword {
	static {
		System.out.println("static block inside main class");
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "C", "abc", 986532);
		s1.showdata();
		Student s2 = new Student(2, "C++", "abc", 986532);
		s2.showdata();
		Student s3= new Student(3, "java", "abc", 986532);
		s3.showdata();
		Student s4 = new Student(4, "python", "abc", 986532);
		s4.showdata();	
		Student.staticCall();
	}
}