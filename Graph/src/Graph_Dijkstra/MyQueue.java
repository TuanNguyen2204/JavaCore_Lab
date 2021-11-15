/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph_Dijkstra;

/**
 *
 * @author Tuan
 */
import java.util.*;
public class MyQueue {
   LinkedList<Integer> t;
   MyQueue() {
     t=new LinkedList<Integer>();  
   }
   void clear() {
     t.clear();  
   }
   boolean isEmpty() {
     return(t.isEmpty());  
   }
   void enqueue(Integer p) {
      t.addLast(p);
   }
   Integer dequeue() {
      if(isEmpty()) return(null);
      return(t.removeFirst());
   }
   Integer front() {
      if(isEmpty()) return(null);
      return(t.getFirst());    
   }
}

