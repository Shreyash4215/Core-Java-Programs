import java.util.Arrays;

class arraycls1
{	
	public static void main(String args[])
	{
		
     int i;   
	 int a[]={10,20,30,40,50,60,70,80,90,100};
	
	System.out.println("\n 1) toString()");
	System.out.println( Arrays.toString(a));
 
	System.out.println("\n 2) copyOf()");
	int b[] = Arrays.copyOf(a,a.length);
	System.out.println( Arrays.toString(b));
	
	System.out.println("\n 3) copyOfRange()");
	int c[] = Arrays.copyOfRange(a,2,9);
	System.out.println( Arrays.toString(c));
	
	System.out.println("\n 4) sort()");
	int d[] = {45,23,50,80,10,1};
	System.out.println( "\n before sort()");
	System.out.println( Arrays.toString(d));
	Arrays.sort(d);
	System.out.println( "\n after sort()");
	System.out.println( Arrays.toString(d));

	System.out.println("\n 5) sort()");
	int e[] = {45,23,50,80,10,1,999,888,777,118};
	System.out.println( "\n before sort()");
	System.out.println( Arrays.toString(e));

	//Arrays.sort(e,0,e.length);              //direct give length using array function
	Arrays.sort(e,0,5);
	System.out.println( "\n after sort()");
	System.out.println( Arrays.toString(e));

	System.out.println("\n 6) fill()");
	int f[] = new int[5];
	Arrays.fill(f,100);
	System.out.println( Arrays.toString(f));

	System.out.println("\n 7) equal()");
	Object arr1[]= new Object[] { 1,123};         //if elements in array are int type we can use int instead of object
	Object arr2[]= new Object[] { 11,22,33};
	Object arr3[]= new Object[] { 1,123};
	
	if(Arrays.equals(arr1,arr2))
		System.out.println( "\n Array1 & Array2 = EQUAL ");
	if(Arrays.equals(arr1,arr3))
		System.out.println( "\n Array1 & Array3 = EQUAL ");	


	System.out.println("\n 8) BinarySearch()");
	int g[] ={45,23,67,22,77};
	System.out.println( "Index = "+Arrays.binarySearch(g,67));

	System.out.println("\n 9) for-each Loop()");
	for(int ele : g)
	System.out.println( ele);

	System.out.println("\n 10) arraycopy() ");
	int aa[] ={10,20,30,40,50,60,70};
	int bb[] = new int[5];
	System.arraycopy(aa,3,bb,2,2);
	System.out.println( Arrays.toString(bb));


	}
}

