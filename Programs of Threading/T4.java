
class myTh extends Thread
{
	public void run()
	{
		System.out.print("Thread is Running."); 
	}	
}

class T4
{
  public static void main(String args[])
  {
	  myTh obj = new myTh();
	  obj.start();
  }
}
