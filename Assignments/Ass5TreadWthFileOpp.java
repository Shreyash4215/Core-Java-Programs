import java.io.*;

class FileWatcher extends Thread
{
    String filename;
    int count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    BufferedReader br;
    String inputSearch;
    String line = "";

    FileWatcher(String filename,String srch)
    {
        this.filename = filename;
        inputSearch = srch;
    }

    public void run()
    {
        try
        {
            br = new BufferedReader(new FileReader("E:\\Batch\\"+filename));
            while ((line = br.readLine()) != null)
            {
                countLine++;
                String words[] = line.split(" ");
				for (String i : words)
                {
                    if (i.equals(inputSearch))
                        {
                            count++;
                            countBuffer++;
                        }
                }

                if (countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine + ",";
                }
            }
            br.close();

            System.out.println("\n Thread Name = "+this+"\n File Name = "+filename+"\n Times found at = "+count+"\n Word found at line no = "+lineNumber);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Ass5TreadWthFileOpp
{
    public static void main(String args[])
    {
        int i;
        File fl;
        File dir = new File("E:\\Batch\\");
        String files[] = dir.list();
        FileWatcher fw[] = new FileWatcher[files.length];
        for (i=0; i<files.length; i++)
        {
            if (files[i].endsWith(".java"))
            {
                fw[i] = new FileWatcher(files[i],args[0]);
                fw[i].start();
            }
        }
    }
}
