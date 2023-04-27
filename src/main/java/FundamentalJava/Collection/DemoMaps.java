package FundamentalJava.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMaps
{
//    Random Order
//    hashmap,treemap,hashtable
//    key class ,value class
//    key class value cannot be changed,but value class can be changed...
//    add(put<K,V>,putall,get(k),remove(k),Containskey(k),containsvalue(v).....
    public static void main(String[] args)
    {
//        HashMap<String,Integer> obj=new HashMap<String,Integer>();
////
////        obj.put("Manojkumar",22);
////        obj.put("Annamalai",27);
////        obj.put("Jeejo",29);
////        obj.put("Razak",31);
////        obj.put("Manikandan",22);
////        obj.put("vinod",24);
////
////        System.out.println(obj);

        TreeMap<String,MobileApp> obj=new TreeMap<String,MobileApp>();

        MobileApp mob1=new MobileApp("Realme8",4,45000.0,7898765654l);
        MobileApp mob2=new MobileApp("Nokia45A",8,78000.0,568898989l);
        MobileApp mob3=new MobileApp("Redminote12pro ",12,65000.0,9789355426l);

        obj.put("Manojkumar",mob1);
        obj.put("Jeejo",mob1);
        obj.put("Annamalai",mob3);
        obj.put("Razak",mob2);
        obj.put("Dheena",mob3);

        System.out.println(obj);
        System.out.println(obj.entrySet());

        for(Map.Entry newobj:obj.entrySet())
        {
            System.out.println("keyclass: "+newobj.getKey()+"\t Value class: "+newobj.getValue());
        }

    }
}
