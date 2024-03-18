

class prime
{	
	public static void main(String args[])
	{
	int i,n,flag=0;
	
	n = Integer.parseInt(args[0]);
	
	for(i=2;i<n;i++)
	{
	if(n%i==0)
	{
	flag=1;
	}
	}
	if(flag==0)
	{
	System.out.println("\n\t "+n+" is a prime number ");	
	}
	else
	{
		System.out.println("\n\t "+n+" is NOT a prime number ");
	}
	}
}