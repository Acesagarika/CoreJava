import java.util.*;
public class fourequalnumbers {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first input number");
		int n1= sc.nextInt();
		System.out.println("Enter the second input number");
		int n2= sc.nextInt();
		System.out.println("Enter the third input number");
		int n3= sc.nextInt();
		System.out.println("Enter the fourth input number");
		int n4= sc.nextInt();
		if(n1==n2 && n2==n3 && n3==n4) {
			System.out.println("All the numbers are equal.");
		}
		else {
			System.out.println("Not equal.");
			
		}
		

	}

}

//write a java program to find the four numbers are equal or not.