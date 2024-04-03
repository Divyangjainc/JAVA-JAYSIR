package Module__2;
import java.util.*;
//W.A.J.P to start the same Thread twice by calling start () method twice. 
//Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
public class Question31 {
	TestThreadTwice1 t1 = new TestThreadTwice1();
	t1.start(); // First start
	t1.start(); // Second start, will throw IllegalThreadStateException

}