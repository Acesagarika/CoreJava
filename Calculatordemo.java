import java.util.Scanner;
public class Calculatordemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your operator");
String operator= sc.next();
System.out.println("Enter your numbers:");
int a= sc.nextInt();
int b= sc.nextInt();

switch(operator) {
case "+": System.out.println("sum=" + (a+b));
break;
case "-": System.out.println("difference=" + (a-b));
break;
case "*": System.out.println("multiplication="+(a*b));
break;
case "/": System.out.println("Quotient="+(a/b));
break;
case "%": System.out.println("Remainder="+(a%b));
break;
default:
System.out.println("Invalid number");

}
	}
}

