import java.util.*;

abstract class shape
{	 
	 abstract void cal_area();
	 abstract void cal_volume();
}
class sphere extends shape 	
{	
	double r,a,v;
	
	sphere(double r)
	{
		this.r=r;
	}
	void cal_area()
	{
		a=4*3.14*(r*r);
		System.out.println("\n\t Area of sphere = "+a);
	}	
	void cal_volume()
	{
		v=(4/3)*3.14*(r*r*r);
		System.out.println("\n\t Volume of sphere = "+v);
	} 
}
class cone extends shape	
{	
	double r,h,a,v;
	
	cone(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	void cal_area()
	{
		a=(3.14*r)*(r+(((h*h)+(r*r))/(h*h)+(r*r)));
		System.out.println("\n\t Area of cone = "+a);
	}	
	void cal_volume()
	{
		v=3.14*(r*r)*(h/3);
		System.out.println("\n\t Volume of cone = "+v);
	} 
}
class cylinder extends shape	
{	
	double r,h,a,v;
	
	cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	void cal_area()
	{
		a=(2*3.14*r*h)+(2*3.14*r*r);
		System.out.println("\n\t Area of cylinder = "+a);
	}
	
	void cal_volume()
	{
		v=3.14*(r*r)*h;
		System.out.println("\n\t Volume of cylinder = "+v);
	} 
} 

class box extends shape	
{	
	double l,b,h,a,v;
	
	box(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	void cal_area()
	{
		a=2*l*b;
		System.out.println("\n\t Area of box = "+a);
	}
	
	void cal_volume()
	{
		v=l*b*h;
		System.out.println("\n\t Volume of box = "+v);
	} 
}

class Ass12MathOperations
{
	public static void main(String args[])
	{
		double r,h,l,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\t Enter Radius,Height,Length,Breadth ");
		r=sc.nextDouble();
		h=sc.nextDouble();
		l=sc.nextDouble();
		b=sc.nextDouble();
		
		shape s;
		
		s = new sphere(r);
			s.cal_area();
			s.cal_volume();
			
		s = new cone(r,h);
			s.cal_area();
			s.cal_volume();
				
		s = new cylinder(r,h);
			s.cal_area();
			s.cal_volume();
		
		s = new box(l,b,h);
			s.cal_area();
			s.cal_volume();
   	}
}