
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuan
 */
public class Main {

    public static void main(String[] args) {
        Validate v = new Validate();
        Convert c = new Convert();
        while (true) {
            System.out.println("---Program to convert Binary, Decimal, Hexadecimal---");
            int baseInput = v.getBase("Enter base input(2, 10, 16): ", "Base invalid.");
            String value = v.getInputValue(baseInput);
            int baseOutput = v.getBase("Enter base output(2, 10, 16): ", "Base invalid.");
            String tmp = "";
            switch (baseInput) {
                case 2:
                    if (baseOutput == 10) {
                        tmp = c.convertToDec(value, 2);
                    } else if (baseOutput == 16) {
                        tmp = c.convertToDec(value, 2);
                        tmp = c.convertFromDec(tmp, 16);
                    } else {
                        tmp = value;
                    }
                    break;
                case 10:
                    if (baseOutput == 2) {
                        tmp = c.convertFromDec(value, 2);
                    } else if (baseOutput == 16) {
                        tmp = c.convertFromDec(value, 16);
                    } else {
                        tmp = value;
                    }
                    break;
                case 16:
                    if (baseOutput == 10) {
                        tmp = c.convertToDec(value, 16);
                    } else if (baseOutput == 2) {
                        tmp = c.convertToDec(value, 16);
                        tmp = c.convertFromDec(tmp, 2);
                    } else {
                        tmp = value;
                    }
                    break;
            }
            System.out.println("After change base: " + tmp);
            System.out.println("================================");
        }
         
    }
}
