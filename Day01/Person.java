//Class names begin with uppercase
//variables begin with lowercase
//method names begin with lowercase

//CamelCase is the convention used 
public class Person{
	//member or instance variables
	private String name;
	private int age;
	private static int personCount;
	
	//FROM static methods you cannot call non-static members directly 
	public static int getPersonCount(){
		return personCount;
	}
	//getter setter methods are referred to as properties
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	//constructor
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		personCount++;
	}
	//Destructors
	//No destructors in JAVA	
	// ~Person(){
//
// 	}
	
	//instance methods
	public String eat(String items){
		return name + " is eating " + items;
	}	
		
}