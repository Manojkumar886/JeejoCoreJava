package FundamentalJava.ThreadExecution;


public class priorityCheck
{

    public static void main(String[] args)
    {
        Note nt1=new Note();

        Thread th1=new Thread(nt1,"Razak");

        Thread th2=new Thread(nt1,"Manojkumar");

        Thread th3=new Thread(nt1,"Raseedha");
        Thread th4=new Thread(nt1,"Madheswaran");

        th2.setPriority(10);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }

}


class Note implements  Runnable
{
   synchronized public void run() {
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getId());
       System.out.println(Thread.currentThread().getPriority());
       for (int i = 0; i <= 5; i++) {
           System.out.println("this class is note - method name is execute" + i);
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
   }
}