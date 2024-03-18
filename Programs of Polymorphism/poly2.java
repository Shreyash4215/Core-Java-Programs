// Polymorphism - method overriding is must
//run time

import java.util.*;

abstract class company    //Base
{
	 int sal;
	 abstract void disp();
}

class mng extends company 	//Derived
{	
	void disp()
	{	
	  sal=500000; 
	  System.out.println("\n\t Manager sal = "+sal);
	} 
}

class pl extends company	//Derived
{	
	void disp()
	{	    
	  sal=250000; 
	  System.out.println("\n\t pl sal = "+sal);
	} 
}

class emp extends company	//Derived
{	
	void disp()
	{	    
	  sal=10000; 
	  System.out.println("\n\t Emp sal = "+sal);
	} 
}


class poly2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,ch,i;
		
		System.out.print("\n\t How many employes do you want: ");
		n=sc.nextInt();
		
		company c[]=new company[n];       //Array of instance
		
		for(i=0;i<n;i++)
		{
			System.out.print("\n\t 1.Manager \n\t 2.PL \n\t 3.Emp \n\t Enter your choice ");
			ch=sc.nextInt();
				
			if(ch==1)
			{				
				c[i] = new mng();
			}	
			else if(ch==2)
			{
				c[i] = new pl();
			}	
			else	
			{
				c[i] = new emp();
			}	
		}
		
		for(i=0;i<n;i++)
			c[i].disp();	
	
	}
}