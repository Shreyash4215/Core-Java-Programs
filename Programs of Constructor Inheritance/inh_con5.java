// this() function
//  call to "this" must be first statement in constructor

class ClsA
{	
		ClsA()
		{
			this(5);		// call to para. con_on of current class
			System.out.println("\n\t Iam In ClsA");
		}	
		ClsA(int a)
		{
			System.out.println("\n\t A = "+(a*a));
		}
}

class inh_con5
{
	public static void main(String args[])
	{		
			new ClsA();			// call to def. con_or		
	}
}