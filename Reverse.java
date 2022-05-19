	package corejava;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {

	System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
				int n= sc.nextInt();
	            int reverse= 0;
	            int temp= n;
	while(n!=0) {
		reverse= (reverse*10)+n%10;
	n/=10; 
	}
	System.out.println("reverse=" + reverse);
	}
}
	
	
		
			

