package DemoCollection;

//import java.util.ArrayList;
//import java.util.Vector;
import java.util.*;

public class DemoList {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        //Collection khac voi array trong C: tap hop cac bien, cung kieu, dia chi lien tuc
        //luu tru gia tri bat ki, khong nhat thiet cung kieu du kieu
        //dia chi cua cac phan tu khong lien tuc
        ar.add(true); //add duplicate
        ar.add(30);
        ar.add("Hello");
        //display
        System.out.println("display c1:hien thi ca object " + ar.toString());
        System.out.println("display c1: hien thi ca object" + ar);
        System.out.println("display c2: hien thi tung phan tu: dung get");
       // ar.remove(ar.get(1));
        for (int i = 0; i < ar.size(); i++) {//.size: kich thuoc cua list
            System.out.println(ar.get(i) + ", ");
        }
        System.out.println("c3: hien thi tung phan tu dung iterator - for");
        for (Iterator it = ar.iterator(); it.hasNext();) {
            Object next = it.next();
            System.out.println(next + ", ");
        }
        System.out.println("c4: dung iterator - while: ");
       Iterator it = ar.iterator();
       while(it.hasNext()){
           System.out.println(it.next() + ", ");
       }
        
        
        
        //Iterator it = ar.iterator() //Vector v = new Vector();
                //cac thao tac co ban voi Collection:
                //them, sua, xoa, timkiem
    }
}
