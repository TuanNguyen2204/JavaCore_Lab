package DemoCollection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Random;
import java.util.Scanner;

class mySort implements Comparator {

    public int compare(Object o1, Object o2) {
        //String trươc số, số sort giảm dần, string sort tăng dần
        int kq = 0;
        if ((o1 instanceof String) && (o2 instanceof Integer)) {
            kq = -1;
        }
        if ((o1 instanceof Integer) && (o2 instanceof String)) {
            kq = 1;
        }
        if ((o1 instanceof Integer) && (o2 instanceof Integer)) {
            kq = -Integer.compare((int) o1, (int) o2);
        }
        if ((o1 instanceof String) && (o2 instanceof String)) {
            kq = ((String) o1).compareTo((String) o2);
        }
        return kq;
    }
}
class mysort1 implements Comparator{
    public int compare(Object o1, Object o2){
        int kq = 0;
        if((o1 instanceof String) && (o2 instanceof Integer)) kq = -1;
        if((o1 instanceof String) && (o2 instanceof Double)) kq = -1;
        if((o1 instanceof String) && (o2 instanceof String))
            kq = ((String)o1).compareTo((String)o2);
        if((o1 instanceof Integer) && (o2 instanceof Double)) kq = -1;
        if((o1 instanceof Integer) && (o2 instanceof String)) kq = 1;
        if((o1 instanceof Integer) && (o2 instanceof Integer))
            kq = -Integer.compare((int)o1, (int)o2);
        if((o1 instanceof Double) && (o2 instanceof String)) kq = 1;
        if((o1 instanceof Double) && (o2 instanceof Integer)) kq = 1;
        if((o1 instanceof Double) && (o2 instanceof Double))
            kq = -Double.compare((double)o1, (double)o2);
        return kq;
    }
}

class mysort2 implements Comparator{
    public int compare(Object o1, Object o2){
        int kq = 0;
        if((o1 instanceof String) && (o2 instanceof Integer)) kq = 1;
        if((o1 instanceof String) && (o2 instanceof Double)) kq = 1;
        if((o1 instanceof Integer) && (o2 instanceof Double))
            kq = -Double.compare((double)o1, (double)o2);
        if((o1 instanceof Double) && (o2 instanceof Integer))
            kq = -Double.compare((double)o1, (double)o2);
        if((o1 instanceof Double) && (o2 instanceof Double))
            kq = Double.compare((double)o1, (double)o2);
        if((o1 instanceof Integer) && (o2 instanceof Integer))
            kq = -Integer.compare((int)o1, (int)o2);
        return kq;    
    }
}

public class DemoSet {

    public static void main(String[] args) {
        // mySort my = new mySort();
        mysort1 m1 = new mysort1();
        mysort2 m2 = new mysort2();
        TreeSet ts = new TreeSet(m1);
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("(Input size of TreeSet");
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            ts.add(rd.nextInt(10));//sinh ra 1 số ngẫu nhiên từ 0-9
        }
//        HashSet hs = new HashSet();
//        hs.add(10);
//        hs.add("Hello");
//        hs.add(true);
//        hs.add(10.0);
//        hs.add(new String("Hello"));
//        System.out.println("hs = "+hs);
//        
//        hs.remove(10);
        ts.add("Hello");
        ts.add(7.5);
        //ts.add(10.0);
        System.out.println("ts = " + ts);
        //c2:for-each
//        for (Object h : hs){
//            System.out.print(h+", ");
//        }
//        
//        System.out.println("");
//        for(Iterator it = hs.iterator(); it.hasNext(); ) {
//            Object next = it.next();
//            System.out.print(next + ", ");
//        }
    }
}
