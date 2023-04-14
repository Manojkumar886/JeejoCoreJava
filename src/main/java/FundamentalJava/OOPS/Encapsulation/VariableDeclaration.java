package FundamentalJava.OOPS.Encapsulation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter and setter (tostring)
@NoArgsConstructor //Defalut
@AllArgsConstructor //Parameterized
public class VariableDeclaration
{
    private String AccountHolderName;
    private Long AccountNo;
    private Double AccountBalance;

}
