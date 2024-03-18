// One interface extends to other interface

interface demo1
{
	void disp1();
}

interface demo2 extends demo1
{
	void disp2();
}

class clsA implements demo2
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

class int3
{
	public static void main(String args[])
	{
		clsA obj = new clsA();
		obj.disp1();
		obj.disp2();
		obj.disp3();
	}
}
