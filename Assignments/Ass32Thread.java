class th implements Runnable
{
	Thread t;
	String msg;
	
	th(String msg)
	{
		this.msg=msg;
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		System.out.println("\n\t first Tread Is Running ");
		System.out.println("\n\t Secount Tread Is Running ");
		
		while(true)
		{
			System.out.println("\n\t Message : "+msg);
		}
	}
}
class Ass32Thread
{
	public static void main(String args[])
	{
		th t1 = new th("i am t1");
		th t2 = new th("i am t2");
		
		try
		{
			t1.t.join();
			t2.t.join();
		}
		catch(Exception e){}
	}
}