package LinkedList;

public class Node {
    Object infor ;
    Node next;
    public Node(){

    }
    public Node(Object infor, Node next) {
        this.infor = infor;
        this.next = next;
    }


    public Node(Object x) {
        this.infor = x ;
        next = null ; 
    }
}