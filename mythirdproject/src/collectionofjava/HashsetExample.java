package collectionofjava;


import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		       // HashSet declaration
		       HashSet<String> hset = new HashSet<String>();

		       // Adding elements to the HashSet
		       hset.add("Apple");
		       hset.add("Mango");
		       hset.add("Grapes");
		       hset.add("Orange");
		       hset.add("Fig");
		 System.out.println(hset);
		        //Addition of duplicate elements
		       hset.add("Apple");
		       hset.add("Mango");
		       //Addition of null values
		       hset.add(null);
		       hset.add(null);

		       //Displaying HashSet elements
		       System.out.println(hset);
		       Iterator<String> itObj = hset.iterator();
		       System.out.print("HashSet using Iterator: ");
		       // Accessing elements
		       while(itObj.hasNext()) {
		           System.out.print(itObj.next());
		           System.out.print(", ");
		       }
		   }

	}


