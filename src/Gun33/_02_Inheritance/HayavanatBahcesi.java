package Gun33._02_Inheritance;

public class HayavanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi1 =new Kedi("siyah",3,"tekir");
        System.out.println("kedi1 = " + kedi1);
        kedi1.konustu();

        System.out.println();

        Kopek kopek1=new Kopek("beyaz",10,"kangal");
        System.out.println("kopek1 = " + kopek1);
        kopek1.konustu();

        System.out.println();

        Yilanlar yilan1 =new Yilanlar("Siyah", 3,"Engerek",3);
        System.out.println("yilan1 = " + yilan1);
        yilan1.konustu();

        System.out.println();

        Ordek ordek1=new Ordek("yeşil",2,"Kanatlı",10 );
        System.out.println("ordek1 = " + ordek1);
       ordek1.konustu();



    }
}
