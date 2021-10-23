package hu.petrik;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        this.setSzuperero(this.getSzuperero() + Math.random() * 10);
    }

    @Override
    public boolean megmentiAVilagot() {
        boolean megmentiE = false;
        if (this.getSzuperero() > 1000){
            megmentiE = true;
        }
        return megmentiE;
    }

    @Override
    public String toString() {
        return String.format("Vasember, " + super.toString());
    }
}
