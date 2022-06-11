import java.util.Scanner;
public class Ifelsedemo {

	public static void main(String[] args) {
	System.out.println("Enter your marks:");
	Scanner sc = new Scanner(System.in);
			int marks= sc.nextInt();
	if(marks>35) {
		System.out.println("You are pass.");
	}
	else {
		System.out.println("You are fail.");
		
	}
	}

}
