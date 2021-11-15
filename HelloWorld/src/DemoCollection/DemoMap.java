
package DemoCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        //insert, update, delete, search
        hm.put("Hello","Xin chao");
        hm.put("one", "Mot");
        hm.put("two", "Hai");
        System.out.println("hm" + hm);
        System.out.println("cs: for-each");
        //chuyển ket --> keySet
        Set key = hm.keySet();
       for(Iterator it = key.iterator(); it.hasNext();) {
           Object next = it.next();
           System.out.println("key = " + next +" :value = " + hm.get(next));
       }
    }
}
