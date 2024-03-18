import java.io.*;

class Ass19StrCaseChange
  {
    public static void main(String arg[]) throws Exception
       {
        int l;
        String s;
		char c,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the string = ");
        s=br.readLine();
		 		
        l=s.length();

        for(int i=0;i<l;i++)
		{
			c=s.charAt(i);

			if(Character.isLowerCase(c))							
					n=Character.toUpperCase(c);			
			else
					n=Character.toLowerCase(c);
				
					System.out.print(""+n);		
		}
     }
  }