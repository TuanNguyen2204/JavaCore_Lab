/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph_Traversal;
public class Graph {
    int [][] a; int n;
    char [] v;
    Graph() {
      v = "ABCDEFGHIJKLMN".toCharArray();  
    }
    void setData(int [][] b) {
       n=b.length;
       int i,j;
       a = new int[n][n];
       for(i=0;i<n;i++)
           for(j=0;j<n;j++) a[i][j]=b[i][j];
    }
    void dispAdj() {
       int i,j;
       for(i=0;i<n;i++) {
          System.out.println();
           for(j=0;j<n;j++) {
               System.out.printf("%4d",a[i][j]);
           }
       }
    }
    void visit(int i) {
        System.out.print(v[i]+"  ");
    }
    void breadth(boolean [] en, int i) {
       MyQueue q = new MyQueue();
       //dua vao queue - danh dau da tham
       q.enqueue(i); en[i]=true;
       int r;
       while(!q.isEmpty()) {
         r=q.dequeue();//lay ra tham
         visit(r);
         //duyet tiep nhung node lien ke
         for(int j=0;j<n;j++)
           if(!en[j] && a[r][j]>0 ) {
              q.enqueue(j);//dua vao queue
              en[j]=true;//danh dau
           }  
       }
    }
    void breadth(int k) {
      boolean [] en = new boolean[n];
      int i,j;
      for(i=0;i<n;i++) en[i]=false;
      breadth(en,k);
      for(i=0;i<n;i++) if(!en[i]) breadth(en,i);
      
    }
    void depth(boolean [] vis, int i) {
       visit(i);vis[i]=true;
       for(int j=0;j<n;j++)
         if(!vis[j] && a[i][j]>0) depth(vis,j);  
    }
    void depth(int k) {
      boolean [] vis = new boolean[n];
      int i,j;
      for(i=0;i<n;i++) vis[i]=false;
      depth(vis,k);
      for(i=0;i<n;i++) if(!vis[i]) depth(vis,i);
      
    }
}

