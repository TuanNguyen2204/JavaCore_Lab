package BlockCode;

public class A {

    A() {
        System.out.println("Constructor A");
    }

    {
        System.out.println("Block code A1");
    }

    {
        System.out.println("Block code A2");
    }

    static {
        System.out.println("Static block code A1");
         int a = 2;
        System.out.println(a);
    }

    static {
        System.out.println("Static block code A2");
    }
}

class B extends A {
    //xay dung cac vung static, none static, cs
    static {
        System.out.println("Static block code B");
    }
    static {
        System.out.println("B");
    }

    B() {
        System.out.println("Block code B");
    }
    }
    

class C extends B {
    //nhu tren

}




    class Using {

    public static void main(String[] args) {
        new A();
        new B();
//            new C();
//            new C();
    }
}
