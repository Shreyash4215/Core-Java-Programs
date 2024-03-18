//Inheritance
/*1) Simple:
		1)public
		2)private
		3)protected
*/		

class clsA
{
	private int a;
	public int b;
	protected int c;
}

class clsB extends clsA
{	
	void disp()
	{	    
	  // a=10;    We cant access a beacause this is private
	   b=20;
	   c=30;
	} 
}


class inh4
{
	public static void main(String args[])
	{
		clsB obj = new clsB();
		obj.disp();
		System.out.println("\n\t B = "+obj.b);
		System.out.println("\n\t c = "+obj.c);
		
	}
}