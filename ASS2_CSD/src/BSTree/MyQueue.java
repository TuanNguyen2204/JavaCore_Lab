/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTree;
import java.util.*;
/**
 *
 * @author Tuan
 */
public class MyQueue {
    public LinkedList<Node> t;

    public MyQueue() {
        t = new LinkedList<>();
    }

    public void clear() {
        t.clear();
    }

    public boolean isEmpty() {
        return t.isEmpty();
    }

    public void enqueue(Node p) {
        t.addLast(p);
    }

    public Node dequeue() {
        if (isEmpty()) {
            return null;
        }
        return t.removeFirst();
    }

    public Node front() {
        if (isEmpty()) {
            return null;
        }
        return t.getFirst();
    }
}
