public class Strings{
	public static void main(String[] args) {

		System.gc(); //NOT RECOMMENDED
		
		String pan = "FERER12313";
		
		String str1 = "hello";
		str1 = "hi";
		str1 = "huh";
		//DO NOT USE STRINGS IF THERE'S LOT OF MANIPULATION INVOLVED
		//USE StringBuilder or StringBuffer instead
		//Use strings for CONSTANTS
		
		//Strings are also REFERENCE types
		//Strings are IMMUTABLE
		
		String lang1 = new String("Java");
		String lang2 = new String("Java");
		
		//DO NOT USE == for COMPARING Strings
		if(lang1 == lang2)
			System.out.println("Cool");
		else
			System.out.println("Not equal");
		
		//Creates an IMPLICIT OBJECT
		String lang3 = "Java";
		String lang4 = "Java";
		
		//MAINTAIN ONE STYLE OF STRING CREATION ONLY
		//Compare the values of a string using .equals
		if(lang1.equals(lang2)){
			System.out.println("YES");
		}
		
		
		// String lang1 = "Java";
// 		String lang2 = "Java";
//
// 		if(lang1 == lang2)
// 			System.out.println("Cool");
// 		else
// 			System.out.println("Not equal");
		
	}
}