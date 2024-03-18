//Array Of Object
//Problem Statement = Need of  Array object

import java.util.*;

class Student
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
class AryObj1
{
	public static void main(String args[])
	{
		int i;
		Student obj = new Student();
		
		for(i=0;i<5;i++)
			obj.get();
		for(i=0;i<5;i++)
			obj.disp();
		
	}
}