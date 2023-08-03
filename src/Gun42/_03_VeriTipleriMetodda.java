package Gun42;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {

        //ilkel tip
        int sayi=5;
        sayiArttir(sayi);//Sadece değeri gitti, kendisi değil
        System.out.println("sayi = " + sayi);

        sayi=sayiArttir2(sayi);
        System.out.println("sayi = " + sayi);

        //Referans Tiplerde(new)
        int[] dizi=new int[]{1,2,3,4};
        dizisifirla(dizi);// giden referansı ise 0000, değilse 1234

        //Nesne tipler
        String kelime="ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);// ismet

    }
    public static void kelimeSifirla(String kelime){
        kelime="";
    }

    public static void dizisifirla(int[] dizi){
        //gelen referansı ise 0000, değilse 1234
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
        dizi[3]=0;
    }

    public static void sayiArttir(int sayi){

        sayi++;
    }

    public static int sayiArttir2(int sayi){

        sayi++;
        return sayi;
    }
}
