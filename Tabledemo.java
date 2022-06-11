import java.util.Scanner;
public class Tabledemo {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
int k= sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(k + " * "+ i +"="+(k*i));
	
}
	}

}
