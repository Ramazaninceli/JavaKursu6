package SerbestCalisma;

import java.util.Scanner;

public class Ifstatement {

    public static void main(String[] args) {



        Scanner oku=new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sayi= oku.nextInt();
        
        int kontrol=sayi;
        int tersi=0;
        while (sayi>0){
            tersi=tersi*10;
            tersi=tersi+(sayi%10);
            sayi=sayi/10;
        }
        if (tersi==kontrol){

        System.out.println("sayı = " +kontrol+" tersi= "+ tersi+" simetrik");
        }
        else{
            System.out.println("sayı = " +kontrol+" tersi= "+ tersi+" simetrik değil");}


        }
    }

