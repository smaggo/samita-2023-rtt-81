package javastringmethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetDemo {

	public static void main(String[] args) {
		
		List<String>stringList = new ArrayList<>();
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		
		stringList.get(1);
		
			
		
		
		
		
		
		HashSet<String> stringSet = new HashSet<>();
		
		stringSet.add("a");
		stringSet.add("b");
		stringSet.add("c");
		stringSet.add("d");
		stringSet.add("a");
		
		for(String string : stringSet) {
			System.out.println(string);
		}

	}

}
