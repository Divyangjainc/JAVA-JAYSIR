package mmm;
//inheritance-> to access property of one class to another class 5-types->1.single 2.multilevel 3.multiple 4.hierarchial 5.hybrid
//multiple and hybrid not supported by java (ambiguity)
//1.Single
class P{
	P(){
		System.out.println("parent cons");
	}
	public void parentMethod() {
		System.out.println("parentMethod");
	}
}
class C extends P{
	public void childMethod() {
		System.out.println("childMethod");
	}
}
//2.Multilevel
class GC extends C{
	public void GCMethod() {
		System.out.println("grand child method");
	}
}
public class PO1O_inheritance {
	public static void main(String[] args) {
		C c= new C();
		c.parentMethod();
		c.childMethod();
		GC g = new GC();
		g.parentMethod();
		g.childMethod();
		g.GCMethod();
	}
}
