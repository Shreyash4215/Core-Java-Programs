import java.io.*;
class Ass25FileOperation
{
 public static void main(String args[]) throws IOException
 {
  int i,n;
  FileInputStream fin = new FileInputStream(args[0]);
  FileOutputStream fout= new FileOutputStream(args[1]);

   while(true)
   {
    i = fin.read();

    if(i == -1)
		break;
	else
	{
		if(Character.isLowerCase(i))							
			n=Character.toUpperCase(i);			
		else
			n=Character.toLowerCase(i);
        
		fout.write(n);
	}
   } 
  System.out.println("\n\t File Copied Successfully ...");
  fin.close();
  fout.close();
 }
}