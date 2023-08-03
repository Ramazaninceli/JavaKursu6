package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1=45;
        int s2=5;
        int s3=15;
        int s4=17;
        int s5=25;

        int sonuc1= toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);
        int sonuc3=toplamBul(s1,s2,s3,s4);
        int sonuc4=toplamBul(s1,s2,s3,s4,s5);

    }

    public static int toplamBul(int...dizi){// dizi oluyor istediğin kadar parametre ekleyebiliriz

        int toplam=0;
        for (int i = 0; i < dizi.length ; i++)
            toplam=toplam+dizi[i];

            return toplam;

        }



}
