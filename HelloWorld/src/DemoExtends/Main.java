
package DemoExtends;

public class Main{
    public static void main(String[] args) {
        int x = 0;
        float k = 0.0f;
        //Product p = null;
        Product p = new Product();
        p.giaban = 10d;
        p.setGiaban(2);
        System.out.println(p.getGiaban());
    }
}
