import java.net.URI;

public class Sample {
	public static void main(String[] args) throws Exception{
		try {
			doSomething();
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		finally {
			System.out.println("Inside finally");
		}
		
		try {
			connectToWebService();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		connectToWebService();
		System.out.println("End of Main");
		throw new Exception("My own exception");
	}
	
	//Checked and Unchecked
		public static void connectToWebService() throws Exception {
			Class.forName("dsklhfkjsdhf");
			//URI uri = new URI("http://jksadhakjsd.com");
			
		}
	
	//Checked and Unchecked
	public static void connectToDB() {
		try {
			Class.forName("dummy class");
		}
		catch(Exception ex) {
			System.out.println("Error " + ex.getMessage());
		}
		
	}
	
	public static void doSomething() {
		int[] arr = { 1,2,3 };
		arr[5] = 10;
		
		try {
			//Introduced in Java 1.7
			
		} 	
		catch(StringIndexOutOfBoundsException | ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			
		}
		
		try {
			
			
		} 	
		catch(StringIndexOutOfBoundsException cnf) {
			
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}	
	}
}
