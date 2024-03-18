import java.io.*;

class s3_strToChar
  {
    public static void main(String arg[]) throws Exception
       {
        int l;
        String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the string = ");
        s=br.readLine();

        l=s.length();

        for(int i=0;i<l;i++)
         System.out.println(s.charAt(i));
       }
  }
