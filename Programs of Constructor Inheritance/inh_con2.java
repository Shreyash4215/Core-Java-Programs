// Multilevel Inheritance + Con_or

class ClsA
{
	ClsA()
	{
		System.out.println("\n\t I am in class A");
	}
}

class ClsB extends ClsA
{
	ClsB()
	{
		System.out.println("\n\t I am in class B");
	}
}

class ClsC extends ClsB
{
	ClsC()
	{
		System.out.println("\n\t I am in class C");
	}
}


class inh_con2
{
	public static void main(String args[])
	{
		new ClsC();
	}
}