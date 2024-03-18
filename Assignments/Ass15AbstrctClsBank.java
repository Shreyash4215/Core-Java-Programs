import java.util.*;

abstract class creditcrd
{
	abstract void view_credit_amt();
	abstract void useCard();
	abstract void payCredit();
	 void increaseLimit()
	 {
		 
	 }
}

class silvercrdcust extends creditcrd
{
	Scanner sc = new Scanner(System.in);
	
	String name;
	int paycrd,crdno,cr,creditlimt=50000;
	static int creatamt=0;
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

class gldcrd extends creditcrd
{
	Scanner sc = new Scanner(System.in);
	
	String name;
	int crdno,cr,paycrd,crd;
	static int creatamt=0,creditlimt=100000;
	
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
	void increaseLimit()
	{
	   System.out.print("\n\t Enter Amount to increase credit limit");
	   crd=sc.nextInt();
	   if(crd<=5000)
	   {
			creditlimt=creditlimt+crd;
			System.out.print("\n\t Your requast is successfully proceed now your credit limit is: "+creditlimt);
	   }
	   else
		   System.out.print("\n\t Unable to procced your requast");					
	}
	
}

class Ass15AbstrctClsBank
{
	public static void main(String args[])
	{
		int n,ch,chh,i;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("\n\t How many transaction do you want:  ");
		n=sc.nextInt();

	
		creditcrd c[]= new creditcrd[n];
		
		for(i=1;i<n;i++)
		{	
		System.out.print("\n\t ******MENU*******\n\t 1.Silver Card \n\t 2.Gold card \n\n\tEnter Your choice  ");
		ch=sc.nextInt();
		
		if(ch==1)
		{
			c[i]=new silvercrdcust();
			System.out.print("\n\t ******MENU For Silver Card*******\n\t 1.Use Card \n\t 2.view credit amount\n\t 3.Pay Credit \n\n\tEnter Your choice  ");
			chh=sc.nextInt();
			
			if(chh==1)
			{
				c[i].useCard();
			}
			
			if(chh==2)
			{
				c[i].view_credit_amt();
			}
			
			if(chh==3)
			{
				c[i].payCredit();
			}			
		}
		else
		{	
			
			c[i]=new gldcrd();
			
			System.out.print("\n\t ******MENU For Gold Card*******\n\t 1.Use Card \n\t 2.view credit amount\n\t 3.Pay Credit\n\t 4.Increase Credit Limit \n\n\tEnter Your choice  ");
			chh=sc.nextInt();
			
			if(chh==1)
			{
				c[i].useCard();
			}
			
			if(chh==2)
			{
				c[i].view_credit_amt();
			}
			
			if(chh==3)
			{
				c[i].payCredit();
			}
			if(chh==4)
			{
				c[i].increaseLimit();
			}
			
		}
		}
	}
}