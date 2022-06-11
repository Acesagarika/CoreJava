public class Stringex3 {
public static void main(String[] args) {
		//create a string
		String t= "Ducat is a java learning center.";
		System.out.println("String: "+ t);
		
		//calculate the length
		int length= t.length();
		System.out.println("Length:"+ length);
		
		//concat the strings
		//create second string
		String y= " And Twinkle is learning java in Ducat.";
		System.out.println("String:"+ y);
		
		//concat two strings
		String Final= (t.concat(y));
		System.out.println("Final String is:"+ Final);
		

	}

}
