

class perfect
{	
	public static void main(String args[])
	{
	int i,n,sum=0;
	
	n = Integer.parseInt(args[0]);
	
	
	for(i=1;i<n;i++)
	{
	  if(n%i==0)
	  {
	  sum=sum+i;
	  }
		  
	  }
	
	if(sum==n)
	{
	System.out.println("\n\t "+n+" is a perfect  number ");	
	}
	else
	{
		System.out.println("\n\t "+n+" is NOT a perfect number ");
	}
	}
}