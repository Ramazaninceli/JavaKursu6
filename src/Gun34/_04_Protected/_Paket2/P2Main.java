package Gun34._04_Protected._Paket2;

import Gun34._04_Protected._Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="Karakedi";
        //yas default
        //cinsi protected

        P2Kedi p2k =new P2Kedi("",5,"kefir");
    }
}
