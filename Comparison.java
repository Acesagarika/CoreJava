import java.util.Scanner;
public class Comparison {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
System.out.println("Enter number 1:");
System.out.println("Enter number 2:");
int num1= sc.nextInt();
int num2= sc.nextInt();
if(num1==num2) {
System.out.printf("%d==%d\n", num1,num2);
}
if(num1!=num2) {
System.out.printf("%d != %d\n",num1,num2);
}
if(num1<num2) {
System.out.printf("%d < %d\n",num1,num2);
}
if(num1>num2) {
		System.out.printf("%d > %d\n",num1,num2);
}
if(num1<=num2) {
		System.out.printf("%d <= %d\n",num1,num2);
}
if(num1>=num2) {
		System.out.printf("%d >= %d\n",num1,num2);
	}
}
}
