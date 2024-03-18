//Inheritance
//3)Hierarchycal 

class company    //Base
{
	 int sal;
}

class mng extends company 	//Derived
{	
	void disp1()
	{	 
	  sal=500000; 
	  System.out.println("\n\t Manager sal = "+sal);
	} 
}

class pl extends company	//Derived
{	
	void disp2()
	{	    
	  sal=250000; 
	  System.out.println("\n\t pl sal = "+sal);
	} 
}

class emp extends company	//Derived
{	
	void disp3()
	{	    
	  sal=10000; 
	  System.out.println("\n\t Emp sal = "+sal);
	} 
}


class inh6
{
	public static void main(String args[])
	{
		mng m = new mng();
		m.disp1();
		
		pl p = new pl();
		p.disp2();
		
		emp e = new emp();
		e.disp3();
	}
}