
class Mynumber
{
	private int n;
	
	Mynumber()
	{
		n=0;
	}
		
	Mynumber(int s)   
	{
		  n=s;
	}
	
    void isneg()
	{
        if(n<0)					
		System.out.println("\n\t  Your Entered number "+n+" is Negative"); 
	}
	void ispos()
	{
        if(n>0)				
		System.out.println("\n\t  Your Entered number "+n+" is Positive"); 
	}
	void iszero()
	{
        if(n==0)				
		System.out.println("\n\t  Your Entered number "+n+" is Zero"); 
	}
	void iseven()
	{
        if(n%2==0)				
		System.out.println("\n\t  Your Entered number "+n+" is Even "); 
	}
	void isodd()
	{
        if(n%2!=0)				
		System.out.println("\n\t  Your Entered number "+n+" is Odd "); 
	}	    	
}	

class ass8PosNegNum
{	
	public static void main(String args[])
	{
			int no= Integer.parseInt(args[0]);
			new Mynumber();
			Mynumber obj = new Mynumber(no);	
			
			obj.isneg();
			obj.ispos();
			obj.iszero();
			obj.iseven();
			obj.isodd();						
	}
}