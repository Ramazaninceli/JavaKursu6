package Gun28._03_Ornek;

public class Kitapci {
    public static void main(String[] args) {

        Gun28._03_Ornek.Book ki1=new Gun28._03_Ornek.Book();
        ki1.name="Harry Potter";
        ki1.publishYear=1997;
        ki1.author="jk rowlin";
        System.out.println("ki1 = " + ki1.toString());

       Gun28._03_Ornek.Book ki2=new Gun28._03_Ornek.Book( "yuzuklerin efendisi",1957,"jrr tokien");
        Book ki3=new Book("üzüm ve çay",2023);

        System.out.println("ki1 = " + ki1);
        System.out.println("ki2 = " + ki2);
        System.out.println("ki3 = " + ki3);
    }
}
