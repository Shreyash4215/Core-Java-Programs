//there is only one objected created so it makes only one copy of each variable

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
class cls8	
{
	
	public static void main(String args[])
	{
						
		demo obj = new demo();
		
		for(int i=0;i<5;i++)  
			obj.disp();
			
	}
}