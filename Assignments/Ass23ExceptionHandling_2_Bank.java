
import java.util.*;

class InsufficientFundsException extends Exception
{
	
}
class savingacc
{
	Scanner sc = new Scanner(System.in);
	
	int acNo,balance;
	String name;
	
	savingacc(int acNo,int balance,String name)
	{
		this.acNo=acNo;
		this.balance=balance;
		this.name=name;
	}
		
	void withdraw()
	{
		System.out.print("\n\t Enter Amount to withdrwal: ");
		int k=sc.nextInt();
		try
		{
			if(balance-k<500)
			{
				throw new InsufficientFundsException();
			}
			else
			{
				balance=balance-k;
			}
				System.out.println("\n\t Your Available Balance is "+balance);
		}
		catch(InsufficientFundsException ex)
		{
			System.out.println("\n\t You can't Withdrawl...reqiured minimum=500");
		}
		catch(Exception ex)
		{
			System.out.println("\n\t Exception Occurs");
		}
	}
	
	void deposit()
	{
		System.out.print("\n\t Enter ammount to insert: ");
		int n=sc.nextInt();
				
		balance=balance+n;
				
		System.out.println("\n\t Your Available Balance is "+balance);		
	}
	
	void viewBalance()
	{
		System.out.println("\n\t Your Available Balance is "+balance);
	}
}
class Ass23ExceptionHandling_2_Bank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int accNo,bal,ch;
		String nme;
			 		
		System.out.print("\n\t Enter your account number,balance,name");
		accNo=sc.nextInt();
		bal=sc.nextInt();
		nme=sc.next();
		
		savingacc s =new savingacc(accNo,bal,nme);
	    
		while(true)
		{
			System.out.println("\n\t*************MENU***********");
			System.out.println("\n\t 1.Withdrawl Money");
			System.out.println("\n\t 2.Insert Money");
			System.out.println("\n\t 3.View Balance");
			System.out.println("\n\t 4.Exit");
			System.out.println("\n\t******************************");
			
			System.out.print("\n\t Enter Your choice : ");
			ch=sc.nextInt();
				
		switch(ch)
		{
			case 1:
			{
				s.withdraw();	
				break;		
			}
			case 2:
			{
				s.deposit();
				break;		
			}
			case 3:
			{
				s.viewBalance();
				break;		
			}
			case 4:
			{
				return;		
			}
		}
	  }		
	}
}