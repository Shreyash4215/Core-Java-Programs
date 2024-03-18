/* The HashSet Class 
	
	The following constructors are defined:     
	
	HashSet( ) 
	HashSet(Collection c) 
	HashSet(int capacity) 
	HashSet(int capacity, float fillRatio) 
	
	The advantage of hashing is 
	that it allows the execution time of basic operations, such as 
	add( ), remove( ), and size( ), to remain constant even for large sets. 
*/

import java.util.*; 

class HashSetDemo3 
{ 
	public static void main(String args[]) 
	{ 
		// create a hash set 
		HashSet hs = new HashSet(); 
		
		// add elements to the hash set 
		hs.add("D"); 
		hs.add("E"); 
		hs.add("B"); 
		hs.add("C"); 
		hs.add("F"); 
		hs.add("A"); 
		hs.add("A"); 
		hs.add("A"); 
		
		System.out.println(hs); 
	} 
}