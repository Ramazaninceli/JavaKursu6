package Gun08;

public class _07_JavaComparisonOperators {
    public static void main(String[] args) {

        // eşit mi farklı mı büyük mü küçük mü büyük eşit mi küçük eşit mi

        int a = 50;
        int b = 50;

        //  tek = atama işareti, çift == eşit mi? demek

        boolean esitMi=(a==b); // a b ye eşit mi

        System.out.println("esitMi = " + esitMi);
        System.out.println("a b den farklı mı = " +( a!=b));
        System.out.println("a b den büyük mü = " + (a>b));
        System.out.println("a b den küçük mü = " + (a<b));
        System.out.println("(a b den küçük eşit mi = " + (a<=b));
        System.out.println("a b ye eşit yada büyük mü = " + (a>=b));




    }
}
