/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Tuan
 */
public class MyList<T> {
    public Node<T> head, tail;
    
    public MyList(){
        head = tail = null;
    }
    public void clear(){
        head = tail = null;
    }
    
     public boolean isEmpty() {
        return (head == null);
    }
     
     public int size() {
        int size = 0;
        Node q = head;
        while (q != null) {
            q = q.next;
            size++;
        }
        return size;
    }
     
     public void addFirst(T x) {
        head = new Node(x, head);
        if (tail == null) {
            tail = head;
        }
    }
      public void addLast(T x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }
      
      public void insertAfter(Node q, T x) {
        Node p = new Node(x);
        p.next = q.next;
        q.next = p;
    }
      
      public void remove(Node q) {
        Node i = head;
        while (i != null) {
            if (i.next == q) {
                i.next = q.next;
                q.next = null;
                break;
            }
            i = i.next;
        }
    }
      public Node pos(int k) {
        Node i = head;
        while (i != null) {
            i = i.next;
            k--;
            if (k == 0) {
                return i;
            }
        }
        return (null);
    }

    public void removePos(int k) {
        remove(pos(k));
    }
}
