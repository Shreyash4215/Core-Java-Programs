
// Stack Operation
import java.util.*;
class S_Oprations8
{
	public static void main(String args[])
	{
		int i,n;
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t Enter three Numbers = ");
		for(i=0;i<3;i++)
		{	n = sc.nextInt();
			s.push(new Integer(n));
		}
		System.out.println("\n\t Stack Elements = "+s);
		
		System.out.println("\n\t Poping Elements in LIFO manner : ");
		for(i=0;i<3;i++)
	 	System.out.print("\t"+s.pop());
	}
}