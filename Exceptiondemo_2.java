package Excep1;

public class Exceptiondemo_2  extends Exception {
private static int accountno []= {101,102,103,104,104};
private static String name [] = {"Sagarika","Twinkle","Mina"};
private static int balance []= {10000,20000,30000,40000,500};
Exceptiondemo_2(String str) 
{
	super (str);
}
	public static void main(String[] args) {
try {
	
System.out.println("AccountNo."+ "\t"+"CustomerName" + "t" + "Balance");
for (int i=0;i<=5;i++) 
{
	System.out.println(accountno[i]+"\t" + name[i] +"\t" +balance[i]);

	if (balance[i]<=500) 
	{
		Exceptiondemo_2 me= new Exceptiondemo_2("Balance amount is low");
		throw me;
	
	}
}


}
	}
}

