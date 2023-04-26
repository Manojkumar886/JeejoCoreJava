package FundamentalJava.Collection;

import java.util.ArrayList;
import java.util.Vector;

public class DemoVectorandArrayList
{
//    add,addAll(),add(index,object),RemoveAll()-original element,RetainALl-Duplicates values
    public static void main(String[] args)
    {

        Vector obj=new Vector();

        obj.add("Manojkumar");
        obj.add(986);
        obj.add(9789355930l);
        obj.add(89.9f);
        obj.add(true);
        obj.add(56740);

        System.out.println("MY Vector values  "+obj);

        ArrayList obj1=new ArrayList();
        obj1.addAll(obj);
        obj1.add(0,"Jeejo123");
        obj1.add(43.4f);
        obj1.add(4,false);

        System.out.println("my ArrayValues : " +obj1);

//        obj1.removeAll(obj);
//
//        System.out.println("my removed value :"+obj1);

        obj.retainAll(obj1);
        System.out.println(" my retained values :"+obj);


    }
}
