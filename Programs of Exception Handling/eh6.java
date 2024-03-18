// finally block

class eh6
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
		finally
		{
			System.out.println("\n\t I am in finally block");						
		}
		System.out.println("\n\t *** Prog Ends ***");
	}
}
