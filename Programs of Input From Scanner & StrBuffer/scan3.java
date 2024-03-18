
import java.io.*;

class scan3
{
	public static void main(String args[]) throws Exception
	{		
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\n\t Enter the Number = ");
		n = Integer.parseInt(br.readLine());
		
		System.out.println("\n\t Your Number = "+n);		
	}
}
