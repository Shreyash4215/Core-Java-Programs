// Abstract Class + constructor

abstract class clsA
{
	clsA()
	{
		System.out.println("\n\t i am in clsA constructor");
	}
	abstract void disp1();		//Declaration
}

 class clsB extends clsA
{	
	clsB()
	{
		super();        //when we Want to call para. constructor use super 
	}

	void disp1()		//MEthod of clsA
	{
		System.out.println("\n\t i am in dis1");
	}
	
	void disp2()
	{
		System.out.println("\n\t i am in disp2");
	}
}

class ab4
{
	public static void main(String args[])
	{
		clsB obj = new clsB();
		obj.disp1();
		obj.disp2();		
	}
}