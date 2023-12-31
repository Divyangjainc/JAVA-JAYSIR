package mmm;
//Constructor-> is special member function of class 
//				which has same name as class name
//			-> called automatically when object is created
//			-> have no return type
//			-> 3 types
//			->1.Default 2.Parameterized 3.Copy(object cloning)
class Data{
	int i;
	String name;
	Data(){
		System.out.println("default cons");
	}
	Data(int i){
		this.i = i;
		System.out.println("default int cons : "+i);
	}
	Data(String name){
		this.name=name;
		System.out.println("default Stirng cons : "+name);
	}
	Data(int i,String name){
		this.i=i;
		this.name=name;
	}
	public void showData() {
		System.out.println("i = "+i+" name : "+name);
	}
}
class NewData{
	int i;
	String name;
	NewData(Data d3){
		this.i = d3.i;
		this.name=d3.name;
	}
	public void showData() {
		System.out.println("i = "+i+" name : "+name);
	}
}
public class POO8_Constructor {
	public static void main(String[] args) {
		Data d = new Data();
		d.showData();
		Data d1 = new Data(12);
		d1.showData();
		Data d2 = new Data("java");
		d2.showData();
		Data d3 = new Data(12, "hello");
		d3.showData();
		
		NewData newdata = new NewData(d3);
		newdata.showData();
	}
}