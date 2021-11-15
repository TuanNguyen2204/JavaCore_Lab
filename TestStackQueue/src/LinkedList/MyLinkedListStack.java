package LinkedList;

public class MyLinkedListStack {

    int size = 0 ; 
    Node head;

    public MyLinkedListStack() {
        head = null;
        size = 0;
    }

    boolean isEmpty(){
        return (size>=0);
    }

    void addToHead(Object a) {
        Node p = new Node(a);
        if (isEmpty()) {
            head = p;
            size = 1;
            return;
        }
        p.next = head;
        head = p;
        size++;
    }

    Object deleteFromHead() {
        Object res = head.infor;
        if (isEmpty()) {
            return (Integer) null;
        }
        else {
            head = head.next;
            size--;
        }
        return res;
    }
    void clear(){
        head = null;
    }

    void push(Object x){
        if ( head == null) return ; 
        addToHead(x);
    }
    void pop(){
        if ( size >= 0 )
            deleteFromHead();
        else {
            throw new java.util.EmptyStackException();
        }
    }
    Object top(){
        if ( isEmpty())  throw new java.util.EmptyStackException();
        else 
            return head.infor;
    }
    void traverse(){
        while(!isEmpty() ) {
            System.out.println(top());
            pop();
        }
    } 
}
