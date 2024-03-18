
class demo
{
	int a;
}

class cls1
{
	public static void main(String args[])
	{
		demo obj;				//instance
		obj = new demo();		//Object OR Memory allocation		
		
		obj.a=11;
		
		System.out.println("\n\t A= "+obj.a);
	}
}