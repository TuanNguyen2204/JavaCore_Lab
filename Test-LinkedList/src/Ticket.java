public class Ticket {
    String path;
    int price;
    
    public Ticket() {
    }

    public Ticket(String xPath, int xPrice) {
        path = xPath;
        price = xPrice;
    }

    @Override
    public String toString() {
        return ("(" + path + ", " + price + ") ");
    }
     
    
}
