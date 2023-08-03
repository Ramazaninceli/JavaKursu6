package Gun37._01_Soru;

public class Bus extends Vehicle implements IDeisel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDeisel() {
        return "Bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "en fazla 90 km hız yapabilir.";
    }
}
