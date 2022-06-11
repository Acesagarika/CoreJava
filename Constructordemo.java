class per {
	int id;
	String name,dept;
	int a= 9, n= 90;
	per() {
System.out.println("Welcome to Ducat pvt.Ltd");
	}
	per (int id,String name,String d) 
	{
		this.id= id;
		this.name=name;
		this.dept=d;
		
	}
	void cal(int a,int n)
	{
		this.a=a;
		this.n=n;
		int Salary= a*n;
		System.out.println("Salary="+ Salary);
	}
	void show() 
	{
	System.out.println("ID=" + id);
	System.out.println("Name=" +name);
	System.out.println("Dept=" + dept);
	}
}
	
public class Constructordemo {

	public static void main(String[] args) {
		per p= new per();
		p.show();
		per p1= new per(2, "Amit","IT");
		p1.show();
		p1.cal(100,10);
		per p2= new per(3,"Sagarika","ETC");
		p2.show();
		p2.cal(200, 20);
	}

		
		
	}


