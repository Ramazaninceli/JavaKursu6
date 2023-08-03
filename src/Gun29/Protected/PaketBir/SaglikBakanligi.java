package Gun29.Protected.PaketBir;

public class SaglikBakanligi {
    public static void main(String[] args) {

        Doctor dok1=new Doctor();
        dok1.hastaneAd="Numune hastanesi";
        dok1.adi="ismet";
        dok1.bolumu="dahiliye";
       // dok1.sicilNo private // sicil no private olduğu için ulaşılamıyor
    }
}
