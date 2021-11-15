public class Node {

    Ticket info;
    Node next;

    Node() {
    }

    Node(Ticket x, Node p) {
        info = x;
        next = p;
    }

    Node(Ticket x) {
        this(x, null);
    }
}
