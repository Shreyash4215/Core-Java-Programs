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
	    disp1();	
	   System.out.println("\n\t Im in classB");
	} 
}

class inh1
{
	public static void main(String args[])
	{
		clsB obj = new clsB();
		
		obj.disp2();
	}
}