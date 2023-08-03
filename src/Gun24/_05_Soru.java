package Gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) throws InterruptedException {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisini alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        int secim=0;
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        Map<String, String> sozluk=new TreeMap<>();    //kelime , manası
        do {
            System.out.println("\nMENU:\n1-Ekleme\n2-Düzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Çıkış ");// menüyü listele
            System.out.print("Menüden seçim yapınız(1-6) :");//menüden se
            secim=okuInt.nextInt();

            switch (secim){
                case 1 :
                    System.out.print("Kelime giriniz : ");
                    String kelime=okuStr.nextLine();
                    System.out.print("Anlamını giriniz : ");
                    String anlamı=okuStr.nextLine();
                    sozluk.put(kelime,anlamı);
                    ;break;
                case 2 :
                    System.out.print("Düzeltilecek kelimeyi giriniz: ");
                    kelime=okuStr.nextLine();
                    System.out.println("Anlamı");
                    anlamı=okuStr.nextLine();
                    sozluk.put(kelime,anlamı);

                    break;
                case 3 :
                    System.out.println("Sözlükteki kelimeleri Listele: ");
                    for (Map.Entry<String, String> k: sozluk.entrySet())
                        System.out.print(k.getKey()+" "+k.getValue()+"\n");
                        break;
                case 4 :
                    System.out.print("Aranacak Kelimeyi Giriniz: ");
                    kelime=okuStr.nextLine();
                    System.out.println("anlamı: "+sozluk.get(kelime));
                    break;

                case 5 :
                System.out.print("Silinecek Kelimeyi Giriniz: ");
                kelime=okuStr.nextLine();
               sozluk.remove(kelime);
                break;
                case 6:
                    System.out.println("Çıkış");
                default:

            }

           
        }while (secim<=6);//

        System.out.println("Hatalı giriş yaptınız.");





    }



}
