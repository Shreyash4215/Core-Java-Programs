
import java.io.*;

class Ass26FileOperationWthStrBuffer
{
 public static void main(String args[]) throws IOException
 {
  int i; 
  char ch;
  
  StringBuffer s = new StringBuffer() ;
  
  PrintStream p;

  FileInputStream fin = new FileInputStream(args[0]);
  FileOutputStream fout= new FileOutputStream(args[1]);
  
   p = new PrintStream(fout);

   while(true)
   {
    i = fin.read();

    if(i == -1)
		break;
	else
	{	
		ch=(char)i;		
		s.append(ch);
			
		if(i==32)
		{
			s.reverse();			
			p.print(s);			
			s=new StringBuffer();
		}	
	}
   } 
  System.out.println("\n\t File Copied Successfully ...");
  fin.close();
  fout.close();
 }
}