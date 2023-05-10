package FundamentalJava.Exception;

public class ThrowKeyword
{
//    throw keyword is used to customized or user defined exception has throw to use the catch block
    public static void main(String[] args)
    {
        ThrowKeyword throw1=new ThrowKeyword();
        try
        {
            throw1.processofthrow();
        }
        catch(NullPointerException npe)
        {
            System.out.println("Again working null pointerexception");
        }

    }

    public void processofthrow()
    {
        try
        {
            throw new NullPointerException();
        }
        catch(NullPointerException npe)
        {
            System.out.println("i have got a work in nullpointerexception");
            throw npe;
        }
    }
}
