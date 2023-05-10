package FundamentalJava.ConsoleApplication;

import java.io.IOException;

public class MyApplication
{
    public static void main(String[] args) throws IOException {
//        Connection connect_one=new Connection();
//
//        Thread th1=new Thread(connect_one,"Manojkumar");
//
//        Thread th2=new Thread(connect_one,"Jeejo");
//
//        Thread th3=new Thread(connect_one,"Annamalai");
//
//        Thread th4=new Thread(connect_one,"Razak");
//
//        th2.start();
//        th1.start();
//        th4.start();

        FilesExecutions files=new FilesExecutions();

        Thread th1=new Thread(files,"Manojkumar");

        Thread th2=new Thread(files,"Jeejo");

        Thread th3=new Thread(files,"Annamalai");

        Thread th4=new Thread(files,"Razak");

        th2.start();
        th1.start();
        th4.start();



    }
}
