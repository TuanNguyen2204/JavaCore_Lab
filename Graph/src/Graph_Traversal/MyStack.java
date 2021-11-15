/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph_Traversal;

/**
 *
 * @author Tuan
 */
import java.util.*;
public class MyStack {
   LinkedList<Integer> t;
   MyStack() {
     t=new LinkedList<Integer>();  
   }
   void clear() {
     t.clear();  
   }
   boolean isEmpty() {
     return(t.isEmpty());  
   }
   void push(Integer p) {
      t.addLast(p);
   }
   Integer pop() {
      if(isEmpty()) return(null);
      return(t.removeLast());
   }
   Integer top() {
      if(isEmpty()) return(null);
      return(t.getLast());    
   }
}

