import java.io.*;

class Ass18ChrReplace
  {
    public static void main(String arg[]) throws Exception
       {
        int l;
        String s,r,sr;
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the string = ");
        s=br.readLine();
		
		System.out.print("Enter Char to search = ");
        sr=br.readLine();		
		
		System.out.print("Enter Char to Replace = ");
        r=br.readLine();
	
        l=s.length();

        for(int i=0;i<l;i++)
		{
			c=s.charAt(i);			
			String v = Character.toString(c);
			
			if(v.equals(sr))			
				v=r;
			
				System.out.print(""+v);		
		}
	   }
  }
