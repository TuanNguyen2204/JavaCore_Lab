
public class Node {
    Person infor;
    Node next;
    Node(){};
    Node(Person x, Node p){
        infor = x;
        next = p;
    }
    //chen duoi = addLast()
    Node(Person x){
        //this(x, null);
        infor = x;
        next = null;
    }
}
