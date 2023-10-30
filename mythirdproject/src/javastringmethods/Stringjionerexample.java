package javastringmethods;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Stringjionerexample {
//	public static void main(String[] args) {
//		 StringJoiner joinNames = new StringJoiner("=",",","="); // passing comma(,) as delimiter   
//	      // ----Adding values to StringJoiner  ----
//		        joinNames.add("Java");  
//		        joinNames.add("Python");  
//		        joinNames.add("C Sharp");  
//		        joinNames.add("Javascript");  
//		        System.out.println(joinNames);  
//		        public static void main(String[] args) {
//		       	 StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
//		             // ----Adding values to StringJoiner  ----
//		       	        joinNames.add("Java");  
//		       	        joinNames.add("Python");  
//		       	        joinNames.add("C Sharp");  
//		       	        joinNames.add("Javascript");  
//		       	        System.out.println(joinNames);  
//		       	}
		
	
			public static void main(String[] args) {
			StringJoiner joinNames = new StringJoiner(",", "[", "]");   /* passing comma(,) and square-brackets as delimiter */  
		  // ----- Adding values to StringJoiner---  
		        joinNames.add("New York");  
		        joinNames.add("New Jersey");  
		  
		//----  Creating StringJoiner with :(colon) delimiter  
		    StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  /* passing colon(:) and square-brackets as delimiter  */  
		 
		 // ---Adding values to StringJoiner-----  
		         joinNames2.add("Dallas");  
		        joinNames2.add("Chicago");  
		  // ---- Merging two StringJoiner  ----
		        StringJoiner merge = joinNames.merge(joinNames2);   
		  //      System.out.println(merge);  
		        
		        	
		         
//		            public static void main(String[] args) {
//		                StringBuffer sb = new StringBuffer("135");
//		                sb.replace(0, 5, "6789").insert(0, "12345");
//		                System.out.println(sb.reverse().delete(0, 5));
//		            }
//		        
		           
		            
		            
		                   ArrayList<String> mylist = new ArrayList<String>();
		                   mylist.add("New Jersey");  // 0
		                   mylist.add("Dallas");//1
		                   mylist.add("New York");//2
		                   mylist.add("Chicago");//3
		                   mylist.add("LA");//4
		                   System.out.println("Return boolean :" + mylist.contains("Chicago"));
		                   System.out.println("Return index value of Element :" + mylist.indexOf("Chicago"));
		                   System.out.println("Returns the actual Element at the given index :" + mylist.get(2));
		                   System.out.println("Returns the length of the arraylist :" + mylist.size());
		                 // Remove the element at the given index.   Returns the removed element.
		                   // remove element at index 3
		                   String removedElement =  mylist.remove(3);
		                   System.out.println("Removed Element: " + removedElement);
		                   // remove all elements
		                   mylist.clear();
		                   System.out.println("ArrayList after clear(): " + mylist);
		               }
		            }

	


