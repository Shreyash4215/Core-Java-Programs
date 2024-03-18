// Abstract Class + multilevel inheritance + Method overriding

abstract class clsA
{
	abstract void disp1();		//Declaration
	
	void disp2()
	{
		System.out.println("\n\t i am in disp2");
	}
}

abstract class clsB extends clsA
{	
	void disp1()		//MEthod of clsA
	{
		System.out.println("\n\t i am in dis1 clsB");
	}
	
	void disp3()
	{
		System.out.println("\n\t i am in disp3");
	}
}

class clsC extends clsB
{
	void disp1()		//MEthod of clsA
	{
		System.out.println("\n\t i am in dis1 clsC");
	}
}

class ab3
{
	public static void main(String args[])
	{
		clsC obj = new clsC();
		obj.disp1();
		obj.disp2();
		obj.disp3();		
	}
}