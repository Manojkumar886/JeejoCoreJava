package FundamentalJava.ConsoleApplication;

public class MyApplication
{
    public static void main(String[] args)
    {
        Connection connect_one=new Connection();

        Thread th1=new Thread(connect_one,"Manojkumar");

        Thread th2=new Thread(connect_one,"Jeezo");

        Thread th3=new Thread(connect_one,"Annamalai");

        Thread th4=new Thread(connect_one,"Razak");

        th2.start();
        th1.start();
        th4.start();


    }
}
