import java.util.Scanner;

public class Ifexamdemo {

	public static void main(String[] args) {

System.out.println("Enter your marks:");
	Scanner sc = new Scanner(System.in);
			int marks= sc.nextInt();
			
	if(marks<=34); {
	System.out.println("you are fail.");
	}
	
	 if  (marks>=35 && marks<=49) {
		
		System.out.println("You are pass with 3rd division.");
	}
		
		else if (marks>=50 && marks<=59) {
			
			System.out.println("You are pass with 2nd division.");
		}
		else if (marks>=60 && marks<=74) {
			
			System.out.println("You are pass with 1st division.");
		}
		else if (marks>=75 && marks<=100) {
			
			System.out.println("You are pass with distinction.");
		}
	}
}
