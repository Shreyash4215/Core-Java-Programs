
class student
{
	int roll;
	String name;
	double per;
	static int Count;
	
	student()
	{
		Count++;
	}
	
	student(int roll,String name,double per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
		
		System.out.println("\n\t roll= "+roll+"\t\tname= "+name+"\tper= "+per );
		Count++;
	}
	
	static void Countdisp()
	{
		System.out.println("\n\t Count= "+Count);
	}
}

class Ass10ClsObj
{
	public static void main(String args[])
	{
		new student();
		student.Countdisp();
	
	
		new student(1,"ABC",90);
		student.Countdisp();
		
		new student();
		student.Countdisp();
		
		new student(2,"PQR",80);
		student.Countdisp();
		
	}
}