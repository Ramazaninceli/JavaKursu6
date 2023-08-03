package TekrarDersler;

public class _07_Soru {
    public static void main(String[] args) {

        //Soru 3 ders 5 öğrenci içinnotları kullanıcıdan
        //aldıktan sonra bir metodda ortalamayı yazdırınız.
        //diğer bir metodda ortalamayı geçen sayısı

        int[][] notlar=new int[3][5];// 3 satır 5 sutundan oluşan 15 değer var.

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.println("notlar = " + notlar[i][j]);

            }

        }

    }
    public static void ortalamaYaz(int[][] notlar){
        double toplam=0;
        int sayac=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <5 ; j++) {
                toplam=toplam+notlar[i][j];
                sayac++;
            }


            }
        double ort=toplam/(notlar.length*notlar[0].length);
    System.out.println("notlar = " + ort);
}


}