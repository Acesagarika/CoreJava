class student {
	String name,technology;
	int rollno;
	static String collegename="SERC";
	
	student(String name,String technology, int r)
	{
		this.name=name;
		this.technology=technology;
		rollno=r;
	}
		void display() {
			System.out.println("Name=" + name+ "Roll no="+ rollno +technology+ "technology");
			System.out.println("college name=" +collegename);
	}
		//static void change() {
			//collegename= "SRP";//if any one wants to change the college name then use this method
		}

public class Staticmethod {

	public static void main(String[] args) {
		student candidate1= new student("Twinkle","ETC",1);
		//ex.collegename;
		candidate1.display();
		
		student candidate2= new student("Sagarika","IT", 30);
		candidate2.display();
		
		student candidate3= new student("Shreyas", "Mechanical", 41);
		candidate3.display();
		

	}

}
