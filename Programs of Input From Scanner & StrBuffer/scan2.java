
import java.io.*;

class scan2
{
	public static void main(String args[]) throws Exception
	{		
		String name;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("\n\t Enter Your Name = ");
		name = br.readLine();
		
		System.out.println("\n\t Welcome "+name);		
	}
}
