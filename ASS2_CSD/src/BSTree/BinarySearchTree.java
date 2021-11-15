/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTree;

import Entity.Book;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void clear() {
        this.root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public Node search(Node p, String code) {
        if (p == null) {
            return null;
        }
        if (p.data.getBcode().equalsIgnoreCase(code)) {
            return p;
        }
        if (code.compareToIgnoreCase(p.data.getBcode()) < 0) //code < p.data
        {
            return search(p.left, code);
        } else //code > p.data
        {
            return search(p.right, code);
        }
    }

    public void insert(Book x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node a = null, b = root;
        while (b != null) {
            if (b.data.getBcode().equalsIgnoreCase(x.getBcode())) {
                System.out.println("Failed! Data already exist!");
                return;
            }
            a = b;
            if (x.getBcode().compareToIgnoreCase(b.data.getBcode()) < 0) // code < b.data
            {
                b = b.left;
            } else // code > b.data
            {
                b = b.right;
            }
        }
        if (x.getBcode().compareToIgnoreCase(a.data.getBcode()) < 0) // code < b.data
        {
            a.left = new Node(x);
        } else // code > b.data
        {
            a.right = new Node(x);
        }
    }

    public void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.println(p.data + " ");
    }

    public void breath(Node p) {
        if (p == null) {
            return;
        }
        MyQueue queue = new MyQueue();
        queue.enqueue(p);
        Node r;
        while (!queue.isEmpty()) {
            r = queue.dequeue();
            visit(r);
            if (r.left != null) {
                queue.enqueue(r.left);
            }
            if (r.right != null) {
                queue.enqueue(r.right);
            }

        }
    }

    public void inOrderTravesal(Node p) {
        if (p == null) {
            return;
        }
        inOrderTravesal(p.left);
        visit(p);
        inOrderTravesal(p.right);
    }

    public void preOrderTravesal(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        inOrderTravesal(p.left);
        inOrderTravesal(p.right);
    }

    public void postOrderTravesal(Node p) {
        if (p == null) {
            return;
        }
        inOrderTravesal(p.left);
        inOrderTravesal(p.right);
        visit(p);
    }

    public void deleteByCopy(Book x) {
        Node f = null, p = root;
        while (p != null) {
            if (p.data.getBcode().equalsIgnoreCase(x.getBcode())) {
                break;
            }
            f = p;
            if (x.getBcode().compareToIgnoreCase(p.data.getBcode()) < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (p == null) {
            return; // not found
        }
        // p is a leaf-node
        if (p.left == null && p.right == null) {
            if (f == null) {  // p==root
                root = null;
            } else {
                if (p == f.left) {
                    f.left = null;
                } else {
                    f.right = null;
                }
            }
            return;
        }
        // p has left-child only
        if (p.left != null && p.right == null) {
            if (f == null) { //p == root
                root = p.left;
            } else {
                if (p == f.left) {
                    f.left = p.left;
                } else {
                    f.right = p.left;
                }
            }
            return;
        }
        // p has right-child only
        if (p.left == null && p.right != null) {
            if (f == null) { // p == root
                root = p.right;
            } else {
                if (p == f.left) {
                    f.left = p.right;
                } else {
                    f.right = p.right;
                }
            }
            return;
        }
        // p has 2 children
        if (p.left != null && p.right != null) {
            Node q = p.left; // p is the root of the left-child
            Node frp, rp;
            frp = null;
            rp = q;
            while (rp.right != null) {
                frp = rp;
                rp = rp.right;
            }
            // rp is the right-most node
            p.data = rp.data;
            if (frp == null) {
                p.left = q.left;
            } else {
                frp.right = rp.left;
            }
        }
    }
    
    public void inOrderAdd(ArrayList<Book> t, Node p) {
        if (p == null) {
            return;
        }
        inOrderAdd(t, p.left);
        t.add(p.data);
        inOrderAdd(t, p.right);
    }

    public void balance(ArrayList<Book> t, int i, int j) {
        if (i > j) {
            return;
        }
        int k = (i + j) / 2;
        Book x = t.get(k);
        insert(x);
        balance(t, i, k - 1);
        balance(t, k + 1, j);
    }

    public void balance() {
        ArrayList<Book> t = new ArrayList<>();
        inOrderAdd(t, root);
        int n = t.size();
        clear();
        balance(t, 0, n - 1);
    }
    
    public void balance(Node p) {
        ArrayList<Book> t = new ArrayList<>();
        inOrderAdd(t, p);
        int n = t.size();
        clear();
        balance(t, 0, n - 1);
    }
}
