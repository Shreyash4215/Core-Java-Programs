
class myTh implements Runnable 
{
    public void run()
	{ 
        System.out.print("Thread using Runnable interface."); 
    } 
}

class T5
{
  public static void main(String args[])
  {
	  Thread obj = new Thread(new myTh());
	  obj.start();
  }
}
