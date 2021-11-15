package BTVN;

public class BT27 {

    public static void main(String[] args) {
        int trau, co, dung, nam, gia;
        for (dung = 1; dung <= 100; dung++) {
            for (nam = 1; nam <= 100; nam++) {
                for (gia = 1; gia <= 100; gia++) {
                    trau = dung + nam + gia;
                    co = 15 * dung + 9 * nam + gia;
                    if ((co == 300) & (trau == 100)) {
                        System.out.println("Trau dung: " + dung);
                        System.out.println("Trau nam: " + nam);
                        System.out.println("Trau gia: " + gia);
                        System.out.println("--------------------");
                    }
                }
            }
        }
    }

}
