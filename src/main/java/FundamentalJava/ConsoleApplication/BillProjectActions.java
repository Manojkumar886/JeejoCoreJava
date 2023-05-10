package FundamentalJava.ConsoleApplication;

import java.io.IOException;

public interface BillProjectActions
{
    public String addnewcustomers(ElectricityBillProject customer) throws IOException, ClassNotFoundException;

    public void listallcustomerdetails() throws IOException, ClassNotFoundException;

    public void updatingcustomervalues(String username);

    public void updatingcustomervalues(long Billno);

    public void deletingcustomervalue(String username);

    public void searchingancustomervalues(int userid);

    public void Sortingancustomervalues();
}
