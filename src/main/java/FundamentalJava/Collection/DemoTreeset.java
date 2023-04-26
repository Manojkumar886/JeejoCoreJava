package FundamentalJava.Collection;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset
{
    public static void main(String[] args)
    {
        TreeSet<MobileApp> Poorvika=new TreeSet<MobileApp>();//non-generic

        Poorvika.add(new MobileApp("Realme",4,23000.0,9789355930l));
        Poorvika.add(new MobileApp("Samsung",2,13000.0,5789355930l));
        Poorvika.add(new MobileApp("Nokia",16,53000.0,6789355930l));
        Poorvika.add(new MobileApp("Vivo",8,33000.0,7789355930l));

        MobileApp app=new MobileApp("Redmi",5,89000.0,82738728377l);

        Poorvika.add(app);

        Iterator i=Poorvika.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

@AllArgsConstructor
class MobileApp implements Comparable<MobileApp>
{
    String MobileBrand;
    Integer Ram;
    Double Price;
    Long MobileNo;


    @Override
    public String toString() {
        return "MobileApp{" +
                "MobileBrand='" + MobileBrand + '\'' +
                ", Ram=" + Ram +
                ", Price=" + Price +
                ", MobileNo=" + MobileNo +
                '}';
    }


    @Override
    public int compareTo(MobileApp mobile)
    {
        return mobile.MobileBrand.compareTo(this.MobileBrand);
    }
}