// Abstract Class
// abstract methods cannot have a body

// abstract class cannot be instantiated
// i.e. we can not create obj of AB class
// but we can create instance of AB class

abstract class clsA
{
	abstract void disp1();		//Declaration
	
	void disp2()
	{
		System.out.println("\n\t i am in disp2");
	}
}

class clsB extends clsA
{
	void disp1()		//MEthod of clsA
	{
		System.out.println("\n\t i am in dis1");
	}

	void disp3()
	{
		System.out.println("\n\t i am in disp3");
	}
}

class ab1
{
	public static void main(String args[])
	{
	//	clsA objA = new clsA();			thats is not possible bacause clsA is abstract class
		clsB obj = new clsB();
		obj.disp1();
		obj.disp2();
		obj.disp3();
		
	}
}