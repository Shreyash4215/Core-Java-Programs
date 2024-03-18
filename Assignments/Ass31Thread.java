// Create multiple threads.   

class NewThread implements Runnable
{
  String name; // name of thread 
  Thread t;
  int n;
 
  NewThread(String threadname,int p)
  {
    name = threadname;
	n=p;	
    t = new Thread(this, name); 
    System.out.println("New Thrd : " + t); 
    t.start();
  } 
 
  public void run()
  {
   try
   {
      for(int i = 1; i<=n; i++)
      {
        System.out.println("\n\t "+name + ":"+i); 
        Thread.sleep(1000); 
      } 
    } catch (InterruptedException e) {}

    System.out.println(" *** "+name + " exiting. ***"); 
  } 
} 
 
class Ass31Thread
{
  public static void main(String args[])
  {
    new NewThread("FY",5); // start threads 
    new NewThread("SY",10); 
    new NewThread("TY",15); 
 
    try
    {
      Thread.sleep(16000); 
    } catch (InterruptedException e) {} 
 
    System.out.println("*** Main thread exiting. ***"); 
  } 
}
