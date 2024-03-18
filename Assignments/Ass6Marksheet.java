
import java.util.*;

class Student
{
	 int roll,s1,s2,s3,tot;
	 double avg;
	 String name;	 
	 
	 void get()
	 {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("\n\t Enter your Roll number,name,marks of three subject= ");
		roll=sc.nextInt();
		name=sc.next();
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
	 }
	 	  
	 void disp()
	 { 	
		tot=s1+s2+s3;
		avg=tot/3;
	 
		System.out.print("\t "+roll);
		System.out.printf("\t"+name);
		System.out.print("\t   "+s1);
		System.out.printf("\t%8d   ",s2);
		System.out.printf("\t%4d    ",s3);
		System.out.printf("%9d    ",tot);
		System.out.println("\t"+avg+"\n");
	 }
}



class Ass6Marksheet
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
		
		System.out.println("\n\n\n\t************************** Student Details ***************************");
		System.out.println("\n\tRollno  Name    S1_marks    S2_marks    S3_marks     Total     Average\n");
		
		for(i=0;i<n;i++)
			obj[i].disp();
		
		System.out.println("\t***********************************************************************");
	}
}