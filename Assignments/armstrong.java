

class armstrong
{	
	public static void main(String args[])
	{
	int i,n,sum=0,bup=0;
	
	n = Integer.parseInt(args[0]);
	
	bup=n;
	
	for(;n>0;n=n/10)
	{
	  i=n%10;
	  sum=sum+(i*i*i);
	}
	
	if(sum==bup)
	{
	System.out.println("\n\t "+bup+" is a armstrong  number ");	
	}
	else
	{
		System.out.println("\n\t "+bup+" is NOT a armstrong number ");
	}
	}
}