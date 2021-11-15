package BTVN;

public class BT21 {

    int n;

    public BT21(int n) {
        this.n = n;
    }

    static boolean check(int n) {
        int i;
        int sum = 0;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

    static void display() {
        int i;
        for (i = 1; i < 1000; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        BT21.display();
    }
}
