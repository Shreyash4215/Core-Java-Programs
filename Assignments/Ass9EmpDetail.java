import java.util.*;

class Employee
{
	 private int id,sal; 
	 private String name,dept;
		
	Scanner sc = new Scanner(System.in);	
	
	void get1()
	{
		System.out.print("\n\t Enter Employe id,name,department,salary : ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		sal=sc.nextInt();
	}
	
	int sall()
	{
		return sal;
	}
	
	void disp2()
	{
		System.out.print("\t"+id+"\t"+name+"\t"+dept+"\t\t"+sal);
	}
}
class Manager extends Employee
{
	 private int bonus;
	 int tot,sl;
	
	void get()
	{	
		get1();
		System.out.print("\n\t Enter Bonus for manager : ");
		bonus=sc.nextInt();
		sl=sall();
		tot=bonus+sl;
	}	
	void disp()
	{
		disp2();
		System.out.println("\t"+bonus+"\t"+tot+"\n");
	}
}
class Ass9EmpDetail
{	
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
		 
		 int i,n,j;
		 
		 System.out.print("\n\t Enter how many manager you want : ");
		 n=sc.nextInt();
		 
	     Manager Mg[] = new Manager[n];
		 Manager temp;
		 
		 for(i=0;i<n;i++)
			 { 
				Mg[i]=new Manager();
				Mg[i].get();
			 }			 
		 for(i=0;i<n;i++)
			 for(j=i+1;j<n;j++)
			 {		
				 if(Mg[i].tot<Mg[j].tot)
				 {
					 System.out.println("\ncome");
					 temp=Mg[i];
					 Mg[i]=Mg[j];
					 Mg[j]=temp;
				 }
			 }
			 
		 System.out.println("\n\n\t*************** Detail of Max sal Manager *****************");			 	
		 System.out.println("\n\tId\tName\tDepartment\tSalary\tbonas\tTOTSalary\n");
		 System.out.println("\t---------------------------------------------------------------");
					Mg[0].disp();								
		 System.out.println("\t---------------------------------------------------------------");
	}
}