
import java.util.Scanner;

public class H203 {
    public String inputString() {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(true) {
            System.out.print("Enter string: ");
            s = sc.nextLine().trim();
            if(!s.isEmpty()) break;
        }
        return s;
    }
    
    public void printReverse(String s){
        if(s.equals("")) {
            s = new H203().inputString();
        }
        String[] ss = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length-1; i >0; i--) {
            sb.append(ss[i]);
            sb.append(" ");
        }
        sb.append(ss[0]);
        sb=sb.replace(0, 1, (sb.charAt(0)+"").toUpperCase());
        System.out.println(sb);
    }


    public static void main(String[] args) {
        H203 A = new H203();
        String s = A.inputString();
        A.printReverse(s);

    }
}