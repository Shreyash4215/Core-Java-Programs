import java.util.*;

class scan6
{
	public static void main(String args[])
	{		
		int a;
		double b;
		String c,d;
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\n\t Enter int, double, word and string = ");
		a = sc.nextInt();
		b = sc.nextDouble();
		c = sc.next();
		d = sc.nextLine();
		
		System.out.println("\n\t Int = "+a);		
		System.out.println("\n\t Double = "+b);		
		System.out.println("\n\t String = "+c);		
		System.out.println("\n\t Line = "+d);		
	}
}
