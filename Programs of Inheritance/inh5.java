//Inheritance
//2) Multilevel

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

class clsC extends clsB
{	
	void disp3()
	{	    
		//disp1();
		//disp2();
	    System.out.println("\n\t Im in classC");
	} 
}

class inh5
{
	public static void main(String args[])
	{
		clsC obj = new clsC();
		obj.disp1();
		obj.disp2();
		obj.disp3();
		
	}
}