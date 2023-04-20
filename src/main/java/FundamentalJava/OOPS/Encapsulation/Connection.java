package FundamentalJava.OOPS.Encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Connection implements BillProjectActions
{
    ElectricityBillProject [] management=new ElectricityBillProject[5];//Array Declaration
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
        Scanner scan=new Scanner(System.in);
        for(int pos=0;pos< management.length;pos++)
        {
            if(management[pos].getUsername().equalsIgnoreCase(username))
            {
                System.out.println(username+" in the user details which field you want edit");
                String fieldname=scan.next();
                switch (fieldname)
                {
                    case "Username":
                        System.out.println("please enter your new customer name:");
                        String newcustomername= scan.next();
                        management[pos].setUsername(newcustomername);
                        listallcustomerdetails();
                        break;
                }
                System.out.println(fieldname+" in this field  is updated");
            }
        }

    }

    @Override
    public void updatingcustomervalues(long Billno) {

    }

    @Override
    public void deletingcustomervalue(int userid)
    {
        for(int index=0;index< management.length;index++)
        {
            if(management[index].getUserid()==userid)
            {
                management[index]=null;
                System.out.println(userid+" has been deleted successfully");
                return;
            }
        }
        System.out.println("your value is not deleted");
    }

    @Override
    public void searchingancustomervalues(int userid)
    {
        for(int index=0;index< management.length;index++)
        {
            if(management[index].getUserid()==userid)
            {
                System.out.println(management[index]);
            }
        }
        return;
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
            System.out.println("which process perforamnce you want\n 1.Addnew customers\n2.listallcustomerdetails\n3.update\n4.search\n5.delete\n6.sort");
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
                case 3:
                    System.out.println("which customer detail you are edit ");
                    String customername= scan.next();
                    connect.updatingcustomervalues(customername);
                    break;
                case 4:
                    System.out.println("search based on user id");
                    System.out.println("which user id you want search");
                    int userid= scan.nextInt();
                    connect.searchingancustomervalues(userid);
                case 5:
                    System.out.println("which user id you want delete in electricitybillmanagement");
                    int id=scan.nextInt();
                    connect.deletingcustomervalue(id);
                    break;


            }

        }
        while (
                true
        );


    }


}
