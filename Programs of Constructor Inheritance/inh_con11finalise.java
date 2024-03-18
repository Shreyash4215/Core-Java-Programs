// Method Overriding
// final class 
// to avoid inheritance - base class can declare class as a final

final class ClsA
{	
		 void Disp()
		{
			System.out.println("\n\t Iam In ClsA");
		}			
}

/*class ClsB extends ClsA	// cannot override
{
	 void Disp()		
	{
		System.out.println("\n\t I am in clsB");
	}	
}*/

class inh_con11finalise
{
	public static void main(String args[])
	{		
			ClsA obj=new ClsA();
			obj.Disp();
	}
}