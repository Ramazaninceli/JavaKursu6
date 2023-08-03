package Proje.Tic_Tac_Toe.Tic_Tac_Toe_1;

import java.util.Scanner;

public class XOX {
    private final char[][] OyunTahtasi;
    private char MevcutOyuncu;
    private boolean OyunDevam;

    public XOX() {
        OyunTahtasi = new char[3][3];
        MevcutOyuncu = 'X';
        OyunDevam = true;
        TahtaDoldur();
    }

    public void TahtaDoldur() { //OYUN TAHTASININ DOLDURULMASI
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                OyunTahtasi[i][j] = '*';
            }
        }
    }

    public void TekMiCiftMi() { //OYUNA KİM BAŞLAYACAK?
        System.out.println("Tek mi?, Çift mi? başlıyor!");
        System.out.println();
        Scanner Consol = new Scanner(System.in);
        System.out.print("Tek mi?, Çift mi? (T/Ç): ");
        String TC = Consol.nextLine();
        int Talih = (int) (Math.random() * 11) + 11;
        System.out.println("Rasgele: " + Talih);
        if (Talih % 2 == 1 && TC.equalsIgnoreCase("T")) {
            System.out.println("Rasgele sayı tek," + " " + "X" + " " + "oyuncusu başlıyor!");
            MevcutOyuncu = 'X';
        } else if (Talih % 2 == 0 && TC.equalsIgnoreCase("Ç")) {
            System.out.println("Rasgele sayı çift," + " " + "X" + " " + "oyuncusu başlıyor!");
            MevcutOyuncu = 'X';
        } else {
            System.out.println("Bilemediniz," + " " + "O" + " " + "oyuncusu başlıyor!");
            MevcutOyuncu = 'O';
        }
    }

    public void TahtaYazdir() { //OYUN TAHTASININ MEVCUT DURUMUNU YAZDIRMA
        System.out.println("--------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(OyunTahtasi[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public void HamleYap() { //OYUNCULARIN HAMLELERİNİ YAPMASI
        boolean devam1 = true;
        do {
            Scanner console = new Scanner(System.in);
            System.out.println("Sıra " + MevcutOyuncu + " oyuncusunda.");
            System.out.print("Satır Koordinat: ");
            int satir = console.nextInt();
            if (satir >= 0 && satir < 3) {
                boolean devam2 = true;
                do {
                    System.out.print("Sütun Koordinat: ");
                    int sutun = console.nextInt();
                    if (sutun >= 0 && sutun < 3) {
                        if (OyunTahtasi[satir][sutun] == '*') {
                            OyunTahtasi[satir][sutun] = MevcutOyuncu;
                            devam1 = false;
                            devam2 = false;
                            if (MevcutOyuncu == 'X') {
                                System.out.println("X oyuncusu hamle yaptı!");
                                MevcutOyuncu = 'O';
                            } else {
                                System.out.println("O oyuncusu hamle yaptı!");
                                MevcutOyuncu = 'X';
                            }
                        } else {
                            System.out.println("Bu kordinat dolu. Lütfen başka bir kordinat seçin");
                            devam2=false;
                        }
                    } else {
                        System.out.println("Hatalı değer. Sütun koordinatı 0-2 arasında olmalıdır");
                    }
                } while (devam2);
            } else {
                System.out.println("Hatalı değer. Satır koordinatı 0-2 arasında olmalıdır");
            }
        } while (devam1);
    }

    public boolean TahtaKontrol() { //OYUN TAHTASININ KONTOL EDİLMESİ
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (OyunTahtasi[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public void TahtaSifirla() { //TAHTANIN BAŞLANGIÇ DURUMUNA GETİRİLMESİ
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                OyunTahtasi[i][j] = '*';
            }
        }
    }

    public boolean KazananKontrol(char MevcutOyuncu) { //OYUNUN KAZANANININ KONTROL EDİLMESİ
        for (int i = 0; i < 3; i++) {
            if ((OyunTahtasi[i][0] == MevcutOyuncu && OyunTahtasi[i][1] == MevcutOyuncu &&
                    OyunTahtasi[i][2] == MevcutOyuncu) || (OyunTahtasi[0][i] == MevcutOyuncu &&
                    OyunTahtasi[1][i] == MevcutOyuncu && OyunTahtasi[2][i] == MevcutOyuncu)) {
                return true;
            }
        }
        return (OyunTahtasi[0][0] == MevcutOyuncu && OyunTahtasi[1][1] == MevcutOyuncu &&
                OyunTahtasi[2][2] == MevcutOyuncu) || (OyunTahtasi[0][2] == MevcutOyuncu &&
                OyunTahtasi[1][1] == MevcutOyuncu && OyunTahtasi[2][0] == MevcutOyuncu);
    }

    public void OyunKontrol() { //OYUNU DURUMUNUN (KONTROL EDİLMESİ KAZANAN VE BERABERLİK DURUMU)
        if (KazananKontrol('X')) {
            System.out.println("Oyun Bitti, Kazanan: X");
            TahtaYazdir();
            OyunDevam = false;
        } else if (KazananKontrol('O')) {
            System.out.println("Oyun Bitti, Kazanan: O");
            TahtaYazdir();
            OyunDevam = false;
        } else if (TahtaKontrol()) {
            System.out.println("Oyun Berabere Sonuçlandı!");
            TahtaYazdir();
            OyunDevam = false;
        }
    }

    public void OyunBaslat() { //OYUNUN BAŞLATILMASI
        Scanner Consol = new Scanner(System.in);
        System.out.println("XOX Başlatılıyor!");
        System.out.println();
        TekMiCiftMi();
        TahtaSifirla();
        do {
            TahtaYazdir();
            HamleYap();
            KazananKontrol(MevcutOyuncu);
            TahtaKontrol();
            OyunKontrol();
            if (!OyunDevam) {
                System.out.print("Yeniden Oynamak İster Misiniz? (E/H): ");
                String Secim = Consol.nextLine();
                if (Secim.equalsIgnoreCase("E")) {
                    TahtaSifirla();
                    TekMiCiftMi();
                    OyunDevam = true;
                } else {
                    System.out.println("Oyun Sona Erdi!");
                    System.out.println("Oyun Kapatılıyor!");
                    OyunDevam = false;
                }
            }
        } while (OyunDevam);
    }
}
