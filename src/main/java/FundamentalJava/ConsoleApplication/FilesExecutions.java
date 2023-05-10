package FundamentalJava.ConsoleApplication;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import  java.util.Scanner;

public class FilesExecutions implements  Runnable ,BillProjectActions
{
    File myfile=new File("D:\\Files\\ElectricityBilldetails.doc");
    FileOutputStream fos=null;
    FileInputStream fis=null;
    ObjectOutputStream oos=null;
    ObjectInputStream  ois=null;

    public void affect() throws IOException
    {
        fos=new FileOutputStream(myfile);
        oos=new ObjectOutputStream(fos);
        oos.writeObject(goverment);
        oos.close();
        fos.close();
        System.out.println("the object was successfully written to a your file....");
    }

    public void fetch() throws IOException, ClassNotFoundException
    {
        fis=new FileInputStream(myfile);
        ois=new ObjectInputStream(fis);
        goverment=(ArrayList<ElectricityBillProject>) ois.readObject();

        ois.close();
        fis.close();
    }

    public FilesExecutions()
    {
//        myfile.createNewFile();
        goverment=new ArrayList<>();
    }
//    ArrayList<ElectricityBillProject> goverment=new ArrayList<>();
    ArrayList<ElectricityBillProject> goverment=null;
    @Override
    public String addnewcustomers(ElectricityBillProject customer)
    {
        try {
            fetch();
            goverment.add(customer);
            affect();
        }
        catch (EOFException eofException)
        {
         goverment.add(customer);
            try {
                affect();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return customer.getUsername()+"has been added successfully";
    }

    @Override
    public void listallcustomerdetails()
    {
        try {
            fetch();
            Iterator<ElectricityBillProject> it=goverment.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatingcustomervalues(String username)
    {

    }

    @Override
    public void updatingcustomervalues(long Billno) {

    }

    @Override
    public void deletingcustomervalue(String username) {

    }

    @Override
    public void searchingancustomervalues(int userid) {

    }

    @Override
    public void Sortingancustomervalues()
    {


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
