package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {

        //String olarak verlen 3 notun ("82", "95","56") ortalamasını bulunuz.

        String not1="82";// rakam görünümlü yazılar
        String not2="95";// rakam görünümlü yazılar
        String not3="56";// rakam görünümlü yazılar.

        double dnot1= Double.parseDouble(not1); // 82 rakam haline geldi ondalıklı olarak
        double dnot2= Double.parseDouble(not2); // 95 rakam haline geldi ondalıklı olarak
        double dnot3= Double.parseDouble(not3); //  56 rakam haline geldi ondalıklı olarak

        double ortalama= (dnot1+dnot2+dnot3)/3;

        System.out.println("ortalama = " + ortalama);





                  }
}
