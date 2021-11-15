
package LinkedList;

public class MyLinkedListQueue {
    
    Node head, tail;
    
    public MyLinkedListQueue() {head = tail = null;}
    
    public boolean isEmpty() {return head == null;}
    //addLast
    public void enqueue(Object info) 
    {Node p = new Node(info);
     if(isEmpty()) head = tail = p;
     else {tail.next = p; tail = p;}
    }
    
    public Object dequeue()
    {if(isEmpty()) return null;
     Object info = head.infor;
     head = head.next;
     return info;
    }
    
    public Object front()
    {if(isEmpty()) return null;
     Object info = head.infor;
     return info;
    }
    
    public void clear() {head = tail = null;}
}
