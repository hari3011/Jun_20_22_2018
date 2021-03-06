import java.util.ArrayList;

public class LambdaUser {

	public static void main(String[] args) {
		
		ArrayList<String> langs = new ArrayList<String>();
		langs.add("Scala");
		langs.add("Ruby");
		langs.add("Groovy");
		
		for (int i = 0; i < langs.size(); i++) {
			System.out.println(langs.get(i));
		}
		langs.forEach(lang -> System.out.println(lang));
		
		//Stream API which is similar to LINQ
		
		
		//1
		Printer printer1 = new ConsolePrinter();
		printer1.print("Hello Day02");
		
		//2
		Printer printer2 = new Printer() {
			public void print(String message) {
				System.out.println(message);
			}
		};
		printer2.print("Hello there");
		
		//3 (Lambda Expressions)
		Printer printer3 = (message) -> System.out.println(message);
		printer3.print("Hello Lambda");
		
		Calculator calc = (a,b) -> a + b;
		int sum = calc.add(10, 20);
		System.out.println(sum);
		
		Calculator calc2 = (x,y) -> {
			return x+y;
		};
		calc2.add(1,2);
	}

}

interface Calculator{
	int add(int x,int y);
	//int subtract(int x,int y);
}

//Functional interface
interface Printer{
	void print(String message);
}
class ConsolePrinter implements Printer{
	public void print(String message) {
		System.out.println(message);
	}
}
