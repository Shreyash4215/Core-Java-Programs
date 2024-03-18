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

class inh2
{
	public static void main(String args[])
	{
		clsB obj = new clsB();
		obj.disp1();
		obj.disp2();
	}
}