
import java.util.Scanner;


public class Main {

    
    public String getInputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        while(true){
            String input = sc.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Emty String. Enter again: ");
            }
            else return input;
        }
    }
    
    public int secondHalfLetters(String input) {
        input = input.toLowerCase();
        char[] str = input.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i] >= 'n' && str[i] <='z') {
             count++;
            }
        }
         return count;
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        String input = m.getInputString();
        System.out.println("Count = " + m.secondHalfLetters(input));
    }
}
