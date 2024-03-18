
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



class Ass7OppStudInfo
{
	public static void main(String args[])
	{
		int i,n,ch,j,flag=0,rsrch;
		String nsrch;		
		
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
		
		Student temp;
		
		while(true)
		{		
		
		 System.out.println("\n\t #################### MENU ########################");		 
		 System.out.println("\n\t 1.Sort by Roll Number ");
		 System.out.println("\n\t 2.Sort by Avarage ");
		 System.out.println("\n\t 3.Search by Roll Number ");
		 System.out.println("\n\t 4.Search by Name ");
		 System.out.println("\n\t 5.Update by Roll Number ");
		 System.out.println("\n\t 6.Display All Data");
		 System.out.println("\n\t 7.Exit ");
		 System.out.println("\n\t ##################################################");
		 
		 
		System.out.print("\n\t Enter Your choice : ");
		ch=sc.nextInt();
		
			switch(ch)
			{
				case 1:
				{
					for(i=0;i<n;i++)
						for(j=i+1;j<n;j++)
						{
							if(obj[i].roll>obj[j].roll)
							{
								temp=obj[i];
								obj[i]=obj[j];
								obj[j]=temp;								
							}
						}
						
					System.out.println("\n\n\n\t********************* Sorted Student Details ***************************");
					System.out.println("\n\tRollno  Name    S1_marks    S2_marks    S3_marks     Total     Average\n");
					
					for(i=0;i<n;i++)
						obj[i].disp();
					System.out.println("\t***********************************************************************");	
					break;						
				}
				case 2:
				{
					for(i=0;i<n;i++)
						for(j=i+1;j<n;j++)
						{
							if(obj[i].avg<obj[j].avg)
							{
								temp=obj[i];
								obj[i]=obj[j];
								obj[j]=temp;								
							}
						}
						
					System.out.println("\n\n\n\t***************** Sorted Average Student Details *********************");
					System.out.println("\n\tRollno  Name    S1_marks    S2_marks    S3_marks     Total     Average\n");
					
					for(i=0;i<n;i++)
						obj[i].disp();
					System.out.println("\t***********************************************************************");	
					break;						
				}				
				
				case 3:
				{
					System.out.print("\n\t Enter Student Roll number you want search : ");
					rsrch=sc.nextInt();
		
					for(i=0;i<n;i++)
						if(obj[i].roll==rsrch)
						{
							flag=1;
							break;
						}	
						if(flag==1)
						{
							System.out.println("\n\n\n\t********************* Search Student Details ***************************");
							System.out.println("\n\tRollno  Name    S1_marks    S2_marks    S3_marks     Total     Average\n");
												
								obj[i].disp();
							System.out.println("\t***********************************************************************");
						}							
						else
							System.out.println("\n\n\t Student Not found  ");
						
					flag=0;						
					break;						
				}

				case 4:
				{
					System.out.print("\n\t Enter Student Name you want search : ");
					nsrch=sc.next();
						
					System.out.print("\n\t nsrch= "+nsrch);	
					
					for(i=0;i<n;i++)
						if(obj[i].name.equals(nsrch))
						{
							flag=1;
							break;
						}					

						if(flag==1)
						{
							System.out.println("\n\n\n\t********************* Search Student Details ***************************");
							System.out.println("\n\tRollno  Name    S1_marks    S2_marks    S3_marks     Total     Average\n");
												
								obj[i].disp();
							System.out.println("\t***********************************************************************");
						}							
						else
							System.out.println("\n\n\t Student Not found  ");
						
					flag=0;						
					break;						
				}
				case 5:
				{
					System.out.print("\n\t Enter Student Roll number you want search : ");
					rsrch=sc.nextInt();
		
					for(i=0;i<n;i++)
						if(obj[i].roll==rsrch)
						{
							System.out.print("\n\t Enter Student new marks : ");
							obj[i].s1=sc.nextInt();
							obj[i].s2=sc.nextInt();
							obj[i].s3=sc.nextInt();
																			
							flag=1;
							break;
						}	
						if(flag==1)
						{
							System.out.println("\n\n\n\t********************* Updated Student Details ***************************");
							System.out.println("\n\tRollno  Name    S1_marks    S2_marks    S3_marks     Total     Average\n");
												
								obj[i].disp();
							System.out.println("\t***********************************************************************");
						}							
						else
							System.out.println("\n\n\t Student Not found  ");
						
					flag=0;						
					break;						
				}
				
				case 6:
				{
					System.out.println("\n\n\n\t************************** Student Details ***************************");
					System.out.println("\n\tRollno  Name    S1_marks    S2_marks    S3_marks     Total     Average\n");
					
					for(i=0;i<n;i++)
						obj[i].disp();
					
					System.out.println("\t***********************************************************************");

					break;
				}
				
				case 7:
				{
					System.exit(0);
					
				}
			}
		
		}
	}
}