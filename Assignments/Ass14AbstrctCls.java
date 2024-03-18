import java.util.*;

abstract class staff
{
	String name,addrs;
	abstract void accept();
		void disp()
		{
			
		}
}
class fulltimestaff extends staff 	
{	
	String dept;
	int sal;
	
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{		
		System.out.print("\n\t Enter the Name,Address,Department,Salry: ");
		name=sc.next();
		addrs=sc.next();
		dept=sc.next();
		sal=sc.nextInt();
	}
	void disp()
	{		
		System.out.print("\n\t "+name+"\t "+addrs+"\t\t "+dept+"\t\t "+sal+"\n");		
	}

}
class halftimestaff extends staff	
{	
	int nfrhr,rprh;
	
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{		
		System.out.print("\n\t Enter the Name,Address,No of Hr,Rate pr hr: ");
		name=sc.next();
		addrs=sc.next();
		nfrhr=sc.nextInt();
		rprh=sc.nextInt();
	}
	void disp()
	{		
		System.out.print("\n\t "+name+"\t "+addrs+"\t\t "+nfrhr+"\t\t "+rprh+"\n");		
	}
}
class Ass14AbstrctCls
{
	public static void main(String args[])
	{
		int n,i,ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\t Enter How many staffs do you want  ");
		n=sc.nextInt();
		
		staff s[]=new staff[n];
		
		for(i=0;i<n;i++)
		{
			System.out.print("\n\t *********Menu***********\n\n\t 1.Full Time staff \n\n\t 2.Half Time staff \n\t *********************** \n\n\t Enter you choice :  ");
			ch=sc.nextInt();
			
			if(ch==1)
			{
				s[i]=new fulltimestaff();
				s[i].accept();
			}
			else
			{				
				s[i]=new halftimestaff();
				s[i].accept();
			}			
		}
		System.out.println("\n\t ************Detail of Full Time staff*************");
		System.out.print("\n\t Name \tAddress \tDepartment \tSalry");
		System.out.println("\n\t --------------------------------------------------");		
		for(i=0;i<n;i++)
		{
			if(s[i].getClass().getName().equals("fulltimestaff"))
				s[i].disp();
		}
		System.out.println("\n\t --------------------------------------------------\n");		
		
		System.out.println("\n\t ************Detail of Half Time staff**************");
		System.out.println("\n\t Name \tAddress  \tNo of Hr \tRate pr Hr");		
		System.out.println("\n\t --------------------------------------------------");
		for(i=0;i<n;i++)
		{
			if(s[i].getClass().getName().equals("halftimestaff"))
				s[i].disp();
		}	
		System.out.println("\n\t --------------------------------------------------\n");
	}
 }