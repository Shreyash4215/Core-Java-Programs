//Constructor
//3) copy Constructor

class demo
{
	 int x;
	
	demo(int a)
	{
		x=a;
	}

	demo(demo obj)
	{
		System.out.println("\n\t X = "+x);
		
		System.out.println("\n\t obj X = "+obj.x);
	}	
}

class con3		
{
	public static void main(String args[])
	{	
		 demo obj = new demo(10);      
		 new demo(obj);
       	 
	}
	
}