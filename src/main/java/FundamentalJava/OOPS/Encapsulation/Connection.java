package FundamentalJava.OOPS.Encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Connection implements BillProjectActions
{
    ElectricityBillProject [] management=new ElectricityBillProject[5];
    @Override
    public String addnewcustomers(ElectricityBillProject customer)
    {
        for(int index=0;index<management.length;index++)
        {
            if (management[index]==null)
            {
                management[index]=customer;
                return customer.getUsername()+"has been added in electricity management";
            }
        }
        return customer.getUsername()+" has not been added";
    }

    @Override
    public void listallcustomerdetails()
    {
        for(ElectricityBillProject bill:management)
        {
            System.out.println(bill);
        }

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

        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("which process perforamnce you want\n 1.Addnew customers\n2.listallcustomerdetails\n3.update\n4.delete\n5.serach\n6.sort");
            int menu=scan.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.println("new customer details-userid,username,billno,address,currentmonthcharge");
                    ElectricityBillProject customer2=new ElectricityBillProject(scan.nextInt(),scan.next(), scan.nextLong(),scan.next(),scan.nextDouble() );
                    System.out.println(connect.addnewcustomers(customer2));
                    break;
                case 2:
                    System.out.println("electricity management customer detailsb are");
                    connect.listallcustomerdetails();
                    break;

            }

        }
        while (
                true
        );


    }


}
