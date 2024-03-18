import java.io.*;

class Ass21Strpolidrom
  {
    public static void main(String arg[]) throws Exception
       {
		String s1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\n\t Enter the string = ");
        s1=br.readLine();
		 		
        StringBuffer s2 = new StringBuffer(s1);
		
		s2.reverse();
		
		String s3 = new String(s2);
       
		if(s3.equals(s1))		
			System.out.print("\n\t String is polidrom ");
		else
			System.out.print("\n\t String is Not polidrom ");		       
	   }
  }