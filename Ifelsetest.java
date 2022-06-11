import java.util.Scanner;
public class Ifelsetest {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
	System.out.println("Enter the 1st digit:");
int n1= sc.nextInt();
System.out.println("Enter the 2nd digit:");
int n2= sc.nextInt();
System.out.println(n1>=0 && n1<=1 && n2<=0 && n2>=1);
	
}
	}


//doubt
//q) write a java program that accepts two double variables and test if both strictly between 0 & 1 & false otherwise.