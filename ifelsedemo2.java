import java.util.Scanner;
public class ifelsedemo2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
System.out.println("Enter your number:");
int number= sc.nextInt();
if(number>0) {
	System.out.println("The number is positive.");
}
	else if(number<0) {
		System.out.println("The number is Negative.");	
}
	else {
		System.out.println("The number is zero.");
	}
	}

}
// write a java program to print the number is positive or negative.

