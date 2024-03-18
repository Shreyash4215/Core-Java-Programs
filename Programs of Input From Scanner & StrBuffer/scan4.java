import java.io.*;

class scan4
{
	public static void main(String args[]) throws Exception
	{		
		int a,b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n\t Enter two Numbers = ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		System.out.println("\n\t Addition of " +a+ " and "+b +" is = "+(a+b));		
	}
}
