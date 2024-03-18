// Polymorphism - method overriding is must
//Compile time
//3)Hierarchycal inheritance 

/*
class company    //Base
{
	 int sal;	 
	 void disp()
	 {
		 System.out.println("\n\t SAL = July 2021");
	 }
}
*/

abstract class company    //Base
{
	 int sal;
	 abstract void disp();
}

class mng extends company 	//Derived
{	
	void disp()
	{	
	  sal=500000; 
	  System.out.println("\n\t Manager sal = "+sal);
	} 
}

class pl extends company	//Derived
{	
	void disp()
	{	    
	  sal=250000; 
	  System.out.println("\n\t pl sal = "+sal);
	} 
}

class emp extends company	//Derived
{	
	void disp()
	{	    
	  sal=10000; 
	  System.out.println("\n\t Emp sal = "+sal);
	} 
}


class poly1
{
	public static void main(String args[])
	{
		company c;
		
		c = new mng();
		c.disp();
		
		c = new pl();
		c.disp();
		
		c = new emp();
		c.disp();
	}
}