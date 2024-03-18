//Array Of Object

import java.util.*;

class demo
{
	 int n;
	 
	 void get()
	 {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("\n\t Entere your number= ");
		n=sc.nextInt();	
	 }
	 	  
	 void disp()
	 { 
		System.out.print("\n\t Entered number= "+n);
	 }
}



class AryObj2
{
	public static void main(String args[])
	{
		int i;
		demo obj[] = new demo[5];	//Array of instance / Declaration 
		
		for(i=0;i<5;i++)
		{
			obj[i]=new demo();		//Memory Allocation
			obj[i].get();
		}
		
		for(i=0;i<5;i++)
			obj[i].disp();
		
	}
}