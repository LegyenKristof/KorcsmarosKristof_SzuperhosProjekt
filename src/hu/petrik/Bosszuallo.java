package hu.petrik;

public abstract class Bosszuallo implements Szuperhos{
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        boolean legyozi = false;
        if (szuperhos instanceof Bosszuallo && ((Bosszuallo) szuperhos).isVanEGyengesege() && this.szuperero > szuperhos.mekkoraAzEreje()){
            legyozi = true;
        }
        if (szuperhos instanceof Batman && this.szuperero >= szuperhos.mekkoraAzEreje() * 2){
            legyozi = true;
        }
        return legyozi;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        String vane = "nincs";
        if (this.vanEGyengesege) vane = "van";
        return String.format("Szupererő: %f, %s gyengesége", this.szuperero, vane);
    }
}
