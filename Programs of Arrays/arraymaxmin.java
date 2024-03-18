//array in java

class arraymaxmin
{	
	public static void main(String args[])
	{
		
     int max,min,a[];     
	 a= new int[5];     
	
	
	for(int i=0;i<5;i++)
		a[i] = Integer.parseInt(args[i]);
	
	
	max=min=a[0];
	
	for(int i=0;i<5;i++)
	{
	if(max<a[i])
	{
	max=a[i];
	}
	if(min>a[i])
	{
	min=a[i];
	}
	}

	System.out.println("\n\t max = "+max);			
	System.out.println("\n\t min = "+min);
 
	}
}