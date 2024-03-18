//Constructor
//2) Paramaterizd Constructor
// if you want to write para. con. you have to write default con. because we cant called simple method through parameterized object\


class demo
{
	demo()
	{
		System.out.println("\n\t I am in default con");
	}

	demo(int a)
	{
		System.out.println("\n\t Square = "+a);
	}	
}

class con2		
{
	public static void main(String args[])
	{	
		 new demo();      
		 new demo(10);			
	}
	
}