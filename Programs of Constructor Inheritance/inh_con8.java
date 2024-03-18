// super() function
//  call to "super" must be first statement in constructor

class ClsA
{	
		ClsA()
		{
			System.out.println("\n\t Iam In ClsA");
		}	
		ClsA(int a)
		{			
			System.out.println("\n\t A = "+(a*a));
		}
}

class ClsB extends ClsA
{
	ClsB()
	{
		super(5);	// call Par. con_or of base class
		System.out.println("\n\t I am in clsB");
	}	
}

class inh_con8
{
	public static void main(String args[])
	{		
			new ClsB();			
	}
}