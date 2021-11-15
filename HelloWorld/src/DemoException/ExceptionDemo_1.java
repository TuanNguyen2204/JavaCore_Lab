package DemoException;

public class ExceptionDemo_1 {

    public int divide1(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public int divide2(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Hey. Denominator:0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionDemo_1 obj = new ExceptionDemo_1();
        try {
            System.out.println(obj.divide1(6, 0));
        } 
        catch (Exception e) //generate exception 
        {
            System.out.println(e);
        }
    }
}
