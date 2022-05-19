package corejava;

import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {
		int n,i, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-");
n= sc.nextInt();
for(i=2; i<n; i++) {
	if (n % i==0) {
		count ++;
		break;
		
	}
}
if(count==0)
{
	System.out.println("It is a prime number");
}
	
else {
	System.out.println("it is not a prime number");
}
}

}
