// Nested try-catch block

class eh4
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
				System.out.println("\n\t Inner - Cannot Divide by Zero");			
			}			
		}
		catch(Exception ex)
		{
			System.out.println("\n\t Outer - Exception Caught \n" + ex);			
		}
		System.out.println("\n\t *** Prog Ends ***");
	}
}
