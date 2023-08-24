package mmm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PO25_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add('a');
		set.add("java");
		set.add(3434.3);
		set.add(false);
		set.add(1);
		System.out.println(set);
		System.out.println(set.size());
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}