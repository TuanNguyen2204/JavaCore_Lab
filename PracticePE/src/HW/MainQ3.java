
package HW;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

interface iTV {

    int f1(ArrayList<TV> a, int x, String s);
    
    void f2(ArrayList<TV> a, int x, String s); 

    String f3(ArrayList<TV> a, int x, String s);
}

class myTV implements iTV{

    @Override
    //9. Tìm và trả về size phổ biến nhất trong list a
    public int f1(ArrayList<TV> a, int x,String s) {
        ArrayList<Integer> arSize = new ArrayList<>();
        arSize.add(a.get(0).getSize());
        
        for (int i = 1; i < a.size(); i++) {
            boolean f = true;
            for (int j = 0; j < arSize.size(); j++) {
                if(arSize.get(j) == a.get(i).getSize()) {
                    f = false;
                    break;
                }
            }
            if(f == true) arSize.add(a.get(i).getSize());
        }
        
        ArrayList<Integer> arCount = new ArrayList<>();
        for (int i = 0; i < arSize.size(); i++) {
            int count = 0;
            for (int j = 0; j < a.size(); j++) {
                if(arSize.get(i) == a.get(j).getSize())
                    count++;
            }
            arCount.add(count);
        }
        
        int indexCount = 0;
        int maxCout = arCount.get(0);
        for (int i = 0; i < arCount.size(); i++) {
            if(maxCout < arCount.get(i)) {
                maxCout = arCount.get(i);
                indexCount = i;
            }
        }
        
        return arSize.get(indexCount);
    }

    @Override
    public void f2(ArrayList<TV> a, int x, String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String f3(ArrayList<TV> a, int x, String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class MainQ3 {
    public static void main(String[] args) {
        ArrayList<TV> ar = new ArrayList<TV>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n;i++){
            System.out.println("Input name of TV" + i+" = ");
            String name = sc.nextLine();
            System.out.println("Input size of TV" + i+" = ");
            int size = Integer.parseInt(sc.nextLine());
            System.out.println("Input price of TV" + i+" = ");
            double price = Double.parseDouble(sc.nextLine());
            ar.add(new TV(name, size, price));
        }
        System.out.println("Input value x = ");
        int x = Integer.parseInt(sc.nextLine());
        myTV mtv = new myTV();
    }
}

