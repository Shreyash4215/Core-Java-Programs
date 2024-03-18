// One interface extends to other interface

interface demo
{
	void disp1();
}

class clsA		// normal class OR abstract class
{
		void disp2()
		{
			System.out.println("\n\t I am in clsA");
		}
}

class clsB extends clsA implements demo
{
		public void disp1()
		{
			System.out.println("\n\t I am in Interface");
		}
		void disp3()
		{
			System.out.println("\n\t I am in ClsB");
		}
}

class int4
{
	public static void main(String args[])
	{
		clsB obj = new clsB();
		obj.disp1();
		obj.disp2();
		obj.disp3();
	}
}
