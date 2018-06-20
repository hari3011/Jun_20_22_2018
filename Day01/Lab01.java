import java.util.Scanner;

public class Lab01{
	public static void main(String[] args) {
		int target = (int)(Math.random()*100);
		int attempts = 0;
		String message = "";
		int guess = -1;
		boolean gameOver = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100");
		while(!gameOver){
			guess = scanner.nextInt();
			attempts++;
			if(guess > target){
				message = "Aim Lower";
			}
			else if(guess < target){
				message = "Aim Higher";
			}
			else{
				message = "You've got it in " + attempts + " attempts";
				gameOver = true;
			}
			System.out.println(message);
		}
	}
}