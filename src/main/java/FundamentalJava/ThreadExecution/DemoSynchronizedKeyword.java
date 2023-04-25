package FundamentalJava.ThreadExecution;

public class DemoSynchronizedKeyword
{
    public static void main(String[] args)
    {
        connect_one one=new connect_one();

        Thread th1=new Thread()
        {
            public void run()
            {
                try {
                    one.tables(3);
                } catch (InterruptedException e) {

                }
            }
        };

        Thread th2=new Thread()
        {
            public  void run()
            {
                try {
                    one.tables(5);
                } catch (InterruptedException e)
                {
                    ;
                }
            }

        };

        th1.start();
        th2.start();
    }
}

class connect_one
{
  synchronized public void tables(int add) throws InterruptedException
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(add+"*"+i+"="+add*i);
            Thread.sleep(3000);
        }
    }
}