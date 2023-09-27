package javastringmethods;

public class Practicereplaceall {
	/*String str1 = "abc cba";
	String upper = str1.toUpperCase();
	String str2 =str1.replace('a','z');
	System.out.println(str2);
	System.out.println(str1.replace('a','z'));
	
//	 all occuranceof "c++" is replaced with 'java"
	System.out.println(str1.replace( 'c++','java'); //it shows error because no c++ in str1
*/
	
	String vowels = "a::b::c::d::e";
//	 splitting the string at "::';
//	 storing the resultin an array of strings
//	String[] result = vowels.split("::");
	
//	 converting array to string and printing it
//	System.out.println("result = "+ Arrays.toString(result))
	
	
	String name = "Firstname Lastname";
	String[]names = name.split("  ");
	System.out.println("result ="  + (Array.toString(names)));
}
	

