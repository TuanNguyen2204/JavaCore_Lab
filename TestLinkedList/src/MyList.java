//Singly LinkedList
public class MyList {
    Node head, tail;
    MyList(){
        head = tail = null;
    }
    void clear(){
        head = tail = null;
    }
    boolean isEmpty(){
        return head == null;
    }
    //chen vao duoi o(1)
    void addLast(Person x){
        Node p = new Node(x);
        //ds rong
        if(isEmpty()){
            head = tail = p;
            return;
        }
        //ds da co phan tu
        tail.next = p;
        tail = p;
    }
    //nhieu phan tu vao cuoi
    void addLastMany(String[] name, int[] age){
        for(int i=0; i<name.length; i++){
            addLast(new Person(name[i], age[i]));
        }
    }
    //visit = tham dua thong tin cua node (info)
    void visit(Node p){
        if(p!=null){
            System.out.print(p.infor+" ");
        }
    }
    //traverse = duyet = tham ca ds lien ket
    void traverse(){
        Node p=head;
        while(p!=null){
            visit(p);
            p=p.next;
        }
        System.out.println();
    }
}