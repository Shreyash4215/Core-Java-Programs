// Copy the File
import java.io.*;
class File3
{
 public static void main(String args[]) throws IOException
 {
  int i;
  FileInputStream fin = new FileInputStream(args[0]);
  FileOutputStream fout= new FileOutputStream(args[1]);

   while(true)
   {
    i = fin.read();

    if(i == -1)
		break;
	else
        fout.write(i);
   } 
  System.out.println("\n\t File Copied Successfully ...");
  fin.close();
  fout.close();
 }
}
