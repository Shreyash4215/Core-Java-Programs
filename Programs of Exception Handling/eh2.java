// try with multiple catch block

class eh2
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
		catch(ArithmeticException ex)
		{
			System.out.println("\n\t Cannot Divide by Zero ");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("\n\t Invalid Number Entered ");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\n\t Invalid Number of input ");
		}
		catch(Exception ex)
		{
			System.out.println("\n\t Other Exception Caught \n" + ex);			
		}
		System.out.println("\n\t *** Prog Ends ***");
	}
}
