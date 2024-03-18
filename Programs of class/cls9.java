//there are 5 objected created so it makes 5 copy of each variable

class demo
{
	static int a=10;
	int b=10;
	
	void disp()
	{		
		a++;		b++;
		
		System.out.println("\n\t A = "+a+" B = "+b);
	}
	
}
class cls9	
{
	
	public static void main(String args[])
	{
						
		demo obj1 = new demo();
			obj1.disp();
		
		demo obj2 = new demo();
			obj2.disp();
		
		demo obj3 = new demo();
			obj3.disp();
		
		demo obj4 = new demo();
			obj4.disp();
					
		demo obj5 = new demo();
			obj5.disp();
			
	}
}