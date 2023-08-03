package Gun28._05_Ornek;

public class ElektrikHesabı {
    int toplamTuketim=0;//2. adım
    double birimFiyat=20;

    //5. adım

public void tuketimEkle(int tuketim){

    toplamTuketim=toplamTuketim+tuketim;
}

public void faturaYaz(){

    double tuketimTl=toplamTuketim*birimFiyat;

    System.out.println("************");
    System.out.println("   Faturanız");
    System.out.println("*************");
    System.out.println("Toplam Tüketim=" +toplamTuketim+" kW");
    System.out.println("Toplam tutar= = " + tuketimTl+" TL");
    System.out.println("*************");
}
}
