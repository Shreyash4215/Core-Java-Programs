
import java.util.*;

class ass3while
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int bal=0,n,ch,k;
		
		while(true)
		{
			
		System.out.println("\n\t*************MENU***********");
		System.out.println("\n\t 1.Insert Money");
		System.out.println("\n\t 2.Withdrawl Money");
		System.out.println("\n\t 3.Exit");
		System.out.println("\n\t******************************");
		
		System.out.print("\n\t Enter Your choice : ");
		ch=sc.nextInt();
			
		switch(ch)
		{
			case 1:
			{
				System.out.print("\n\t Enter ammount to insert: ");
				n=sc.nextInt();
				
				bal=bal+n;
				
				System.out.println("\n\t Your Available Balance is "+bal);
				break;		
			}
			case 2:
			{
				System.out.print("\n\t Enter Amount to withdrwal: ");
				k=sc.nextInt();
				if(bal-k<500)
				{
					System.out.println("\n\t You can't Withdrawl...reqiured minimum=500");
				}
				else
				{
				bal=bal-k;
				}
				System.out.println("\n\t Your Available Balance is "+bal);
				break;		
			}
			case 3:
			{
				return;
			}
		}
		}
	}
}