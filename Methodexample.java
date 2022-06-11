class emp{
	int id;
	String name,dept;
	void accept(int id, String name,String dept)
	{
		//"void" means- no return type
		this.id= id;
		this.name= name;
		this.dept= dept;
		//this- reference keyword
	}
void show() 
{
	System.out.println("id="+id);
	System.out.println("Name="+ name);
	System.out.println("Dept="+ dept);
}
}
public class Methodexample {

	public static void main(String[] args) {
		emp e= new emp();
		e.accept(1,"Twinkle","ETC");
		e.show();
	}

}
