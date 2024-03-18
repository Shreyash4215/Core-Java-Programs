// User Defined Exceptions

class AgeInvalid extends Exception
{
	AgeInvalid()
	{
		System.out.println("\n\t Age must be > 0");
	}
}

class ueh2
{
	public static void main(String args[])
	{
		try
		{
			int age = Integer.parseInt(args[0]);
			
			if(age > 0)
				System.out.println("\n\t Your Age = "+age);
			else 
			{
				throw new AgeInvalid();
//				AgeInvalid obj = new AgeInvalid();
//				throw obj;
			}
		}
		catch(AgeInvalid ex)
		{
		}		
		catch(Exception ex)
		{
			System.out.println("\n\t Exception Caught");
		}
	}
}
