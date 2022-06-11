import java.util.Scanner;
class data{
	private int id; //int=data, //id= member
	private String name,processor;

	public int getId() {
		return id;
	}
	
public void setId(int id) {
	this.id= id;
}

public String getName() {
	return name;
	
}

public void setName(String name) {
	this.name= name;
	
}

public String getProcessor() {
	return processor;
	
}
public void setProcessor(String processor) {
	this.processor= processor;
	
}
public class Encapsulationdemo {

	public static void main(String[] args) {
		data d= new data();
		Scanner sc= new Scanner(System.in);
		int id= sc.nextInt();
		String b= sc.next();
		String h= sc.next();
		d.setId(id);
		d.setName(b);
		d.setProcessor(h);
		System.out.println("Id="+d.getId());
	}
}
}



