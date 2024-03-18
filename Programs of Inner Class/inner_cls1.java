// Inner class
class A
{       
	int a = 10;
	void displaya()
	{  
		System.out.println("Value of a = "+ a);
	}

	class B 					//inner class
	{  
		int b = 20;
		void displayb()
		{  
			displaya(); //invoke method of A directly 
			System.out.println("Value of a = "+ a + " Value of b = " + b);
		}
	}		// end of inner class	

	void createInner()
	{
		B inner = new B();
		inner.displayb();	//invoke inner class method
	}
}		// end of outer class A

class inner_cls1
{
	public static void main(String[] args)
	{
		A outer = new A();
		outer.createInner();
	}
}