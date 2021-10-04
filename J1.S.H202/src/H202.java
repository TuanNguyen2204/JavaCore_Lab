
import java.util.Scanner;


public class H202 {
    public String checkInputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        while (true) {
            String input = sc.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Empty String. Enter again: ");
            }
            else return input;
        }
    }
    
    public String printReverse(String input){
        String reverse = "";
        for(int i= input.length()-1; i>=0; i--){
            reverse += input.charAt(i);
        }
        return reverse;
    }
    
    public static void main(String[] args) {
        H202 h = new H202();
        String input = h.checkInputString();
        System.out.println("String after reverse: " + h.printReverse(input));
    }
}
