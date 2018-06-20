public class Manager extends Employee{
	private int shares;

	//public Manager(String name,double salary,int shares) : base(name,salary){
	// this.shares = shares;
	//}
	public Manager(String name, double salary, int shares) {
		super(name, salary);
		this.shares = shares;
	}
	
	//By default all methods in base class are overridable
	public void work() {
		super.work();
		System.out.println("Manager is working");
	}
	
}
