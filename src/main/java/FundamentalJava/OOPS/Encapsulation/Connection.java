package FundamentalJava.OOPS.Encapsulation;

import java.util.Arrays;

public class Connection implements BillProjectActions
{
    ElectricityBillProject [] management=new ElectricityBillProject[5];
    @Override
    public String addnewcustomers()
    {
        return null;
    }

    @Override
    public void listallcustomerdetails()
    {

    }

    @Override
    public void updatingcustomervalues(String username)
    {

    }

    @Override
    public void deletingcustomervalue(int userid)
    {


    }
    public Connection()
    {
        management[0]=new ElectricityBillProject(4567,"Manojkumar",8907896565645l,"7/234-1,Agaram,Elachipalayam",234.76);
        System.out.println(Arrays.toString(management));
    }


    public static void main(String[] args)
    {
        Connection connect=new Connection();


    }


}
