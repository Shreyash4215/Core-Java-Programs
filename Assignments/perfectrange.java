

class perfectrange
{	
	public static void main(String args[])
	{
	int j,i,n,sum=0,c;
	
	n = Integer.parseInt(args[0]);
	
	System.out.println("\n\t The perfect  number Are : ");
	
	for(i=1;i<=n;i++)
	{
	 sum=0;
	 c=i;
	 
	for(j=1;j<c;j++)
	{
	  if(c%j==0)
	  {
	  sum=sum+j;
	  }
		  
	  }
	
	if(sum==i)
	{
	System.out.println("\n\t "+i);	
	}
	}
	
	}
}