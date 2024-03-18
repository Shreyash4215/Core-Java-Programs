/*
Create two singly linked lists for string data (Do not allow duplicate elements in one
list). Perform
a. Union
b. Intersection
c. Combining corresponding elements of the lists into a new list (only if they
are of the same size)
*/

import java.io.*;
import java.util.*;

class LL_Operations6
{
	public static void main(String arg[])throws IOException
	{
		LinkedList L1=new LinkedList();
		LinkedList L2=new LinkedList();
		LinkedList L3=new LinkedList();
		LinkedList L4=new LinkedList();
		LinkedList L5=new LinkedList();
		
		String data;
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Total number of items in 1st list :");
		n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter item : ");
			data=br.readLine();
			if(L1.contains(data))
			{
				System.out.println("Duplicate item is not allowed .......");
				i=--;
			}
			else
				L1.add(data);
		}

		System.out.println("Enter Total number of items in 2nd list :");
		n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter item : ");
			data=br.readLine();
			if(L2.contains(data))
			{
				System.out.println("Duplicate item is not allowed ......");
				i--;
			}
			else
				L2.add(data);
		}
		System.out.println("First List is : "+L1);
		System.out.println("Second List is : "+L2);
		
		// Union 
		for(int i=0;i<L1.size();i++)
			L3.add(L1.get(i));
		for(int i=0;i<L2.size();i++)
		{
			if(!L1.contains(L2.get(i)))
				L3.add(L2.get(i));
		}
		System.out.println("Union of two lists is : "+L3);
		// Intersection
		for(int i=0;i<L2.size();i++)
		{
			if(L1.contains(L2.get(i)))
				L4.add(L2.get(i));
		}

		System.out.println("Intersection of Two lists is : "+L4);
		// Combined List
		if(L1.size()==L2.size())	
		{
			for(int i=0;i<L1.size();i++)
			{
				L5.add(L1.get(i)+""+L2.get(i));
			}
			System.out.println("Combined List of Two lists is : "+L5);
		}
		else
			System.out.println("Size of the lists is not same.....");
	}
}
