package FundamentalJava.ConsoleApplication;

public interface BillProjectActions
{
    public String addnewcustomers(ElectricityBillProject customer);

    public void listallcustomerdetails();

    public void updatingcustomervalues(String username);

    public void updatingcustomervalues(long Billno);

    public void deletingcustomervalue(String username);

    public void searchingancustomervalues(int userid);

    public void Sortingancustomervalues();
}
