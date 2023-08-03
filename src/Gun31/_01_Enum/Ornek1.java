package Gun31._01_Enum;

// Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

//enum Aylar{
//    Tanimsiz,
//    OCAK, ŞUBAT, MART, NİSAN,MAYIS, HAZIRAN,
//    TEMMUZ, AGUSTOS, EYLÜL, EKIM, KASIM, ARALIK
//}

public class Ornek1 {

    // Classın içinde de enum tanımlanabilir., ancak METOD ların içinde tanımlanamaz


    // enumaration : numaralandırılmış simgeler
    public static void main(String[] args) {

        Aylar ay=Aylar.AGUSTOS;

        switch (ay){

            case ŞUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case NİSAN:
            case MAYIS:
            case HAZIRAN:
            case TEMMUZ:
            case AGUSTOS:
            case EYLÜL:
            case EKIM:
            case KASIM:
            case ARALIK:System.out.println(31); break;
        }

        if (ay== Aylar.AGUSTOS)
            System.out.println("Zam ayı");

        System.out.println("ay = " + ay);// to stirng simge AGUSTOS
        System.out.println("ay.name() = " + ay.name());
        System.out.println(ay.name()+" - "+ay.ordinal());

        for (Aylar a:Aylar.values()) {
            System.out.println( a.name()+"- " +a.ordinal());

        }

    }
}
