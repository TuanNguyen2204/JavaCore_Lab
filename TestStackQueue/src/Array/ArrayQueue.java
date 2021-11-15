package Array;

public class ArrayQueue {

    Object[] a;
    int max;
    int first, last;

    public ArrayQueue(int max1) {
        max = max1;
        a = new Object[max];
        first = last = -1;
    }

    public ArrayQueue() {
        this(10);
    }

    boolean isEmpty() {
        return (first == -1);
    }

    boolean isFull() {
        return ((first == 0 && last == max - 1) || first == last + 1);//noi vong
    }

    private boolean grow() {
        int i, j;
        int max1 = max + max / 2;
        Object[] a1 = new Object[max1];
        if (a1 == null) {
            return false;
        }
        if (last >= first) {
            for (i = first; i <= last; i++) {
                a1[i - first] = a[i];
            }
        } else {
            for (i = first; i <= last; i++) {
                a1[i - first] = a[i];
            }
            for (j = 0; j <= last; j++) {
                a1[i + j] = a[j];
            }
        }
        a = a1;
        max = max1;
        int count;
        if (first <= last) {
            count = last - first + 1;
        } else {
            count = max - first + last;
        }
        first = 0;
        last = count + 1;
        return (true);
    }

    void enqueue(Object x) {
        if (isFull() && !grow()) {
            return;
        }
        if (last == max - 1 || last == -1) {
            a[0] = x;
            last = 0;
            if (first == -1) {
                first = 0;
            }
        } else {
            a[++last] = x;
        }
    }

    Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return (a[first]);
    }

    Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Object x = a[first];
        if (first == last) { //only one element
            first = last = -1;
        } else if (first == max - 1) {
            first = 0;
        } else {
            first++;
        }
        return (x);
    }

    void displayAll() {
        int i, j;
        if (first <= last) {
            for (i = first; i < max; i++) {
                System.out.println(a[i] + " ");
            }
        } else {
            for (i = first; i < max; i++) {
                System.out.println(a[i] + " ");
            }
            for (i = 0; i <= last; i++) {
                System.out.println(a[i] + " ");
            }
        }
        System.out.println();
    }

    //Dequeue 1 phan tu
    
    //checkEmpty
    //CheckFull
    //check x co ton tai trong queue
    //dequeue phan tu x
//    public Object dequeueAny(int index) throws Exception {
//        //checkEmpty
//        if (isEmpty()) {
//            throw new Exception();
//        }
//        int i;
//        if (first <= last) {
//            for (i = first; i < max; i++) {
//                if (index == i) {
//                    dequeue();
//                }
//            }
//        }
//    }
}
