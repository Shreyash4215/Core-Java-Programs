//Function overloading
//1) number of parameter

class demo
{
	void disp()
	{
		System.out.println("\n\t i am in disp");
	}
	
	void disp(int a)
	{
		System.out.println("\n\t Square = "+(a*a));
	}
	
	void disp(int a,int b)
	{
		System.out.println("\n\t Additon = "+(a+b));
	}
}

class fun1		
{
	public static void main(String args[])
	{	
		demo obj = new demo();
		
		obj.disp();
		obj.disp(10);
		obj.disp(10,20);
	}
	
}