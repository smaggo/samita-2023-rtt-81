package myselfpractice;

import java.util.ArrayList;
import java.util.List;

public class Glab303_11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> topcompanies = new ArrayList<>();

		// check is arraylist is empty
		System.out.println("is arraylist is empty/" + topcompanies.isEmpty());
		topcompanies.add("google");
		topcompanies.add("facebook");
		topcompanies.add("amazon");
		topcompanies.add("microsoft");
		System.out.println(topcompanies);

//      find size of array
		System.out.println("size of this array" + topcompanies.size());
//     retrive  element at given index

		String bestcompany = topcompanies.get(3);
		String goodcompany = topcompanies.get(2);
		String lastcompany = topcompanies.get(topcompanies.size() - 1);
		System.out.println(bestcompany);
		System.out.println(goodcompany);
		System.out.println(lastcompany);
//   how to   modify the list 
		topcompanies.set(2, "walmart");
		System.out.println(topcompanies);
//  remove element from array list
		topcompanies.remove(3);
		System.out.println(topcompanies);
		// Remove the first occurrence of the given element from the ArrayList
		// (The remove() method returns false if the element does not exist in the
		// ArrayList)
		boolean isRemoved = topcompanies.remove("walmart");
		System.out.println(topcompanies);
//Remove all the elements that exist in a given collection
		topcompanies.clear();
		System.out.println(topcompanies);

	}

}
