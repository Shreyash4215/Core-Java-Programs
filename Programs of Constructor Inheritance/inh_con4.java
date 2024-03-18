// this keyword

class ClsA
{
	int a;
	
		ClsA(int a)
		{
			this.a = a;
		}	
		void disp()
		{
			System.out.println("\n\t A = "+a);
		}
}

class inh_con4
{
	public static void main(String args[])
	{
		int a=30;
		ClsA obj=new ClsA(a);
		obj.disp();
	}
}