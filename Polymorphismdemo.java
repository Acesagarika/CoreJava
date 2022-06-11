class test { //overloading
	void add(int a,int b)
	{
		int sum= a+b;
		System.out.println("Sum=" + sum);
		
	}
	void add (int a, int b, float f) {
		float sum= a+b+f;
	System.out.println("sum=" +sum);
	}
	
}
class test2 extends test {
	void add (int a,int b)
	{
		int sum= a+b;
		System.out.println("sum=" +sum);
		
	}
	void add (int a,int b, int c) 
	{
		float sum= a*b*c;
		
	}
}
public class Polymorphismdemo {

	public static void main(String[] args) {
		test t= new test(); // create an object
		t.add(124,234);
		t.add(567,987,432);
		
		test2 t2= new test2(); //create second object
		t2.add (67,87);
		t2.add(43,453,985);
		
		
	}

}
