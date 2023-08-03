package Gun35.Method;

public class Araclar {
    private  String model;

    public Araclar(String model) {
        this.model = model;
    }
    public final void setKilometre(){
        System.out.println("gösterge set edildi");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}
