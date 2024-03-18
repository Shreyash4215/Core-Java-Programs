// this and super keyword

class ClsA
{
	int a=10;
}

class ClsB extends ClsA
{
	int a=20;
	ClsB(int a)
	{
		System.out.println("PAra. A = "+a);
		System.out.println("Local A = "+this.a);
		System.out.println("Base A = "+super.a);
	}
}



class inh_con3
{
	public static void main(String args[])
	{
		int a=30;
		new ClsB(a);
	}
}