package Gun34._04_Protected._Paket2;

import Gun34._04_Protected._Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad, int yas, String cinsi) {
        super.ad=ad;//public
        super.cinsi=cinsi;//protected
        //defaulttan farklı olarak
        //extend edildiğinde diğer paketlerdende erişilebilir.

    }
}
