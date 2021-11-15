
public class Main {
    public static void main(String[] args) {
//        //Don gian
//        Person p = new Person("Ha", 20);
//        Node x = new Node(p);
//        System.out.println("Info x: "+ x.infor);
//        System.out.println("------------------");
//        //Node
//        Node a,b,c;
//        a= new Node(p);
//        b = new Node(new Person("Thu", 19), a);
//        c = new Node(new Person("Tuan", 20), b);
//        System.out.println("Infor c:"+c.infor);
//        System.out.println("Infor b:"+b.infor);//c.next.infor
//        System.out.println("Infor a:" + c.next.next.infor);
        //danh sach
        String[] name = {"Ha", "Binh", "Tuan", "Ngoc"};
        int[] age = {19,20,21,20};
        MyList ml = new MyList();
        ml.addLastMany(name, age);
        ml.traverse();
       // System.out.println();
       
    }
}
