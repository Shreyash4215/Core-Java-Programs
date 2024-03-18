// rethrowing exception

class eh5
{
	public static void main(String args[])
	{
		System.out.println("\n\t *** Prog Starts ***");
		try
		{
			try
			{
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				int c = a/b;		
				System.out.println("\n\t Division = "+c);
			}
			catch(ArithmeticException ex)
			{
				throw(ex);
			}			
		}
		catch(Exception ex)
		{
			System.out.println("\n\t Outer - Exception Caught \n" + ex);			
		}
		System.out.println("\n\t *** Prog Ends ***");
	}
}
