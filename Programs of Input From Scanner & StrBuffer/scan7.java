import java.util.*;

class scan7
{
	public static void main(String args[])
	{		
		int a;
		double b;
		String c;
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\n\t Enter any input = ");
		if(sc.hasNextInt())
		{
			a = sc.nextInt();
			System.out.println("\n\t Int = "+a);		
		}
		else if(sc.hasNextDouble())
		{
			b = sc.nextDouble();
			System.out.println("\n\t Double = "+b);		
		}
		else if(sc.hasNextLine())
		{
			c = sc.nextLine();
			System.out.println("\n\t String = "+c);		
		}
	}
}
