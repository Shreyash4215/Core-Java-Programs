// Handling multiple exceptions

class eh3
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40};
		int b[]={2,4,0,8,10,12};
		
		for(int i=0;i<b.length;i++)
		{
			try
			{
				int c=a[i] / b[i];
				System.out.println("\n\t Div = "+c);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("\n\t Cannot Divide by Zero ");	
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("\n\t Invalid Array Index ");	
			}
		}
	}
}
