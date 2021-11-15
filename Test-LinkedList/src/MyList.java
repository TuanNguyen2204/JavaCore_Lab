
public class MyList {
    Node head, tail;

    MyList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }
    
     void addEnd(String xPath, int xPrice){
        if(xPath.equalsIgnoreCase("HN") || xPrice < 230){
            return;
        }
        addLast(xPath, xPrice);
    }
    
     void addLast(String xPath, int xPrice){
        Node p = new Node(new Ticket(xPath, xPrice));
        //ds rong
        if(isEmpty()){
            head = tail = p;
            return;
        }
        //ds da co phan tu
        tail.next = p;
        tail = p;
    }
     
    void addLastMany(String[] paths,int[] prices){
        for(int i=0; i<paths.length; i++){
            addLast(paths[i], prices[i]);
        }
    }
     void visit(Node p) {
        if (p != null) {
            System.out.print(p.info);
        }
        
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            visit(p);
            p = p.next;
        }
        System.out.println();
    }
    
    Node searchByPath(String xPath){
        Node p = head;
        while (p != null) {
            if (p.info.path.equals(xPath)) {
                return (p);
            }
            p = p.next;
        }
        return (null);
    }
    
    void insertAfter(Ticket x, int xPrice){
        
    }
    void removeFirst() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        //dslk co 1 ptu va da bij xoa
        if (head == null) {
            tail = null;
        }
    }
    Node cheapestPrice() {
        if (isEmpty()) {
            return null;
        }
        Node p, q; //q danh dau
        p = q = head;
        int minPrice = p.info.price;
        while (p != null) {
            if (p.info.price<minPrice) {
                q=p;
                minPrice = p.info.price;
            }
            p=p.next;
        }
        return (q);
    }
    void remove(Node q){
        if (q == null) {
            return;
        }
        //neu q o dau
        if (q == head) {
            removeFirst();
            return;
        }
        //tim phan tu trc q
        Node p = head;
        while (p != null && p.next != q) {
            p = p.next;
        }
        //khong tim thay p=null
        if (p == null) {
            return;
        }
        //tim thay p la node trc cua q
        //tim node sau q
        Node q1 = q.next;
        //noi trc voi sau
        p.next = q1;
        //q la cuoi p.next=null
        if (p.next == null) {
            tail = p;
        }
    }
}
