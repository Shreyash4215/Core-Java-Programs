
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

class inh_con1
{
	public static void main(String args[])
	{
		new ClsB();
	}
}