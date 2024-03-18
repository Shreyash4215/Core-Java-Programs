import java.util.*;

abstract class creditcrd
{
	abstract void view_credit_amt();
	abstract void useCard();
	abstract void payCredit();
}

class silvercrdcust extends creditcrd
{
	Scanner sc = new Scanner(System.in);
	
	String name;
	int paycrd,crdno,cr,creditlimt=50000,creatamt=0;
	
	void useCard()
	{
		System.out.print("\n\t Enter your Name,cardno(card no is 16digit), Amount to withdrawl: ");
		name=sc.next();
		crdno=sc.nextInt();
		cr=sc.nextInt();
		if(creatamt+cr<=creditlimt)
		{
			creatamt=creatamt+cr;			
			System.out.print("\n\t Your requast is successfully proceed  ");
		}	
		else
			System.out.print("\n\t Insufficient balance ");			
	}
	void view_credit_amt()
	{
		System.out.print("\n\t Credit amount is "+creatamt);
	}
	void payCredit()
	{
		System.out.print("\n\t Enter Amount to pay credit");
		paycrd=sc.nextInt();
		
		if(creatamt-paycrd>=0)
		{
			creatamt=creatamt-paycrd;			
			System.out.print("\n\t Your requast is successfully proceed  ");
		}
		else
			System.out.print("\n\t Unable to procced your requast");		
	}	
}
class gldcrd extends silvercrdcust
{
	Scanner sc = new Scanner(System.in);
		
	int crd,creditlimt=100000;
	static int cnt=0; 
	
	void increaseLimit()
	{
		cnt++;		
		if(cnt<=3)
		{	
		   System.out.print("\n\t Enter Amount to increase credit limit");
		   crd=sc.nextInt();
		   if(crd<=5000)
		   {
				creditlimt=creditlimt+crd;
				System.out.print("\n\t Your requast is successfully proceed now your credit limit is: "+creditlimt);
		   }
		   else
			   System.out.print("\n\t Unable to procced your requast you cant increse limit more than 5000 at one time");					
		}
		else
		{
			   System.out.print("\n\t Unable to procced your requast you cant increse limit more than 3 times");
		}	
	}	
}
class Ass16AbstrctClsCreditCrd
{
	public static void main(String args[])
	{
		int ch,chh;
		Scanner sc = new Scanner(System.in);
	
		silvercrdcust s=new silvercrdcust();
		gldcrd g=new gldcrd();
		while(true)
		{
			System.out.print("\n\t ******MENU*******\n\t 1.Silver Card \n\t 2.Gold card\n\t 3.Exit \n\n\tEnter Your choice  ");
			ch=sc.nextInt();
			
			if(ch==1)
			{			
				System.out.print("\n\t ******MENU For Silver Card*******\n\t 1.Use Card \n\t 2.view credit amount\n\t 3.Pay Credit \n\n\tEnter Your choice  ");
				chh=sc.nextInt();
				
				if(chh==1)
				{
					s.useCard();
				}
				
				if(chh==2)
				{
					s.view_credit_amt();
				}
				
				if(chh==3)
				{
					s.payCredit();
				}			
			}
			else if(ch==2)
			{						
				System.out.print("\n\t ******MENU For Gold Card*******\n\t 1.Use Card \n\t 2.view credit amount\n\t 3.Pay Credit\n\t 4.Increase Credit Limit \n\n\tEnter Your choice  ");
				chh=sc.nextInt();
				
				if(chh==1)
				{
					g.useCard();
				}
				
				if(chh==2)
				{
					g.view_credit_amt();
				}
				
				if(chh==3)
				{
					g.payCredit();
				}
				if(chh==4)
				{
					g.increaseLimit();
				}
				
			}
			else
				System.exit(0);
			}
	}
}