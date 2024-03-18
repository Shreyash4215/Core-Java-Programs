import java.util.*;

class vehicle
{
	String cname;
	int price;
	
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		System.out.print("\n\t Enter the vehicle company name and price : ");
		cname=sc.next();
		price=sc.nextInt();
	}
	void disp()
	{
		System.out.print("\n\t "+cname+"\t\t\t"+price);		
	}
}

class lightmotorvehicle extends vehicle 	
{	
	int milege;
	
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		super.accept();
		System.out.print("\n\t Enter the Milege of vehicle: ");
		milege=sc.nextInt();
	}
	void disp()
	{
		super.disp();
		System.out.print("\t        "+milege+"\n");		
	}

}

class heavymotorvehicle extends vehicle	
{	
	int cintons;
	
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		super.accept();
		System.out.print("\n\t Enter the Capacity in tons of vehicle: ");
		cintons=sc.nextInt();
	}
	void disp()
	{
		super.disp();
		System.out.print("\t        "+cintons+"\n");		
	}
}


class Ass13Inheritance
{
	public static void main(String args[])
	{
		int n,i,ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\t Enter How many vehicles do you want  ");
		n=sc.nextInt();
		
		vehicle v[]=new vehicle[n];
		
		for(i=0;i<n;i++)
		{
			System.out.print("\n\t *********Menu***********\n\n\t 1.Light Motor Vehicle \n\n\t 2.Heavy Motor Vehicle \n\t *********************** \n\n\t Enter you choice :  ");
			ch=sc.nextInt();
			
			if(ch==1)
			{
				v[i]=new lightmotorvehicle();
				v[i].accept();
			}
			else
			{				
				v[i]=new heavymotorvehicle();
				v[i].accept();
			}			
		}
		System.out.println("\n\t *********Detail of light Motor Vehicle***********");
		System.out.print("\n\t Name of company \tPrice \t      Millege");
		System.out.println("\n\t --------------------------------------------------");		
		for(i=0;i<n;i++)
		{
			if(v[i].getClass().getName().equals("lightmotorvehicle"))
				v[i].disp();
		}
		System.out.println("\n\t --------------------------------------------------\n");		
		
		System.out.println("\n\t *********Detail of Heavy Motor Vehicle***********");
		System.out.println("\n\t Name of company \tPrice \t     Cap In Tons");		
		System.out.println("\n\t --------------------------------------------------");
		for(i=0;i<n;i++)
		{
			if(v[i].getClass().getName().equals("heavymotorvehicle"))
				v[i].disp();
		}	
		System.out.println("\n\t --------------------------------------------------\n");
}
   	}
