package Gun35._02_PolyMorphizm;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabaş");
//        kopek1.ses();// havladı
//        kopek1.kokladi();//kokladı

        Kedi kedi1 =new Kedi("tekir");
//        kedi1.ses();
//        kedi1.tirmaladi();

//        kopekSesi(kopek1);//havladı
//        kediSesi(kedi1);//miyavladı

        hayvanSesi(kedi1);
        hayvanSesi(kopek1);

        // Setlerden HashSet
        //Maplarden HashMap
        //Listlerden ArrayList

        //Hayvanlardan Kedi
        //Hayvanlardan Kopek
        //Hayvanlardan hayvan

        //Referansın Tipi // NESNE nin tipi
        Hayvan hayvan1= new Hayvan("Ördek"); //hayvanlardan bir hayvan
        Hayvan hayvan2= new Kopek("kangal"); //hayvanlardan bir hayvan
        Hayvan hayvan3= new Kedi("boncuk"); //hayvanlardan bir hayvan

        System.out.println("..............................");
        hayvan1.ses();//ses çıkardı
        hayvan2.ses();// havladı
        hayvan3.ses();// miyavladı
        System.out.println("..............................");

        ((Kopek)hayvan2).kokladi();










//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.



    }
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();// ses çıkardı mı , havladı mı

        //bir classın aslında kim olduğunu bulma yöntemi
        if (hayvan instanceof Kopek) // hayvan aslında köpek ise
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi)//hayvan aslında kedi ise
            ((Kedi)hayvan).tirmaladi();
    }

    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }

}
