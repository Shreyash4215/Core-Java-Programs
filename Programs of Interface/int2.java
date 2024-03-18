// Multiple Inheritance using Interface

interface demo1
{
	void disp1();
}

interface demo2
{
	void disp2();
}

class clsA implements demo1,demo2		// multiple inheritance
{
		public void disp1()
		{
			System.out.println("\n\t I am in Interface1");
		}
		public void disp2()
		{
			System.out.println("\n\t I am in Interface2");
		}
		void disp3()
		{
			System.out.println("\n\t I am in Class");
		}
}

class int2
{
	public static void main(String args[])
	{
		clsA obj = new clsA();
		obj.disp1();
		obj.disp2();
		obj.disp3();
	}
}
