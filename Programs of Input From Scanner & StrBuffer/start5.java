// Data Types 
import java.text.*;

class start5
{
	public static void main(String args[])
	{
		int a=10;
		double b=45.6784576;
		char c = 'R';
		String d = "India";
		
		System.out.printf("\n\t Integer = %d", a);
		System.out.printf("\n\t Double = %f" , b);
		System.out.printf("\n\t Char = %c" , c);
		System.out.printf("\n\t String = %s" , d);
		
		System.out.printf("\n\n\t Double = %.2f", b);
		
		// Total length = 10; left side number 7 digit, one decimal and after decimal 2 digits
		System.out.printf("\n\t Double = %10.2f", b);
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println("\n\t Double = "+df.format(b));
	}
}