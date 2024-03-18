

class armstrongrange
{	
	public static void main(String args[])
	{
	int j,i,n,sum=0,b;
	
	n = Integer.parseInt(args[0]);
	
	System.out.println("\n\t The armstrong  numbers are: ");
	
	for(i=1;i<=n;i++)
	{
        sum=0;
        		
	for(b=i;b>0;b=b/10)
	{
	  j=b%10;
	  sum=sum+(j*j*j);
	}
	
	if(sum==i)
	{
	System.out.println("\n\t "+i);	
	}
	}
	
	}
}