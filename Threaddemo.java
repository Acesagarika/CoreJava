class d extends Thread {
	public void run() 
	{
		for (int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class Threaddemo {

	public static void main(String[] args) {
		d d=new d(); //enter the d in thread
		Thread t=new Thread(d);
		System.out.println(t.currentThread().getName());
		System.out.println(t.getPriority());
        
		t.start(); //starting the thread execution
		t.setDaemon(true); 
		//           (false)
	}

}
