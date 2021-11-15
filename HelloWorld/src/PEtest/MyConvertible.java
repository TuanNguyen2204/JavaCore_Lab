
package PEtest;

public class MyConvertible implements Convertible{
    public double toMile(double km) {
        return km*0.621371 ;
    }
    
    public String getCoder(String rc) {
        String result = "";
        for(int i=0; i<rc.length(); i++){
            result = result + rc.charAt(i);
            if(i % 3 == 2 && i!=rc.length()-1) { //A12-BE2-CM5
                result = result + "-";
            }
        }
        
        //for(int i=0; i<rc.length()-1;i++
        return result;
    }

    
//    public static void main(String[] args) {
//        MyConvertible mc = new MyConvertible();
//        double a = mc.toMile(16.5);
//        System.out.println(String.format("%.2f", a));
//        
//        System.out.println(mc.getCoder("A12BE2CM5"));
//    }
}