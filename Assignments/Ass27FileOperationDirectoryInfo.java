import java.io.File;
import java.util.*; 
 
class Ass27FileOperationDirectoryInfo
{ 
  public static void main(String args[]) 
  { 
	Scanner sc = new Scanner(System.in);
    int fc=0,dc=0,del=0;
	String ch;
	
    String dirname=args[0];	
    File f1 = new File(dirname); 
 
    if (f1.isDirectory()) 
    {
		  System.out.println("Directory of " + dirname); 
		  String s[] = f1.list(); 		// IMP
	 
		  for (int i=0; i < s.length; i++) 
		  { 
			File f = new File(dirname + "/" + s[i]); 
			if (f.isDirectory()) 
			 {
			  System.out.println(s[i] + " is a directory"); 
			  dc++;
			 } 
			else 
			 {
			  System.out.println(s[i] + " is a file"); 
			  fc++;
			 }
			}
			System.out.println("\n\t Total Number of Directories = "+dc); 	 
			System.out.println("\n\t Total Number of Files = "+fc); 	 
		
			System.out.println("\nDo you want to delete the file with extension .txt ?\n1:YES 2:NO");
			ch=sc.next();
		
			if(ch.equals("yes"))
			{
				for(int i=0; i<s.length; i++)
				{
					File f = new File(f1+"\\"+s[i]);
					if (s[i].endsWith(".txt")==true)
					{
						f.delete();
						del++;
					}
				}
				System.out.println("\nNumber of files deleted are: "+del);
			}		
	} 
    else 
	{	
		System.out.println("\n This is file \n");
		System.out.println("File Name: " + f1.getName()); 
		System.out.println("Path: " + f1.getPath()); 
		System.out.println("Abs Path: " + f1.getAbsolutePath()); 
		System.out.println("Parent: " + f1.getParent()); 
		System.out.println(f1.exists() ? "It is exists" : "It is does not exist"); 
		System.out.println(f1.canWrite() ? "It is writeable" : "It is not writeable"); 
		System.out.println(f1.canRead() ? "It is readable" : "It is not readable"); 
		System.out.println("It is " + (f1.isDirectory() ? "a directory" : "not a directory"));  
		System.out.println(f1.isFile() ? "It is normal file" : "It might be a named pipe"); 
		System.out.println("File last modified: " + f1.lastModified()); 
		System.out.println("File size: " + f1.length() + " Bytes"); 
	}      
  } 
}