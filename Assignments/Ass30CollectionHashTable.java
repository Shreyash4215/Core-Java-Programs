import java.util.*;

class Ass30CollectionHashTable
{ 
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
			
		String name;
		
		Hashtable h1 = new Hashtable();
		
		h1.put("Ramesh","80");
		h1.put("Suresh","90");   
		h1.put("Ganesh","99");   
		
		Enumeration en = h1.keys();
		
		while(en.hasMoreElements())
		{
			String s = (String) en.nextElement();
			System.out.println(s + " - " + h1.get(s));
		}
		
		System.out.println("\n\t Enter name of Student To search: ");
		name=sc.next();
		
		en = h1.keys();
		
		while(en.hasMoreElements())
		{			
			String s = (String) en.nextElement();
		
			if(name.equals(s))
			{
				System.out.println(s + " - " + h1.get(s));
		
			}
		}		
	}
}