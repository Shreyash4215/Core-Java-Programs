import java.io.*;
class File6
{    public static void main(String args[])
    {
        int cnt=0;
        File dirs = new File(args[0]);
        String files[] = dirs.list();
        for (int i=0; i<files.length; i++)
        {
			File f = new File(args[0]+"\\"+files[i]);
            if (f.isFile() && files[i].endsWith(args[1])==true)
            {
                f.delete();
                cnt++;
            }
        }
        System.out.println("No. of files Deleted : "+cnt);
    }
}