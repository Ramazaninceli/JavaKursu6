package Gun38._02_AbstractClass;

public class Dikdortgen extends Sekil{
    private  double kisaKenar;
    public double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        super();
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    double Alan() {
        return this.kisaKenar*this.uzunKenar;
    }

    @Override
    double Cevre() {
        return 2*(this.kisaKenar+this.uzunKenar);
    }
}
