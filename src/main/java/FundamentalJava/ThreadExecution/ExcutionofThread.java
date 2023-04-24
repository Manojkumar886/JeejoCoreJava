package FundamentalJava.ThreadExecution;

public class ExcutionofThread
{
    public static void main(String[] args) throws InterruptedException
    {
        note nt1=new note();
        book bk1=new book();

        Thread th=new Thread(bk1);

        nt1.start();
        nt1.join();
        th.start();
        th.join();
        System.out.println("Thank you for coming");
    }
}

class note extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("this class is note - method name is execute");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class book implements  Runnable
{
    public void run()
    {
        for(int i=5;i>=0;i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}