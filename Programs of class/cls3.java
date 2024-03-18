
class demo
{
	int a;
}

class cls3	
{
	public static void main(String args[])
	{
		demo obj1 = new demo();				
		
		obj1.a=11;		
		System.out.println("\n\t A= "+obj1.a);
		
		demo obj2 = obj1;
	
		System.out.println("\n\t A= "+obj2.a);
		obj2.a=22;
		
		System.out.println("\n\t A= "+obj1.a);
		System.out.println("\n\t A= "+obj2.a);
	}
}