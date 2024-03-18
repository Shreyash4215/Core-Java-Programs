

class primerange
{	
	public static void main(String args[])
	{
	int j,i,n,flag=0,k;
	
	n = Integer.parseInt(args[0]);
		
	System.out.println("\n\t the prime numbers are: ");

	for(j=1;j<=n;j++)
	{
	flag=0;
	k=j;
	
	for(i=2;i<k;i++)
	{
	if(k%i==0)
	{
	flag=1;
	}
	}
	if(flag==0)
	{
	System.out.println("\n\t "+k);	
	}
	
	}
	
	}
}