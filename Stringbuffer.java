import java.util.Scanner;
public class Stringbuffer {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter the name:");
	 String h= sc.next();
	 System.out.println("Enter your father's name:");
	 String d= sc.next();
	 System.out.println("Enter your sur name:");
	 String s= sc.next();
	 System.out.println("your full name is:");
	 StringBuffer sb= new StringBuffer("Twinkle");
	 int n= sb.length();
	 sb.insert(n, " Suryanarayan");
	 sb.append(" Sahoo");
	 System.out.println(sb);
	
	 
	 
	 
	}

		
	}


