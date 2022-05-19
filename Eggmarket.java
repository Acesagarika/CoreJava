package corejava;
import java.util.Scanner;
	public class Eggmarket {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the egg market");
			System.out.println("Enter the number of eggs:");
			int egg = sc.nextInt();
			int dozens = egg /12;
			int remainder = egg%12;
			System.out.println("you have total" +dozens+ "dozen and" +remainder+ "eggs");
			float price = egg*7;
			System.out.println("total price=" +price);
			if(dozens>=2) {
				float discount= (price*5)/100;
				System.out.println(" Discount got " + discount);
				float totalamount = price-discount;
				System.out.println("your total amount after discount=" +totalamount);
			}
			else {
				System.out.println("your total price= " + price);	
			}
		}
}


