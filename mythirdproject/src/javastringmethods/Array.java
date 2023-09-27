package javastringmethods;

public class Array {
	public static void main (String[] args) {
		
	String  letters = "a, b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";	
		
		String[] lettersArray=letters.split( ",");
		int numberodletters = 0;
	
	for(int pos = 0;pos< lettersArray.length;pos++)
//		using enhanced loop
		String vowels = "aeiou";
	int numberOfLettersEnhanced = 0;
		for(String letter : lettersArray) {
			if ( !vowels.contains(letter)) {
				numberOfletterEnhanced = numderOfEnhanced + 1;
				
			}
		}
			
}