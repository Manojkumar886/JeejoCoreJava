package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoWritingProgram
{
    public static void main(String[] args) throws IOException
    {
        File obj=new File("D:\\WritingusingFile.txt");

//        obj.createNewFile();
//        System.out.println(obj.getName()+" has been created successfully");


        FileOutputStream fos=new FileOutputStream(obj);
        Scanner scan=new Scanner(System.in);
        System.out.println("please type the content to store insdie the file");
        String content=scan.nextLine();

        fos.write(content.getBytes());

        System.out.println(obj.getName()+" has file successfully written");

        fos.close();








    }
}
