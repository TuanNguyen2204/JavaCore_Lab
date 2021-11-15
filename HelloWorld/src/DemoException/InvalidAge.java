package DemoException;

public class InvalidAge extends Exception {

    public InvalidAge(String mes) {
        super(mes);
    }
    
    public static void main(String[] args) {
        try {
            MyClass class1 = new MyClass();
            class1.MyMethod(-5);
        }
        catch(InvalidAge ex){
            System.out.println(ex.getMessage());
        }
    }
}
    class MyClass{
        public void MyMethod(int a) throws InvalidAge {
            if(a<0) throw new InvalidAge("Age invalid!");
        }
    }