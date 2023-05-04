package FundamentalJava.ConsoleApplication;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter and setter
@NoArgsConstructor
public class ElectricityBillProject implements Comparable<ElectricityBillProject>
{
    private int userid;
    private String username;
    private long Billnumber;
    private String Address;
    private double currentMonthcharge;

    @Override
    public String toString() {
        return "ElectricityBillProject{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", Billnumber=" + Billnumber +
                ", Address='" + Address + '\'' +
                ", currentMonthcharge=" + currentMonthcharge +
                '}';
    }

    public ElectricityBillProject(int userid, String username, long billnumber, String address, double currentMonthcharge) {
        this.userid = userid;
        this.username = username;
        Billnumber = billnumber;
        Address = address;
        this.currentMonthcharge = currentMonthcharge;
    }

    @Override
    public int compareTo(ElectricityBillProject o)
    {
        return this.username.compareTo(o.username);
    }
}
