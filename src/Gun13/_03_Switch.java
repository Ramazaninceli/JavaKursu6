package Gun13;

import java.util.Scanner;

public class _03_Switch {
    public static void main(String[] args) {
        //Girilen bir Ay numarasına göre bir ayın kaç gün sürdüğünü bulunuz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Ay no Gir :");
        int ayNo= oku.nextInt();

        switch (ayNo)
        {
            case 1: System.out.println("31 gün"); break;
            case 2: System.out.println("28 gün"); break;
            case 3: System.out.println("31 gün"); break;
            case 4: System.out.println("30 gün"); break;
            case 5: System.out.println("31 gün"); break;
            case 6: System.out.println("30 gün"); break;
            case 7: System.out.println("31 gün"); break;
            case 8: System.out.println("31 gün"); break;
            case 9: System.out.println("30 gün"); break;
            case 10: System.out.println("31 gün"); break;
            case 11: System.out.println("30 gün"); break;
            case 12: System.out.println("31 gün"); break;
            default:
                System.out.println("hatalı Ay no");

        }
        //2. Yol
        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println(31);break;
            case 2: System.out.println(28);break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println(30);break;
            default:
                System.out.println("hatalı ay no girdiniz");
        }

    }
}
