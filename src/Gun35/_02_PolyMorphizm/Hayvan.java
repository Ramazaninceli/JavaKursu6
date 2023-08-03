package Gun35._02_PolyMorphizm;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        this.name = name;
    }

    public void ses(){
        System.out.println("ses ver");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
