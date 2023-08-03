package Gun38._02_AbstractClass;

public abstract class Sekil {

    private String name;


    abstract double Alan();


    abstract  double Cevre();
    public  void Ciz(){
        System.out.println(name+"sekil çizildi");

    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Sekil{" +
                "\nname= " + name + '\'' +
                ",\nAlan=" + Alan() +
                ",\nÇevre=" + Cevre() +
                               '}';
    }
}

