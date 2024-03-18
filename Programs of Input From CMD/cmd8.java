// string => length() => function
// array => length => keyword

class cmd8
{	
	public static void main(String args[])
	{
	int sum=0;
	
	if(args.length>0)
	{
	for(int i=0;i<args.length;i++)
	sum=sum+Integer.parseInt(args[i]);
	
	System.out.println("\n\t sum = "+sum);
	}
	else
	{
	System.out.println("\n\t No.para passed");
	}
	}
}