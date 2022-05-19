package corejava;

abstract class candidate {
	String name,qualification;
	int age;
	candidate(String name,String qualification,int age) {
		this.name=name;
		this.qualification=qualification;
		this.age=age;
	}
	void show() {
		System.out.println("Name=" +name);
		System.out.println("Qualification=" +qualification);
		System.out.println("Age=" +age);
		
	}

abstract void select();
}
class hr extends candidate {
	int id;
	hr(String name,String qualification,int age,int id) 
	{
		super(name,qualification,age);
		this.id=id;
	}
	public void select() 
	{
		if(id==1) 
			System.out.println("congratulations!!! you are selected");
			else if(id==0) 
				System.out.println("Sorry!!! Rejected");
				else
		System.out.println("Wait!!! you're on hold.");
	}
}


public class abstractdemo {

	public static void main(String[] args) {
		
		//create objects
		
		candidate c= new hr("Shreyas", "SSC", 21,0);
		c.show();
	    c.select();
	    
	    candidate c1=new hr("Twinkle","ssc", 21,1);
	    c1.show();
	    c1.select();
	    
	    candidate c2=new hr("Shivin","SSC",30,5);
         c2.show();
         c2.select();
	}

}
