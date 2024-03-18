//array in java

class array1
{	
	public static void main(String args[])
	{
		
     int sum=0,a[];              //declaration
	 a= new int[5];         //memory allocation  //dont use [] at  (a)memory allocation array
	
	
	for(int i=0;i<5;i++)
	{
		a[i] = Integer.parseInt(args[i]);
	    sum=sum+a[i];
	}
	
	System.out.println("\n\t sum = "+sum);
 
	}
}