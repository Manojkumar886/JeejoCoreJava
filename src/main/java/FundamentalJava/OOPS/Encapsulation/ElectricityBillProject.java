package FundamentalJava.OOPS.Encapsulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElectricityBillProject
{
    private int userid;
    private String username;
    private long Billnumber;
    private String Address;
    private double currentMonthcharge;

}
