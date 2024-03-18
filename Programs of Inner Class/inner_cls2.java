// Local Inner class
class A
{
    void createInner()
	{
		class B 					//inner class
        {
			int b=10;
			
			void displayb()
			{
				System.out.println("Value of b = " + b);
			}
		}	// end of inner class
		
		B inner = new B();
		inner.displayb(); 		//invoke inner class method
	}
}
class inner_cls2
{  
	public static void main(String[] args)
	{            
		A outer = new A();
		outer.createInner();
	}
}
