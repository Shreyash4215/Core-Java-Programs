
import java.util.*;

class InvalidAvg extends Exception
{
	
}

class cricktplyr
{
	Scanner sc = new Scanner(System.in);
	
	String name; 
	int n_of_inn,n_times_notout,total_runs,bat_avg;
	
	void get()
	{
		System.out.print("\n\t Enter the player name,no of innings,no of times notout and total runs: ");
		name=sc.next();
		n_of_inn=sc.nextInt();
		n_times_notout=sc.nextInt();
		total_runs=sc.nextInt();
	}
	void disp()
	{
		System.out.print("\n\t "+name+"\t   "+n_of_inn+"\t\t   "+n_times_notout+"\t\t   "+total_runs+"\t\t   "+bat_avg+"\n");
	}
	
	static void avg(int s,cricktplyr c[])
	{
		int n,i;
		n=s;

		for(i=0;i<n;i++)
		{
			try
			{				
				if(c[i].total_runs/c[i].n_of_inn>0)
				{
					c[i].bat_avg=c[i].total_runs/c[i].n_of_inn;					
				}
				else
				{
					throw new InvalidAvg();
				}
			}
			catch(InvalidAvg ex)
			{
				System.out.println("\n\t Unable to calculate average the of "+c[i].name+" is less than zero.Average must be greater than zero");
			}
			catch(ArithmeticException ex)
			{
				System.out.println("\n\t Unable to calculate average of "+c[i].name+" beacause wrong data insert check no of innings and total runs");
			}
			catch(Exception ex)
			{
				System.out.println("\n\t Exception occurs");
			}
		}		
	}	
	static void sort(int s,cricktplyr c[])
	{
		int n,j,i;
		n=s;
		cricktplyr temp;
		
		for(i=0;i<n;i++)
			for(j=i+1;j<n;j++)
			{
				if(c[i].bat_avg<c[j].bat_avg)
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
	}
}

class Ass22ExceptionHandling
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		
		System.out.print("\n\t How players do you want?: ");
		n=sc.nextInt();
		
		cricktplyr c[]=new cricktplyr[n];
		
		for(i=0;i<n;i++)
		{
			c[i]=new cricktplyr();
			c[i].get();
		}
		
		cricktplyr.avg(n,c);
		cricktplyr.sort(n,c);
		
		System.out.println("\n\tname\tno_of_inn\tno_times_notout\t  total_runs\t Batting Avg");
		System.out.println("\n\t********************************************************************");		
		for(i=0;i<n;i++)
		{		
			c[i].disp();
		}
		System.out.println("\n\t*********************************************************************");
	}
}