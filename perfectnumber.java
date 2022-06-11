import java.util.Scanner;
public class perfectnumber {
public static void main(String[] args) {

System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
            int temp= n;
int sum= 0;
	for(int i=1;i<n;i++)
	{
	if(n%i==0) {
		sum+=i;
		}
	}
	
	if(sum==temp) {
		System.out.println("Its a perfect number.");
		
	}
		else {
			System.out.println("Its not a perfect number.");
			}
	}
	}
	
