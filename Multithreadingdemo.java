class mythread extends Thread {
	String str;
	mythread(String str) 
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1;i<=10;i++) {
			System.out.println(str+""+i);
			try {
			   Thread.sleep(2000); //sleep is a method of thread using for wait a program
			}
			catch(InterruptedException ex) //ex is an object of thread 
			{
				ex.printStackTrace(); //printstacktrace is used for print an exception
			}
		}
	}
}
public class Multithreadingdemo {

	public static void main(String[] args) {
		 mythread m1= new mythread("Cut the ticket"); //parameterized constructor
		 mythread m2=new mythread("Show the Seat");
		 Thread t1=new Thread(m1);   //parameterized  constructor  of thread
		 Thread t2=new Thread(m2);
		 t1.start();
		 t2.start();
	}
}
