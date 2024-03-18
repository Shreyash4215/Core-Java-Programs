
class GarbageCollectionDemo
{
	public static void main( String[] args)
	{
		long a,b;
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total JVM memory = "+rt.totalMemory());

		a=rt.freeMemory();
		System.out.println("Free memory before GC = " + a);

		rt.gc();   
		
		b=rt.freeMemory();
		System.out.println("Free memory after GC  = " + b);
		
		System.out.println("Total Free memory = " + (b-a));
	}
}