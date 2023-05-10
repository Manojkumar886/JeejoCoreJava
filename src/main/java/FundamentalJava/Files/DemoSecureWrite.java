package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class DemoSecureWrite
{
    public static void main(String[] args) throws IOException {
        File obj=new File("D:\\CollectionofBilDetails.doc");
//        obj.createNewFile();

        FileOutputStream fos=new FileOutputStream(obj);

        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        System.out.println("please type the content to store inside the file");

        Scanner scan=new Scanner(System.in);
        String mycontent="",answer="";
        while(true)
        {
            mycontent=scan.nextLine();
            System.out.println("do you complete the code");
            answer=scan.next();
            if(answer.equalsIgnoreCase("yes"))
                break;
        }

        dos.write(mycontent.getBytes());

        dos.close();
        fos.close();
        scan.close();


    }
}
