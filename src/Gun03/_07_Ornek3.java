package Gun03;

public class _07_Ornek3 {
    public static void main(String[] args) {

        // kişinin kilosunu ve boyunu kendiz veriniz.
        //ekrana kilonuz : ..... ve boyunuz .... yazdıktan sonra
        //vucut kitle indeksini bulunuz. kilo/(boy*boy)

        double kilo=65.4;
        int boy =165;

        double kitleIndex= kilo/(boy*boy);

        System.out.println("kilonuz : " +kilo+"kg " + "ve boyunuz " + boy+ "cm");
        System.out.println("kitle index : " +kitleIndex);
        System.out.println("arkadaş durumun normal ama üzüm yemeye devam");
    }
}
