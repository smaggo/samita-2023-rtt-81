package javastringmethods;

// Is empty method : if string is empty then execute True and if string has character then execute false
public class IsEmptymethods {
	public static void main(String args[]) {
		String s1 = " Welcome";
		String s2 = "";
		String s3 = "To the java world";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());

//  use trim method
		System.out.println(s1 + s2 + s3); // without using trim
		System.out.println(s1.trim() + s2 + s3);

// toLowercase method
		String s1lower = s1.toLowerCase();
		System.out.println(s1lower);

// toUpper method
		String s1upper = s1.toUpperCase();
		String s3upper = s3.toUpperCase();
		System.out.println(s1upper + s3upper);

// concat method
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s3));

// skipping split method because didn't get it

//  char At method
		String message = "Good morning .Welcome to the Java .";
		System.out.println(" seventh character in the message =" + " " + message.charAt(7));
// CompareTo() method
		String s4 = "Good Morning";
		String s5 = "How are you all";
		String s6 = " Welcome";
		String s7 = "Good Morning";
		System.out.println(s1.compareTo(s6));
		System.out.println(s4.compareTo(s5));

//	Substring meathod
		System.out.println(s5.substring(0, 7));
// index() input method
		int result;

		result = s5.indexOf('y');
		System.out.println(result);

		result = s4.lastIndexOf('M');
		System.out.println(result);
		// contain method
		boolean answer;
		answer = s7.contains("evening");

		System.out.println(answer);
		answer = s6.contains("Welcome");
		System.out.println(answer);
// replace()method
		System.out.println(s5.replace('a', 'c'));
		System.out.println(s7.replace('4', 'v'));
// 	java string replace all() method ?
		String s8 = "java2354is67fun";
		String regex = "\\d+";
		System.out.println(s8.replaceAll(regex + "", regex));
		;
		/*
		 * java string compare .there are three method by using Equals() method by
		 * equal==operator by compareTo() method
		 */
// equals() method
		System.out.println(s1.equals(s7));
//equal== method
		System.out.println(s4 == s7);
		System.out.println(s4 == s1);
		// compareTo method
		System.out.println(s1.compareTo(s6));
		System.out.println(s3.compareTo(s8));

	}

}
