//Function overloading
//2) type of parameter

class demo
{
	void disp(int a)
	{
		System.out.println("\n\t Square = "+(a*a));
	}
	
	void disp(double a,double b)
	{
		System.out.println("\n\t A = "+a+"  And B= "+b);
	}
	
	void disp(String a,String b)
	{
		System.out.println("\n\t A = "+a+"  And B= "+b);
	}
}

class fun2		
{
	public static void main(String args[])
	{	
		demo obj = new demo();
		
		obj.disp(10);
		obj.disp(10,20);
		obj.disp("Shree","Apps");
	}
	
}