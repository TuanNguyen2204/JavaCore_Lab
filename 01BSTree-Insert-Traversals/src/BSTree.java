
import java.util.ArrayList;
import java.util.List;

public class BSTree {

    Node root;

    BSTree() {
        root = null;
    }

    void clear() {
        root = null;
    }

    boolean isEmpty() {
        return (root == null);
    }

    void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            if (p.info == x) {
                System.out.println("The key" + x + " already existed!");
            }
            f = p;
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (x < f.info) {
            f.left = new Node(x);
        } else {
            f.right = new Node(x);
        }
    }

    void insertMany(int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }

    void visit(Node p) {
        if (p != null) {
            System.out.print(p.info + " ");
        }
    }

    //Deep
    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    //Breadth-first
    void breadth(Node p) {
        if (p == null) {
            return;
        }
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node v;
        while (!q.isEmpty()) {
            v = q.dequeue();
            visit(v);
            if (v.left != null) {
                q.enqueue(v.left);
            }
            if (v.right != null) {
                q.enqueue(v.right);
            }
        }
    }

    Node search(Node p, int x) {
        if (p == null) {
            return null;
        }
        if (p.info == x) {
            return p;
        }
        if (x < p.info) {
            return search(p.left, x);
        } else {
            return search(p.right, x);
        }
    }

    void deleteByCopy(int x) {
        Node f, p;  //p la node can xoa
        p = root;
        f = null;

        //tim node can xoa
        while (p != null) {
            if (p.info == x) {
                break;//tim thay node can xoa
            }
            f = p;//cha cua p
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (p == null) {
            return;//khong tim thay de xoa
        }        //delete leaf-node
        if (p.left == null && p.right == null) {
            if (f == null) {
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
        //p has left-son
        if (p.left != null && p.right == null) {
            if (f == null) {
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
        //p has right-son
        if (p.right != null && p.left == null) {
            if (f == null) {
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
        //p has 2 son
        //tim node con ben trai, roi tim node con ben phai nhat cua node do thay the vi tri voi node can xoa 
        //vi khi do node con ben phai nhat la node co gia tri lon nhat sau node can xoa de thay the or the mang
        if (p.left != null && p.right != null) {
            Node q = p.left;
            Node fp1, p1;
            p1 = q;
            fp1 = null;
            while (p1.right != null) {
                fp1 = p1;
                p1 = p1.right;
            }
            //p1 is the right-most node
            p.info = p1.info;
            //p1 has not right node
            if (fp1 == null) {
                p.left = q.left;
            } else {
                fp1.right = p1.left;
            }
        }
    }
    //count height of tree

    public int height(Node p) {
        if (p == null) {
            return 0;
        }
        int l = height(p.left) + 1;
        int r = height(p.right) + 1;
        return (l > r) ? l : r;
    }

    //count number of node
    int countNodeOfTree(Node p) {
        if (p == null) {
            return (0);
        }
        int k, h, r;
        k = countNodeOfTree(p.left);
        h = countNodeOfTree(p.right);
        r = k + h + 1;
        return (r);
    }

    //simple balance a tree
    void inOrder(List<Integer> t, Node p) {
        if (p == null) {
            return;
        }
        inOrder(t, p.left);
        t.add(p.info);
        inOrder(t, p.right);
    }

    void balance(List<Integer> t, int first, int last) {
        if (first > last) {
            return;
        }
        int mid = (first + last) / 2;
        int x = t.get(mid);
        insert(x);
        balance(t, first, mid - 1);
        balance(t, mid + 1, last);
    }

    void balance() {
        List<Integer> t = new ArrayList<>();
        inOrder(t, root);
        clear();
        int n = t.size() - 1;
        balance(t, 0, n - 1);
    }

    //quay don
    Node rotateRight(Node p) {
        if (p == null || p.left == null) {
            return (p);
        }
        Node q = p.left;
        p.left = q.right;
        q.right = p;
        return q;
    }

    Node rotateLeft(Node p) {
        if (p == null || p.right == null) {
            return (p);
        }
        Node q = p.right;
        p.right = q.left;
        q.left = p;
        return q;
    }
}
