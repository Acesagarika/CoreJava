import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Open the file:");
    System.out.println("Enter the number:");
    int a = sc.nextInt();
    try {
    int b=50/a;
    System.out.println("Total="+b);
	}
    int g[]= {10,20,30};
    g[5]= 40;
	catch (ArithmeticException ae) 
    {
		ae.printStackTrace();
    }
    catch ()
    System.out.println("close the file.");
    
    

	}

}
