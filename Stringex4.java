
public class Stringex4 {

	public static void main(String[] args) {
		String str1= "HelloJava";
		String str2= "HELLO JAVA11";
		//compare to ignore case
		if(str1.compareToIgnoreCase(str2)==0) {
			System.out.println("str1 & str2 both are equal.");
		}
		else {
			System.out.println("str1 & str2 both are not equal.");
			
			// split
			String [] hii= str1.split("   ");
			System.out.println("Result = ");
			for(String k :hii) {
				System.out.println(k);
			}
			
			
		}

	}
}



