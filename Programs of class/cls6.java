//different variable

class demo
{
	static int a=10;
	int b=10;
	
	void disp()
	{
		int c=10;
		c++;
		System.out.println("\n\t A = "+a);
		System.out.println("\n\t B = "+b);
		System.out.println("\n\t C = "+c);
	}
	
}
class cls6	
{
	
	public static void main(String args[])
	{
						
		demo obj1 = new demo();
		obj1.a++;
		obj1.b++;
		obj1.disp();
	}
}