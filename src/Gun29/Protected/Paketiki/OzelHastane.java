package Gun29.Protected.Paketiki;

import Gun29.Protected.PaketBir.Doctor;

public class OzelHastane {
    public static void main(String[] args) {
        Doctor dok1=new Doctor("Ayşe");
        dok1.hastaneAd="özel istanbul hastanesi";

        //Doctor  dok2=new Doctor(); //default olduğu için gelmiyor.
        //default sadece kendi paketinde ulaşılabilir
    }
}
