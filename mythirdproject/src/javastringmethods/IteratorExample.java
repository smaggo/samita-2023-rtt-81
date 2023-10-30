package javastringmethods;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		
//		pos 012345
//		val abcdef
		ArrayList<String>strings = new ArrayList<>();
		
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		strings.add("f");
		for(String string : strings) {
			System.out.println(string);
			
		}

		Iterator<String> itr = strings.iterator();
		while (itr.hasNext()) {
			String string =(String)itr.next();
			System.out.println(string);
		}
		

	}

}
