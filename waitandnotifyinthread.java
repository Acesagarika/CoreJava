class Customer {
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");
		if(this.amount<amount) {
		System.out.println("Less balance;waitng for deposit");
		try {
			wait();
}
		catch(Exception e) {}
		}
		this.amount-=amount;
		System.out.println("withdraw completed");
	}
	synchronized void deposit (int amount)
	{
		System.out.println("going to deposite");
		this.amount+=amount;
		System.out.println("deposite complted..");
		notify();
	}
  class waitandnotifyinthread {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		final Customer c=new Customer();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}
		.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}
		.start();
	}
 }
			
		
		}

	


