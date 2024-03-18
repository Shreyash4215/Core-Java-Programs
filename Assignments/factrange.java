//  factorial range

class factrange
{	
	public static void main(String args[])
	{
	int i,j,n,fact=1;
	
	n = Integer.parseInt(args[0]);
	
	System.out.println("\n\t factorial range = ");
	
	for(i=1;i<=n;i++)
	{
		 fact=1;
		
	for(j=1;j<=i;j++)
	{
	fact=fact*j;
	}
	System.out.println("\n\t  "+fact);	
	}		
	}
}