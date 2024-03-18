// this() function
//  call to "this" must be first statement in constructor

class ClsA
{	
		ClsA()
		{
			System.out.println("\n\t Iam In ClsA");
		}	
		ClsA(int a)
		{
			this();		// call to Def. con_on of current class
			System.out.println("\n\t A = "+(a*a));
		}
}

class inh_con6
{
	public static void main(String args[])
	{		
			new ClsA(5);			// call to par. con_or
		
	}
}