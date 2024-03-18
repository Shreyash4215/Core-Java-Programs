//different variable

class demo
{
	static int a=10;    //Static variable
	int b=10;		   //Instance variable
	
	void disp()
	{
		int c=10;     //Local variable
		c++;
		System.out.println("\n\t A = "+a);
		System.out.println("\n\t B = "+b);
		System.out.println("\n\t C = "+c);
	}
	
}
class cls7	
{
	
	public static void main(String args[])
	{
						
		demo obj1 = new demo();
		obj1.a++;
		obj1.b++;
		obj1.disp();
	
		demo obj2 = new demo();
		obj2.a++;
		obj2.b++;
		obj2.disp();
	
	}
}