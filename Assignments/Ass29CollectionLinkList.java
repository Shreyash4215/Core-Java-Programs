import java.util.*;

class Ass29CollectionLinkList
{
	public static void main(String args[])
	{		
		LinkedList ll = new LinkedList();

		ll.add("red"); 
		ll.add("blue"); 
		ll.add("yellow"); 
		ll.add("orange");	
	
		Iterator Ir = ll.iterator();

		while(Ir.hasNext())
		{
			String s = (String)Ir.next();
			System.out.println("Element = " +s);
		}	
		
		System.out.println("\n\n Reverse content of list ");
		
		ListIterator listitr = ll.listIterator();	
		
		while(listitr.hasNext())
		{
			String r = (String)listitr.next();
			
		}		
		while(listitr.hasPrevious())
			System.out.println(listitr.previous());
		
		LinkedList l2 = new LinkedList();

		l2.add("pink"); 
		l2.add("green");
		ll.addAll(2,l2); 
		
		System.out.println("\n\n Updated content of list ");
		
		Iterator cr = ll.iterator();
		
		while(cr.hasNext())
		{
			String s = (String)cr.next();
			System.out.println("Element = " +s);
		}
	}
}