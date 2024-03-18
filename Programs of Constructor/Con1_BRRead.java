// Use a BufferedReader to read characters from the console.
import java.io.*;
class Con1_BRRead
{
 public static void main(String args[]) throws Exception
 {
	  char c;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter characters, 'q' to quit.");

	  do
	  {
	   c = (char) br.read();
	   System.out.println(c);
	  } while(c != 'q');
 }
}
