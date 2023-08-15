package mmm;

//final 
//1.variable -> cannot change value
//2.method-> cannot override method
//3. class -> cannot inherit
class AA{
	final int i =1;
	final public void chagne() {
//		i++;
		System.out.println(i);
}
	public void chagne(int i) {
		i++;
		System.out.println(i);
	}
}
class BB extends AA {
	public void change() {
		System.out.println("hello");
	}
}
public class PO15_Final {
	public static void main(String[] args) {
		AA a = new AA();
		a.chagne();
	}
}