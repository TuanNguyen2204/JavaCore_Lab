
import java.math.BigInteger;

public class Convert {

    Validate val = new Validate();

    //convert from base 10 to another base
    public String convertFromDec(String dec, int baseInput) {
        StringBuilder result = new StringBuilder();
        BigInteger DEC = new BigInteger(dec);
        BigInteger base = new BigInteger(Integer.toString(baseInput));
        BigInteger remainder;
        while (!DEC.equals(BigInteger.ZERO)) {
            remainder = DEC.mod(base);  //lấy dư biginteger
            int mod = remainder.intValue();
            String temp = "";
            switch (mod) {
                case 10:
                    temp = "a";
                    break;
                case 11:
                    temp = "b";
                    break;
                case 12:
                    temp = "c";
                    break;
                case 13:
                    temp = "d";
                    break;
                case 14:
                    temp = "e";
                    break;
                case 15:
                    temp = "f";
                    break;
                default:
                    temp = mod + "";
            }
            result.insert(0, temp);
            DEC = (DEC.subtract(remainder)).divide(base);//Biginteger thương sau mỗi lần lặp
        }
        return val.formatNumber(result.toString());
    }

    //convert other base to decimal 
    public String convertToDec(String input, int baseInput) {
        String hexString = "0123456789ABCDEF";
        BigInteger result = new BigInteger("0");
        BigInteger base = new BigInteger(String.valueOf(baseInput));
        BigInteger indexValue;
        BigInteger pow = new BigInteger("1");
        for (int i=input.length()-1; i>=0; i--) {
            
            //1111111111111111111111111111111111111111111111111111111111111111
            //value(10) charAt[i] of input String
            indexValue = new BigInteger(String.valueOf(hexString.indexOf(input.charAt(i))));
            //current Pow by Index
            //if indexValue = 0
            if (indexValue.equals(BigInteger.ZERO)) {
                continue;
            }
            //1*2
            result = result.add(indexValue.multiply(pow));
            //2^2
            //current base^
            pow = pow.multiply(base);

           
        }
        return val.formatNumber(String.valueOf(result));

    }
}
