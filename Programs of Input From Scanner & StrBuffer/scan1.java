
import java.io.*;

class scan1
{
	public static void main(String args[]) throws Exception
	{		
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\n\t Enter Your Name = ");
		name = br.readLine();
		
		System.out.println("\n\t Welcome "+name);		
	}
}
