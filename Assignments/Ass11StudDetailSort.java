import java.util.*;

class Student
{
	int roll;
	double per;
	String name;	 
	 
	 void get()
	 {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("\n\t Enter your Roll number,name,Percentage= ");
		roll=sc.nextInt();
		name=sc.next();
		per=sc.nextDouble();
	}
	 	  
	 void disp()
	 {	 
		System.out.print("\t "+roll);
		System.out.printf("\t"+name);
		System.out.println("\t   "+per+"\n");
	 }
	 
	 static void sort(int p,Student obj[])
	 {		 
		int n=p;
		Student temp;
		 for(int i=0;i<n;i++)
			 for(int j=i+1;j<n;j++)
			 	if(obj[i].per<obj[j].per)
					{
						temp=obj[i];
						obj[i]=obj[j];
						obj[j]=temp;					
					}
	 }
}
class Ass11StudDetailSort
{
	public static void main(String args[])
	{
		int i,n;
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("\n\t Enter how many students : ");
		n=sc.nextInt();
				
		Student obj[] = new Student[n];	 
		
		for(i=0;i<n;i++)
		{
			obj[i]=new Student();		
			obj[i].get();
		}
		
		
		System.out.println("\n\n\n\t******* Student Details *******");
		System.out.println("\n\tRollno  Name    Percentage\n");
		
		for(i=0;i<n;i++)
			obj[i].disp();
		System.out.println("\t********************************");
		
		Student.sort(n,obj);

		System.out.println("\n\n\n\t**** Sorted Student Details ****");
		System.out.println("\n\tRollno  Name    Percentage\n");
		
		for(i=0;i<n;i++)
			obj[i].disp();
		System.out.println("\t********************************");

	}
}