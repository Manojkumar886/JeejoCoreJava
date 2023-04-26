package FundamentalJava.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoSets
{
//    Hashset and Treeset
//    add,addall,add(index,object),remove(index),remove(obj),removeall,retainall.......
//    duplicates not allowed
//    no order is maintained
    public static void main(String[] args)
    {
        HashSet<Character> set1=new HashSet<Character>();
        set1.add('A');
        set1.add('B');//compile time
        set1.add('B');
        set1.add('C');
        set1.add('D');
        set1.add('E');


        System.out.println(set1);

        TreeSet<Character> set2=new TreeSet<Character>();

        set2.addAll(set1);



        Iterator i=set2.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}