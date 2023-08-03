package Gun34._04_Protected._Paket1;

public class P1Hayvan {
    public String ad; //her yerden, bütün paketlerden ulaşılabilir.
    int yas; // default  , sadece bulunduğu paketten ulaşılabilir
    protected String cinsi;// default gibi , sadece bulunduğu paketten ulaşılabilir ancak ınheritance yapılınca başka paketlerdende ulaşılabilir.
    private String renk;// sadece kendi bulunduğu class tan ulaşılabilir.
}
