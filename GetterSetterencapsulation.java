import java.util.Scanner;

class Data1{
	private int id;
	private String name,processor;
	
	public int getId() {
		return id;
	}
public void setId(int id) {
	this.id=id;
}
public String getName() {
	return name;
	}
public void setName(String name) {
	this.name=name;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor=processor;
}
}
public class GetterSetterencapsulation {

	public static void main(String[] args) {
		Data1 d= new Data1(); //first create a object and then call a method
		Scanner sc= new Scanner(System.in);
		int id= sc.nextInt();
		String b= sc.next();
		String p= sc.next();
		d.setId(id);
		d.setName(b);
		d.setProcessor(p);
		System.out.println("Id="+ d.getId());
		System.out.println("Name="+ d.getName());
		System.out.println("Processor="+ d.getProcessor());
	}
}

