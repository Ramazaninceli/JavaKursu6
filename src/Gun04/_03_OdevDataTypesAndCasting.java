package Gun04;

public class _03_OdevDataTypesAndCasting {
    public static void main(String[] args) {

        //Soru 3: String olarak verilen 3 taksit bilgisinin ortalamasını(ondalıklı olarak) bulunuz.("150","185","95")

        String taksit1="150";
        String taksit2="185";
        String taksit3="95";

        double doubleTaksit1=Double.parseDouble(taksit1);
        double doubleTaksit2=Double.parseDouble(taksit2);
        double doubleTaksit3=Double.parseDouble(taksit3);

        double ortalamaTaksit=(doubleTaksit1+doubleTaksit2+doubleTaksit3)/3;
        System.out.println("ortalamaTaksit = " + ortalamaTaksit);


    }
}
