import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamExample {

	public static void main(String[] args) {
		ArrayList<String> langs = new ArrayList<String>();
		langs.add("Scala");
		langs.add("Ruby");
		langs.add("Groovy");
		langs.add("Go");
		
		//langs.forEach(lang -> System.out.println(lang));
		
		//Declarative style of Coding
		for (int i = 0; i < langs.size(); i++) {
			String lang = langs.get(i);
			if(lang.startsWith("G"))
				System.out.println(lang);
		}
		
		//Stream API paved way for functional style of coding
		langs.stream()
			.filter(lang -> lang.startsWith("G"))
			.forEach(lang -> System.out.println(lang));
		
		//Print the square of all the even numbers
		//Elegant, fool-proof style
		//You just tell what to do;
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		numbers
			.stream()
			.filter(num -> num % 2 == 0)
			.map(num -> num * num)
			.forEach(num -> System.out.println(num));
		
		//You tell how to do things; there are significant side-effects
		for (int i = 0; i < numbers.size(); i++) {
			int number = numbers.get(i);
			if(number % 2 == 0) {
				System.out.println(number*number);
			}
		}	

		
		
	}

}
