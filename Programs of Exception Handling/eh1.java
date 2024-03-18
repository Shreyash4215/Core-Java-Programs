// Simple try-catch block

class eh1
{
	public static void main(String args[])
	{
		System.out.println("\n\t *** Prog Starts ***");
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;		
			System.out.println("\n\t Division = "+c);
		}
		catch(Exception ex)
		{
			System.out.println("\n\t Exception Caught \n" + ex);			
		}
		System.out.println("\n\t *** Prog Ends ***");
	}
}
