// Interface - 100% abstract class
//  interface abstract methods cannot have body
// interface cannot be instantiated - unable to create obj
// con_or id not allowed 

interface demo
{
	int a=10;		// by default all variables are final/constant
	void disp1();	// by default all methods are abstarct
}

class clsA implements demo
{
		public void disp1()
		{
			System.out.println("\n\t A = "+a);
			// a=11; 		// Error
			System.out.println("\n\t I am in Interface");
		}
		void disp2()
		{
			System.out.println("\n\t I am in Class");
		}
}

class int1
{
	public static void main(String args[])
	{
		clsA obj = new clsA();
		obj.disp1();
		obj.disp2();
	}
}
