public class PersonUser{
	public static void main(String[] args) {
		
		Person p1 = new Person("Sam",12);
		Person p2 = new Person("Ram",23);
		//== compares the references
		if(p1 == p2)
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
		
		p1 = p2;
		if(p1 == p2)
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
		
		
		// int i = 10;
// 		Person person1 = new Person("Sam",12);
// 		System.out.println(person1.eat("Rice"));
// 		System.out.println(Person.getPersonCount());
//
//
// 		//NOT POSSIBLE IN C#; NOT RECOMMENDED IN JAVA
// 		System.out.println(person1.getPersonCount());
//
// 		person1 = null;//Candidate for GC
	}
}