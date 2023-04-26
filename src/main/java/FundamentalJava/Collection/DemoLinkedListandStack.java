package FundamentalJava.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DemoLinkedListandStack
{
//    add/addlast,addFirst,add(index,object),Remove(index),removefirst,removelast,remove(object),contains()
//        get(index),set(index,object),clear()
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList(); //Generic

        LinkedList<Integer> list1=new LinkedList<Integer>(); //Non-generic


        list.add("Manojkumar");
        list.add(6737367737477l);
        list.add(4.5);
        list.add('c');
        list.add(false);
//        System.out.println(list);
//
//        Iterator it=list.iterator();
//
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        list.add(2,"Razak");

        list.set(2,"Madheswaran");
        list.remove(4);
        System.out.println(list);

//        list.clear();
//        System.out.println(list);


//        push-add,pop-lastelement,empty(),peek()
        Stack<String>  LIFO=new Stack<String>();

        LIFO.push("Manojkumar");
        LIFO.push("JEEJO");
        LIFO.push("Annamalai");

        System.out.println(LIFO);
        LIFO.pop();
        System.out.println(LIFO);

        System.out.println(LIFO.search("Annamalai"));



    }
}
