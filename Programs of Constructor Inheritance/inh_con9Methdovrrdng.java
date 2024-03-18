// Method Overriding
/*
In a class hierarchy, when a method in a subclass has the same name and type signature as a method in its superclass, then the method in the subclass is said to override the method in the superclass. 
When an overridden method is called from within a subclass, it will always refer to the version of that method defined by the subclass. The version of the method defined by the superclass will be hidden.
*/

class ClsA
{	
		 void Disp()
		{
			System.out.println("\n\t Iam In ClsA");
		}	
		
}

class ClsB extends ClsA
{
	 void Disp()
	{
		System.out.println("\n\t I am in clsB");
	}	
}

class inh_con9Methdovrrdng
{
	public static void main(String args[])
	{		
			ClsB obj=new ClsB();
			obj.Disp();
	}
}