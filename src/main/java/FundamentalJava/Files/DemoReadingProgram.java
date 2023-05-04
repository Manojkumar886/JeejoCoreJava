package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoReadingProgram
{
    public static void main(String[] args) throws IOException
    {
        File obj=new File("D:\\WritingusingFile.txt");

        FileInputStream fis=new FileInputStream(obj);

        int size=fis.available();

        byte[] temp=new byte[size];
//        read and copy to byte of array

        fis.read(temp);

        String mydate=new String(temp);

        System.out.println(mydate+" in this content available in the file"+obj.getName());




    }

}
