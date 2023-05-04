package FundamentalJava.ConsoleApplication;

import java.util.*;

public class Connection implements BillProjectActions,Runnable
{
//    ElectricityBillProject[] management = new ElectricityBillProject[5];//Array Declaration

    TreeSet<ElectricityBillProject> Goverment1=new TreeSet<ElectricityBillProject>();

    @Override
    public String addnewcustomers(ElectricityBillProject customer) {
        Goverment1.add(customer);
        return  customer.getUsername()+"has been added successfully";
//        Scanner scan = new Scanner(System.in);
//        try {
//            for (int index = 0; index < management.length; index++) {
//                if (management[index] == null) {
//                    management[index] = customer;
//                    return customer.getUsername() + "has been added in electricity management";
//                }
//            }
//            throw new ElectricityBillException();
//        } catch (ElectricityBillException EBE) {
//            System.out.println(EBE + "memory is full,so you delete one customer detail");
//            for (ElectricityBillProject EBP : management) {
//                System.out.println(EBP.getUserid());
//            }
//            System.out.println("which user id  you delete in customer detail");
//            deletingcustomervalue(scan.nextInt());
//            addnewcustomers(customer);
//        }
//        return customer.getUsername() + " has been added successfully";
    }

    @Override
    public void listallcustomerdetails() {
//        for (ElectricityBillProject bill : management) {
//            System.out.println(bill);
//        }
        Iterator<ElectricityBillProject> it=Goverment1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    @Override
    public void updatingcustomervalues(String username) {
//        Scanner scan = new Scanner(System.in);
//        for (int pos = 0; pos < management.length; pos++) {
//            if (management[pos].getUsername().equalsIgnoreCase(username)) {
//                System.out.println(username + " in the user details which field you want edit");
//                String fieldname = scan.next();
//                switch (fieldname) {
//                    case "Username":
//                        System.out.println("please enter your new customer name:");
//                        String newcustomername = scan.next();
//                        management[pos].setUsername(newcustomername);
//                        listallcustomerdetails();
//                        break;
//                }
//                System.out.println(fieldname + " in this field  is updated");
//            }
//        }

    }

    @Override
    public void updatingcustomervalues(long Billno) {

    }

    @Override
    public void deletingcustomervalue(String username)
    {
//        try
//        {
//            for(int index=0;index<Goverment1.size();index++)
//            {
////                if(Goverment1.\)
//            }
//        }
//        for (int index = 0; index < management.length; index++) {
//            if (management[index].getUserid() == userid) {
//                management[index] = null;
//                System.out.println(userid + " has been deleted successfully");
//                return;
//            }
//        }
//        System.out.println("your value is not deleted");
    }

    @Override
    public void searchingancustomervalues(int userid)
    {
        Scanner scan=new Scanner(System.in);
        boolean checking=false;
//        try
//        {
//            System.out.println("Search based on user id:"+userid);
//            for(ElectricityBillProject EBE:Goverment)
//            {
//                if(EBE.getUserid()==userid)
//                {
//                    checking=true;
//                    System.out.println(EBE);
//                }
//            }
//            if(checking!=true)
//            {
//                throw new ElectricityBillException();
//            }
//
//        }
//        catch(ElectricityBillException EBE)
//        {
//            System.out.println(EBE+" your user id is wrong,so please enter original user id ");
//            searchingancustomervalues(scan.nextInt());
//        }
//        for (int index = 0; index < management.length; index++) {
//            if (management[index].getUserid() == userid) {
//                System.out.println(management[index]);
//            }
//        }
//        return;
    }

    @Override
    public void Sortingancustomervalues()
    {

//        Collections.sort(Govermen);
//        Scanner scan = new Scanner(System.in);
//        ElectricityBillProject bill = null;
//        System.out.println("field name -sort perforamnce");
//        String field = scan.next();
//        for (int i = 0; i < management.length; i++) {
//            for (int j = i + 1; j < management.length; j++) {
//                if (field.equalsIgnoreCase("username")) {
//                    if (management[i].getUsername().compareTo(management[j].getUsername()) > 0) {
//                        bill = management[i];
//                        management[i] = management[j];
//                        management[j] = bill;
//                    }
//                } else if (field.equalsIgnoreCase("userid")) {
//                    if (management[i].getUserid() <= management[j].getUserid()) {
//                        bill = management[i];
//                        management[i] = management[j];
//                        management[j] = bill;
//                    }
//                }
//            }
//        }

    }

    public Connection()
    {
    //        management[0] = new ElectricityBillProject(4567, "Manojkumar", 8907896565645l, "7/234-1,Agaram,Elachipalayam", 234.76);
    //        management[1] = new ElectricityBillProject(4568, "Annamalai", 9078965656453l, "7/234-1,Agaram,Elachipalayam", 34.76);
    //        management[2] = new ElectricityBillProject(4569, "Pavithra", 1278934565645l, "7/234-1,Agaram,Elachipalayam", 347.76);
    //        management[3] = new ElectricityBillProject(4570, "Geetha", 83907896565645l, "7/234-1,Agaram,Elachipalayam", 9000.76);
    //        management[4] = new ElectricityBillProject(4571, "Haritha", 9907896565645l, "7/234-1,Agaram,Elachipalayam", 245.76);

        Goverment1.add(new ElectricityBillProject(1001,"Manojkumar",112345432516l,"7/234-1,Elaxhipalayam",90.0));
        Goverment1.add(new ElectricityBillProject(1005,"Annamalai",23435432516l,"8/4-4,Trichengode",900.9));
        Goverment1.add(new ElectricityBillProject(1002,"Razak",9087677672516l,"9/23-7,Namakkal",288.2));
        Goverment1.add(new ElectricityBillProject(1004,"Vinoth",9912345432516l,"22/34-7,Salem",345.34));
        Goverment1.add(new ElectricityBillProject(1009,"Rissam",5682345432516l,"7/234-5,Chennai",121.23));
        Goverment1.add(new ElectricityBillProject(1007,"Joshvanth",980845432516l,"7/111-1,Rasipuram",1670.0));

    }

    @Override
     synchronized public void run()
    {
        System.out.println("Welcome to ElectricityBillManagement Project"+Thread.currentThread().getName());
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("which process perforamnce you want\n 1.Addnew customers\n2.listallcustomerdetails\n3.update\n4.search\n5.delete\n6.sort");
            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("new customer details-userid,username,billno,address,currentmonthcharge");
                    ElectricityBillProject customer2 = new ElectricityBillProject(scan.nextInt(), scan.next(), scan.nextLong(), scan.next(), scan.nextDouble());
                    System.out.println(addnewcustomers(customer2));
                    break;
                case 2:
                    System.out.println("electricity management customer detailsb are");
                    listallcustomerdetails();
                    break;
                case 3:
                    System.out.println("which customer detail you are edit ");
                    String customername = scan.next();
                    updatingcustomervalues(customername);
                    break;
                case 4:
                    System.out.println("search based on user id");
                    System.out.println("which user id you want search");
                    int userid = scan.nextInt();
                    searchingancustomervalues(userid);
                    break;
                case 5:
                    System.out.println("which user id you want delete in electricitybillmanagement");
                    String username = scan.next();
                    deletingcustomervalue(username);
                    break;
                case 6:
                    Sortingancustomervalues();
                    break;

                default:
                    return;
            }
        }
        while (
                true
        );

    }
}
