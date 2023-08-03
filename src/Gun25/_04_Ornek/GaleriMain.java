package Gun25._04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class GaleriMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<ArabaKayit> galeri=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            
            ArabaKayit a=new ArabaKayit();

            System.out.print("Araba No giriniz = ");
            a.arabaNo=okuInt.nextInt();

            System.out.print("Araba Markası giriniz = ");
            a.marka=okuStr.nextLine();

            System.out.print("Araba üretimyılı giriniz = ");
            a.uretimYili=okuInt.nextInt();
           
            galeri.add(a);
            
        }

        arabalarYazdir(galeri);
        uretimOrtalamasiYazdir(galeri);

        }

        public static void arabalarYazdir( ArrayList<ArabaKayit>galeri){

        for (ArabaKayit a:galeri){
            System.out.println("a.arabaNo+a.marka+a.uretimYili = " + a.arabaNo+" "+a.marka+" "+a.uretimYili);
        }

        }
        public static void uretimOrtalamasiYazdir(ArrayList<ArabaKayit> galeri){

        int toplamYil=0;
            for (ArabaKayit a:galeri)
                  toplamYil=toplamYil+a.uretimYili;

            int ort=toplamYil/ galeri.size();
            System.out.println("ort = " + ort);

            }
        }
        

