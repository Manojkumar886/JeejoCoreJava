package FundamentalJava.Files;

import java.io.*;

public class DemoSerialization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File obj=new File("D:\\ObjectExecution.txt");
//        obj.createNewFile();

        FileInputStream fis=new FileInputStream(obj);

        ObjectInputStream ois=new ObjectInputStream(fis);
        Mymobiles temp=(Mymobiles) ois.readObject();

        System.out.println(temp.Brand+"\n"+temp.Model+"\n"+temp.prize+"\n"+temp.ram+"\n");



//        FileOutputStream fos=new FileOutputStream(obj);
//
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//
//        Mymobiles m1=new Mymobiles();
//        m1.Brand="IQ07";
//        m1.Model="Zpad903";
//        m1.prize=39000;
//        m1.ram=6;
//
//        oos.writeObject(m1);
//        oos.close();
//        fos.close();


    }
}

class Mymobiles implements Serializable
{
    String Brand;
    String Model;
    int prize;
    int ram;

}