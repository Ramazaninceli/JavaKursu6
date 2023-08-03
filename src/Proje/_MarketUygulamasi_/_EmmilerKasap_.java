package Proje._MarketUygulamasi_;

import java.util.*;

public class _EmmilerKasap_ {
    public static void main(String[] args) {
        Map<String, Double> DanaUrunFiyat = new HashMap<>();
        DanaKirmiziDoldur(DanaUrunFiyat);
        Map<String, Double> KuzuUrunFiyat = new HashMap<>();
        KuzuKirmiziDoldur(KuzuUrunFiyat);
        Map<String, Double> BeyazUrunFiyat = new HashMap<>();
        BeyazEtDoldur(BeyazUrunFiyat);
        List<Double>Fiyatlar=new ArrayList<>();
        List<String>Urunler=new ArrayList<>();
        List<Double>Miktarlar=new ArrayList<>();


        Scanner Consol=new Scanner(System.in);
        int Secim;
        System.out.println("==GÜVEN KASAP UYGULAMASINA HOŞGELDİNİZ==");
        do {
            System.out.println("**************************************");
            System.out.println("===MENÜ===");
            System.out.println("(1) Dana Et");
            System.out.println("(2) Kuzu Et");
            System.out.println("(3) Beyaz Et");
            System.out.println("(4) Siparişlerim");
            System.out.println("(5) Ürün Sil");
            System.out.println("(6) Ödeme");
            System.out.println("(7) Bonus Puan Al");
            System.out.println("(8) Çıkış");
            System.out.println();
            System.out.print("1 ila 8 arası Seçim yapınız: ");
            Secim= Consol.nextInt();
            Consol.nextLine();
            switch (Secim){
                case 1:MenuDanaEt(DanaUrunFiyat,Consol,Fiyatlar,Miktarlar,Urunler);break;
                case 2:MenuKuzuEt(KuzuUrunFiyat,Consol,Fiyatlar,Miktarlar,Urunler);break;
                case 3:MenuBeyazEt(BeyazUrunFiyat,Consol,Fiyatlar,Miktarlar,Urunler);break;
                case 4:Siparis(Urunler,Fiyatlar,Miktarlar);break;
                case 5:UrunSil(Urunler,Fiyatlar,Miktarlar,Consol);break;
                case 6:Odeme(Fiyatlar);break;
                case 7:Bonus(Fiyatlar);break;
                case 8: System.out.println("Program Kapatılıyor...");break;
                default:System.out.print("Hatalı Seçim, Tekrar Deneyiniz: ");break;
            }
        }while (Secim!=8);

    }
    public static void DanaKirmiziDoldur(Map<String, Double> danaKirmizi) {
        danaKirmizi.put("Dana Antrikot", 429.90);
        danaKirmizi.put("Dana Biftek", 379.90);
        danaKirmizi.put("Dana Bonfile", 645.90);
        danaKirmizi.put("Dana Kontrafile", 439.90);
        danaKirmizi.put("Dana Pirzola", 457.90);
        danaKirmizi.put("Dana Nuar", 408.90);
        danaKirmizi.put("Dana Döş", 349.90);
        danaKirmizi.put("Dana Tranç", 419.90);
        danaKirmizi.put("Dana Kuşbaşı", 339.90);
        danaKirmizi.put("Dana Pöçük", 193.65);
        danaKirmizi.put("Dana Kıyma", 299.90);
        danaKirmizi.put("Dana Antrikot Pastırma", 670.00);
        danaKirmizi.put("Dana Sucuk", 485.00);

    }
    public static void KuzuKirmiziDoldur(Map<String, Double> kuzuKirmizi){
        kuzuKirmizi.put("Kuzu Gerdan",199.90);
        kuzuKirmizi.put("Kuzu İncik",285.90);
        kuzuKirmizi.put("Kuzu Pirzola",422.90);
        kuzuKirmizi.put("Kuzu Kuşbaşı",349.90);
        kuzuKirmizi.put("Kuzu Kaburga",195.50);
        kuzuKirmizi.put("Kuzu Fileto",259.90);
        kuzuKirmizi.put("Kuzu Kıyma",219.90);
    }
    public static void BeyazEtDoldur(Map<String, Double> BeyazEt){
        BeyazEt.put("Piliç Pirzola",114.90);
        BeyazEt.put("Piliç Izgara",199.90);
        BeyazEt.put("Piliç Baget",77.90);
        BeyazEt.put("Piliç Kanat",65.90);
        BeyazEt.put("Piliç İncik",67.90);
        BeyazEt.put("Piliç Kelebek",90.50);
        BeyazEt.put("Hindi Göğüs",119.90);
    }
    public static void MenuDanaEt(Map<String, Double> danaKirmizi , Scanner Consol,List<Double>Fiyatlar,List<Double>Miktarlar,List<String>Urunler){
        DanaKirmiziDoldur(danaKirmizi);
        for (Map.Entry<String, Double> entry : danaKirmizi.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + ": " + value+" ₺");
        }
        boolean devamMi=true;
        do {
            System.out.print("Seçmek istediğiniz ürün: ");
            String Urun=Consol.nextLine();
            boolean esitMi=Urun.equalsIgnoreCase("");
            if (!esitMi){
                System.out.print("Kaç kg almak iştiyorsunuz?: ");
                double kacKg=Consol.nextDouble();
                Consol.nextLine();
                System.out.println("Ürününüz seçildi...");
                Fiyatlar.add(danaKirmizi.get(Urun)*kacKg);
                Urunler.add(Urun);
                Miktarlar.add(kacKg);
                System.out.print("Bu menüyle devam etmek ister misiniz?(E/H): ");
                String Cevap=Consol.nextLine();
                if (Cevap.equalsIgnoreCase("H")) {
                    devamMi = false;
                }
            }else{
                System.out.print("Seçim Yapmadınız, Bu menüyle devam etmek ister misiniz?(E/H): ");
                String Cevap=Consol.nextLine();
                if (Cevap.equalsIgnoreCase("H"))
                    devamMi=false;
            }
        }while (devamMi);
    }
    public static void MenuKuzuEt(Map<String, Double> kuzuKirmizi , Scanner Consol,List<Double>Fiyatlar,List<Double>Miktarlar,List<String>Urunler){
        KuzuKirmiziDoldur(kuzuKirmizi);
        for (Map.Entry<String, Double> entry : kuzuKirmizi.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + ": " + value + " ₺");
        }
        boolean devamMi=true;
        do {
            System.out.print("Seçmek istediğiniz ürün: ");
            String Urun=Consol.nextLine();
            boolean esitMi=Urun.equalsIgnoreCase("");
            if (!esitMi){
                System.out.print("Kaç kg almak iştiyorsunuz?: ");
                double kacKg=Consol.nextDouble();
                Consol.nextLine();
                System.out.println("Ürününüz seçildi...");
                Fiyatlar.add(kuzuKirmizi.get(Urun)*kacKg);
                Urunler.add(Urun);
                Miktarlar.add(kacKg);
                System.out.print("Bu menüyle devam etmek ister misiniz?(E/H): ");
                String Cevap=Consol.nextLine();
                if (Cevap.equalsIgnoreCase("H")) {
                    devamMi = false;
                }
            }else{
                System.out.print("Seçim Yapmadınız, Bu menüyle devam etmek ister misiniz?(E/H): ");
                String Cevap=Consol.nextLine();
                if (Cevap.equalsIgnoreCase("H"))
                    devamMi=false;
            }
        }while (devamMi);
    }
    public static void MenuBeyazEt(Map<String, Double> BeyazEt , Scanner Consol,List<Double>Fiyatlar,List<Double>Miktarlar,List<String>Urunler){
        BeyazEtDoldur(BeyazEt);
        for (Map.Entry<String, Double> entry : BeyazEt.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + ": " + value + " ₺");
        }
        boolean devamMi=true;
        do {
            System.out.print("Seçmek istediğiniz ürün: ");
            String Urun=Consol.nextLine();
            boolean esitMi=Urun.equalsIgnoreCase("");
            if (!esitMi){
                System.out.print("Kaç kg almak iştiyorsunuz?: ");
                double kacKg=Consol.nextDouble();
                Consol.nextLine();
                System.out.println("Ürününüz seçildi...");
                Fiyatlar.add(BeyazEt.get(Urun)*kacKg);
                Urunler.add(Urun);
                Miktarlar.add(kacKg);
                System.out.print("Bu menüyle devam etmek ister misiniz?(E/H): ");
                String Cevap=Consol.nextLine();
                if (Cevap.equalsIgnoreCase("H")) {
                    devamMi = false;
                }
            }else{
                System.out.print("Seçim Yapmadınız, Bu menüyle devam etmek ister misiniz?(E/H): ");
                String Cevap=Consol.nextLine();
                if (Cevap.equalsIgnoreCase("H"))
                    devamMi=false;
            }
        }while (devamMi);
    }
    public static void Siparis(List<String>Urunler,List<Double>Fiyatlar,List<Double>Miktarlar){
        System.out.println("==SİPARİŞLERİNİZ==");
        System.out.println("****************************************************");
        for (int i = 0; i < Urunler.size(); i++) {
            String urunAdi=Urunler.get(i);
            double Fiyat=Fiyatlar.get(i);
            double Miktar=Miktarlar.get(i);
            System.out.println(Miktar+" kg "+" - "+urunAdi+" - "+Fiyat+" ₺");
        }
        System.out.println("***************************************************");
    }
    public static void Odeme(List<Double>Fiyatlar){
        double ToplamTutar=0.0;
        for (double Fiyat:Fiyatlar) {
            ToplamTutar += Fiyat;
        }
        System.out.println("*********************************************");
        System.out.println("Ödenecek Tutar: "+ToplamTutar+" ₺");
        System.out.println("*********************************************");
    }
    public static void Bonus(List<Double>Fiyatlar){
        double ToplamTutar=0.0;
        int Max=9999999;
        int Min=5555555;
        int BonusKod=(int) (Math.random()*(Max-Min)+Min);
        for (double Fiyat:Fiyatlar) {
            ToplamTutar += Fiyat;
        }
        double Discount=ToplamTutar*0.075;
        System.out.println("************************************************");
        System.out.println("BİZİ TERCİH ETTİĞİNİZ İÇİN TEŞEKKÜR EDERİZ!");
        System.out.println();
        System.out.println("Bir sonraki alışverişiniz için"+" , "+Discount+" ₺ "+" indirim kazandınız.");
        System.out.println();
        System.out.println("İndirim Kodunuz: "+BonusKod);
        System.out.println("**************************************************");

    }
    public static void UrunSil (List<String> Urunler, List<Double> Miktarlar, List<Double> Fiyatlar,Scanner Consol){
        Boolean devamMi = true;
        do {
            System.out.print("Sepetten kaldırmak istediğiniz ürün var mı? (E/H): ");
            String cevap = Consol.nextLine();

            Boolean esitMi = cevap.equalsIgnoreCase("H");

            if (!esitMi) {
                devamMi = true;

            }    else {
                devamMi = false;
                System.out.print("Sepetinizde herhangi bir değişiklik yapılmadı");
                System.out.println();
            }



            if (!esitMi)
            {
                System.out.print("Kaldırmak istediğiniz ürün adı = ");
                String urun = Consol.nextLine();


                int indexOfUrunler = Urunler.indexOf(urun);

                Urunler.remove(indexOfUrunler);
                Miktarlar.remove(indexOfUrunler);
                Fiyatlar.remove(indexOfUrunler);

                System.out.println();
                System.out.println("Sepetinizden ** "+urun+" ** adlı ürün kaldırılmıştır.");
                System.out.println();

                System.out.print("Sepetten kaldırmak istediğiniz başka ürün var mı? (E/H): ");
                String cevap2 = Consol.nextLine();
                if (cevap2.equalsIgnoreCase("h")){
                    devamMi = false;
                    System.out.println();
                    System.out.println("               --SEPETİNİZ GÜNCELLENDİ--"+"\n"
                            +"Menüden sepetinizin güncel halini kontrol edebilirsiniz.");
                }    else
                    devamMi = true;


            }
        }while (devamMi);

    }
}
