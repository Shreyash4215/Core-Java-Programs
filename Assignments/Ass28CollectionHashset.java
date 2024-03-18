
import java.util.*;

class Ass28CollectionHashset
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,s,d;
		
		HashSet hs = new HashSet(); 
		
		System.out.print("\n\t How many elements do you want?: ");
		n=sc.nextInt();
		
		System.out.print("\n\t Enter "+n+" elements : ");		
		for(i=0;i<n;i++)
		{
			s=sc.nextInt();
			hs.add(s);
		}		
		System.out.println("\n\t"+hs);

		
		System.out.print("\n\t Enter Element to search: ");
		d=sc.nextInt();

		if(hs.contains(d))
			System.out.println("\n\t Hashset contains value: "+d);
		else
			System.out.println("\n\t Hashset does not contains value: "+d);		
	}
}