package hu.petrik;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg * 2;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        boolean legyozi = false;
        if (szuperhos.mekkoraAzEreje() < this.lelemenyesseg){
            legyozi = true;
        }
        return legyozi;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return String.format("Batman, Leleményesség: %f", this.lelemenyesseg);
    }
}
