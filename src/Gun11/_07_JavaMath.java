package Gun11;

public class _07_JavaMath {
    public static void main(String[] args) {

        int a = -12;
        int b = 4;

        System.out.println("a nın mutlak değeri = " + Math.abs(a));//12
        System.out.println("a ve b den büyük olanı : " + Math.max(a, b));//4
        System.out.println("a ve b den Küçük olanı : " + Math.min(a, b));//-12
        System.out.println("2 ni 3. kuvveti : " + Math.pow(2, 3));//2*2*2
        System.out.println(" b nin karekökü  : " + Math.sqrt(b));//2
        System.out.println("round (yuvarlama) : " + Math.round(3.1));//3
        System.out.println("round (yuvarlama) : " + Math.round(3.5));//4
        System.out.println("ceil 3.1 : " + Math.ceil(3.1));//4 3,1 den büyük en yakın tam sayıyı verir
        System.out.println("ceil 3.1 : " + Math.ceil(3.9));//4 3,1 den büyük en yakın tam sayıyı verir

        System.out.println("floor 3.1 : " + Math.floor(3.1));//3 3,1 den küçük en yakın tam sayıyı verir
        System.out.println("floor 3.9 : " + Math.floor(3.1));//3 3,9 den küçük en yakın tam sayıyı verir
    }
}