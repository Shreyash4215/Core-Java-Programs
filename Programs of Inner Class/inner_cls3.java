
// Anonymous Class
// 1) A class which has no name is an anonymous class
// 2) Anonymous classes combines the process of definition and initialization into single step
// 3) To create an anonymous inner class, it must either
//    implements an interface OR extends one class 
interface demo		// class / AB Class / Interface
{ 
	void disp();
}

class clsA 
{ 
	void show()
	{
		demo d = new demo()		// implicitly inherited
		{
			public void disp()
			{ 	
				System.out.println("\n\t I am in disp method");
			}
		};				// end of anonymous class
		d.disp();
	}
}
class inner_cls3
{
	public static void main(String args[])
	{	
		clsA obj = new clsA();
		obj.show();
	}
}