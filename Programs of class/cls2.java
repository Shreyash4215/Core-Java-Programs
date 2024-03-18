
class demo
{
	int a;
}

class cls2
{
	public static void main(String args[])
	{
		demo obj1 = new demo();				
		
		obj1.a=11;		
		System.out.println("\n\t A= "+obj1.a);
		
		demo obj2 = new demo();
	
	System.out.println("\n\t A= "+obj2.a);

	}
}