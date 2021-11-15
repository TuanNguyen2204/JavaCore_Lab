
package BTVN;

public class BT73 {
    static int isAmstrong(int n){
        int digit, amstrong = 0;
        while(n != 0){
           digit = n % 10 ;
           amstrong = (int) (amstrong + Math.pow(digit, 3));
           n = n / 10;
        }
       return amstrong;
    }
    static void check(){
        int i;
        for(i = 1; i <= 5000;i++){
            if(i == isAmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        BT73.check();
    }
}
