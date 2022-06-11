interface electricity {
	void unit (float unit);
	void unitprice(float unitprice);
	void calculate();
	void show();
}
class Residential implements electricity {
	float price,unit,total;
	public void unit (float unit) 
	{
		this.unit= unit;
	}
	public void unitprice (float unitprice) 
	{
		this.price=unitprice;
		}
	public void calculate() 
	{
		total= unit*price;
	}
	public void show() 
	{
		System.out.println("Residential electricity bill= "+total);
	}
}
class Industrial implements electricity {
	float price,unit,total;
	public void unit (float unit) 
	{
		this.unit=unit;
	}
	public void unitprice (float unitprice) 
	{
		this.price=unitprice;
		}
	public void calculate() 
	{
		total= unit*price;
	}
	public void show() 
	{
		System.out.println("Industrial electricity bill= "+total);
	}
}
class Commercial implements electricity {
	float price,unit,total;
	public void unit (float unit) 
	{
		this.unit=unit;
	}
	public void unitprice (float unitprice) 
	{
		this.price=unitprice;
		}
	public void calculate() 
	{
		total= unit*price;
	}
	public void show() 
	{
		System.out.println("Commercial  electricity bill= "+total);
	}
}


public class interfacedemo {

	public static void main(String[] args) {
		electricity e= new Residential();
		e.unit(100);
		e.unitprice(7);
		e.calculate();
		e.show();
		electricity e1= new Industrial();
		e1.unit(500);
		e1.unitprice(25);
		e1.calculate();
		e1.show();
		electricity e2= new Commercial();
		e2.unit(600);
		e2.unitprice(20);
		e2.calculate();
		e2.show();
		

	}

}
