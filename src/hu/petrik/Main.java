package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Bosszuallo b1 = new Bosszuallo(400, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }
        };
        Bosszuallo b2 = new Bosszuallo(200, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }
        };
        System.out.println(b1.legyoziE(b2) + "");
        System.out.println(b2.legyoziE(b1) + "");

        System.out.println(b1);
        System.out.println(b2);

        Vasember v1 = new Vasember();

        for (int i = 0; i < 1000; i++){
            v1.kutyutKeszit();
        }
        System.out.println(v1);
        System.out.println(v1.megmentiAVilagot());

        Batman bm1 = new Batman();
        System.out.println(bm1);
        System.out.println(b1.legyoziE(bm1));
    }
}