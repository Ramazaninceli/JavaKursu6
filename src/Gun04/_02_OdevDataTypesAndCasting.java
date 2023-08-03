package Gun04;

public class _02_OdevDataTypesAndCasting {
    public static void main(String[] args) {

        //Soru 2: String olarak verilen 3 adet paranın toplamını bulunuz ("100", "200", 300)

        String para1="100";
        String para2="200";
        String para3="300";

        int intPara1=Integer.parseInt(para1);
        int intPara2=Integer.parseInt(para2);
        int intPara3=Integer.parseInt(para3);

        int toplamPara=intPara1+intPara2+intPara3;

        System.out.println("toplamPara = " + toplamPara);

    }
}
