//Inheritance
//1) Single / simple

class clsA
{
	void disp1()
	{
	System.out.println("\n\t Im in classA");
	}
}

class clsB extends clsA
{	
	void disp2()
	{	    
	   System.out.println("\n\t Im in classB");
	} 
}

class inh3
{
	public static void main(String args[])
	{
		clsA obj = new clsA();
		obj.disp1();
		//obj.disp2();    We cannot access class B(child class) methods from class A(parent class)
	}
}