
package BTVN;

public class BT19 {
    public BT19() {
    }
    static boolean isPalindrome(int n){
        int temp = n;
        int i, palindrome = 0;
        while(n != 0){
           i = n % 10 ;
           palindrome = palindrome*10 + i;
           n = n / 10;
        }
        if(temp == palindrome ){
            return true;
        }
        return false;
    }
    static void check(){
        int i;
        for(i = 1; i < 100; i++){
            if(isPalindrome(i*i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        BT19.check();
    }
}
