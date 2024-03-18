

class fact
{	
	public static void main(String args[])
	{
	int i,n,fact=1;
	
	n = Integer.parseInt(args[0]);
	
	for(i=1;i<=n;i++)
	fact=fact*i;
		
	System.out.println("\n\t fact = "+fact);	
	
	}