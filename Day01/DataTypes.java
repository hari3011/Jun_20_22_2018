//Strongly-typed
//

class Car{
	
}
public class DataTypes{
	public static void main(String[] args) {
		
		int a;//Variables have to be initialized
		System.out.println(a);
		
		int number = 12;
		if(number % 2 == 0)
			System.out.println("Number " + number + " is even");
		else
			System.out.println("Number " + number + " is odd");

		String[] languages = {"Java","C#","Ruby","JavaScript"};
		for(int i=0;i<languages.length;i++){
			System.out.println(languages[i]);
		}
		
		int counter = 0;
		while(counter < languages.length){
			System.out.println(languages[counter]);
			counter++;
		}
		
		
		//Primitive Types
		int i = 10;
		boolean b = false;
		String s = "java";
		float f = 12.3f;
		double d = 12.45;
		char c = 'a';
		
		//Reference types are objects	
		//car1 is a reference data type
		Car car1 = new Car();
	}
}