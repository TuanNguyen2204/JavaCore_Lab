package Array;

import java.util.EmptyStackException;

public class ArrayStack {
    Object[] a;
    int top, max;

    ArrayStack(int max1) {
        max = max1;
        a = new Object[max];
        top = -1;
    }
    
    ArrayStack() {
        this(50);
    }
    
    private boolean grow() {
        int max1 = max + max / 2;
        Object[] a1 = new Object[max1];
        if(a1 == null) {
            return false;
        }
        for(int i=0; i<=top; i++) {
            a1[i] = a[i];
        }
        a = a1;
        return true;
    }
    
    boolean isEmpty() {
        return (top == -1);
    }
    
    boolean isFull() {
        return (top == max -1);
    }
    
    void clear(){
        top = -1;
    }
    
    void push(Object x) {
        if(isFull() && !grow()){
            return;
        }
        a[++top] = x;
    }
    
    Object top() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return (a[top]);
    }
    
    Object pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Object x = a[top];
        top--;
        return (x);
    }
    
    void displayAll() {
        System.out.println("Elements in the list are: ");
        for(int i=0; i<=top; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
    
    //Loai bo 1 phan tu bat ki trong danh sach
    void delAny(int index) {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        if(index<0 || index>top+1 || index>max-1){
            System.out.println("Index khong thoa man");
        } 
        else {
           // ArrayStack temp = new ArrayStack(max);
            for(int i=index; i<top; i++) {
                a[i] = a[i+1];
            }
                top--;
        }
    }
}
