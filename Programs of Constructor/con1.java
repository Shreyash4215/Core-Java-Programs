//Constructor
//1) Default Constructor

class demo
{
	demo()
	{
		System.out.println("\n\t I am in default con");
	}
	
	
}

class con1		
{
	public static void main(String args[])
	{	
		demo obj = new demo();          //implicitly
		
		new demo();					//explicitly
	}
	
}