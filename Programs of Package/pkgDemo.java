// path = E:\Batch\pkgDemo.java

// E:\Batch>javac demo\pkgcls.java
// E:\Batch>javac pkgDemo.java
// E:\Batch>java pkgDemo
	
import demo.*;

class pkgDemo
{
	public static void main(String args[])
	{
		pkgcls obj = new pkgcls();
		obj.disp();
	}
}
