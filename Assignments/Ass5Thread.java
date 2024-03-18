import java.util.*;

class NewThread implements Runnable
{
    int i,sum=0,start,end,avg,arr[];
    Thread t;

    NewThread(int arr[], int start,int end)
    {
		this.arr=arr;
        this.start=start;
        this.end = end;

        t = new Thread(this);
        System.out.println(t+ " Range = "+start+ " - " +end);
        t.start();
    }

    public void run()
    {
        try
        {
            for (i = start; i<=end; i++)
            {
                sum=sum+arr[i];
                Thread.sleep(50);
            }

            avg = sum/100;
            System.out.println(t +" Sum = "+sum+" Avg = "+avg);

        } catch (InterruptedException e) {}
    }
}

class Ass5Thread
{
    public static void main(String args[])
    {
        NewThread obj[] = new NewThread[10];
        int i,cnt=-1,arr[];
        Random r= new Random();

        arr = new int[1000];
        for (i=0;i<1000;i++)
            arr[i] = r.nextInt(1000);

        for (i=0;i<10;i++)
            obj[i] = new NewThread(arr, ++cnt, cnt=cnt+99);

        try
        {
            System.out.println("\n *** Waiting for threads to finish*** \n");
            for (i=0;i<10;i++)
                obj[i].t.join() ;
        } 
		catch (InterruptedException e) {}

        System.out.println("\n *** Main thread exiting. *** \n");
    }
}
