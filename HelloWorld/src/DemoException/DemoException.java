package DemoException;

public class DemoException {

    public static void main(String[] args) {
        System.out.println("Hello");
        String s = "hello";
        try {
            //System.out.println(3 / 0);
            System.out.println("check1");
            System.out.println(s.charAt(10));
            System.out.println("check2");
        } 
        
        catch (ArithmeticException ex) {
            System.out.println("loi toan hoc" + ex.getMessage());
        }
       // catch(StringIndexOutOfBoundsException ex) {
         //   System.out.println("String Inex out of exception");
       // }
        catch (RuntimeException ex) {
            System.out.println("loi khac" + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Co loi" + ex.getMessage());
        } 
        finally{
        System.out.println("Goodbye");
        }
    }
}

//try-catch-finally
//kiem tra block try co thuc hien dc ko?
//neu no thuc hien  dc ma ko co loi thi no bo qua tat ca cac catch no se nhay den block finally (neu co)
//Neu co loi trong block try thi instructor no se bo qua toan bo cau lenh phia sau vi tri loi trong block try 
//nhảy đến 1 catch gần và phù hợp với lỗi đó