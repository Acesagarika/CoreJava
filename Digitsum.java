import java.util.Scanner;
public class Digitsum {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter an integer:");
int n= sc.nextInt();

System.out.println("The sum of the digits is:" + sumDigits(n));
}
public static int sumDigits(int n) {
	int sum=0;
while(n!=0) {
	sum+= n %  10;
	n/=10;
}
return sum;
}
}

