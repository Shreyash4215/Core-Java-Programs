class myTh implements Runnable 
{
	Thread t = new Thread(this);
    public void run()
	{ 
        System.out.print(t); 
        System.out.print("Thread using Runnable interface."); 
    } 
}

class T6
{
  public static void main(String args[])
  {
		myTh obj = new myTh();
		obj.t.start();
  }
}
