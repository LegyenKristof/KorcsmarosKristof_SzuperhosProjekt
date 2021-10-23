package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Bosszuallo b1 = new Bosszuallo(100, true) {
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
    }
}