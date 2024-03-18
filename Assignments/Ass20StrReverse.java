import java.io.*;

class Ass20StrReverse
  {
    public static void main(String arg[]) throws Exception
       {
        int l;
        String s;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the string = ");
        s=br.readLine();
		 		
        l=s.length();
		System.out.print("Reverse string is: ");
        for(int i=l-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	   }
  }
