// Method Overriding
// final method 
// to avoid method overriding base class can declare method as a final

class ClsA
{	
		 final void Disp()
		{
			System.out.println("\n\t Iam In ClsA");
		}			
}

class ClsB extends ClsA
{
	/* void Disp()		// vcannot override
	{
		System.out.println("\n\t I am in clsB");
	}*/	
}

class inh_con10finalise
{
	public static void main(String args[])
	{		
			ClsB obj=new ClsB();
			obj.Disp();
	}
}