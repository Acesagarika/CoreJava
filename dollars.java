import java.util.Scanner;
public class dollars {

	public static void main(String[] args) {
		int amount;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your amount=");
amount=sc.nextInt();
int twenty= amount/20;
int ten= (amount- 20*twenty)/10;
int five=(amount- (20*twenty+10*ten))/2;
int one=(amount-(20*twenty+10*ten+ 5*five))/1;
System.out.println("$"+amount+ "converted is " +twenty+ " $20s," 
+ten+ "$10s," + five+"$5s and" +one+ "$1s" );
	}

}
