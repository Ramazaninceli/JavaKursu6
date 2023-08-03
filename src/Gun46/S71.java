package Gun46;

public class S71 {
    public static void main(String[] args) {
        int[][] arr = new  int[2][4];

        arr=new  int[][]{
                {1,3,5,7},
                {1,3}
        };//bu iki bölüm aşağıdaki ile aynıdır.

        arr[0]=new  int[]{1,3,5,7};
        arr[1]=new  int[]{1,3};

        //arr.lenght nedir? satır sayısını verir
        //a[i].lenght nedir? satırdaki eleman sayısını verir
        for (int[] a:arr  ) {
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(a[i]+ " ");
            }


            System.out.println();
            }

        /*int[] dizi={1,2,3,4};
            0 1 2 3
tek boyutlu int dizi, kaç elemanı var ? 4
dizi.length : eleman sayısını verir


int[][] tablo=
   {
     {1,2,3,4},
     {45,66}
   };

hemn en hem boy var yani 2 boyutlu
yani birden çok satır var, ve her satırda farklı
sayıda eleman olabiliyor.

tablo 2 tane satırdan yani
2 tane tek boyutlu dizinin birleşiminden oluşmuştur
tablonun elemanları satırlardır.
tablonun kaç elemanı var 2 elemanı var
her elemanı dizi olduğu için
her satırın yani her elemanın da kendi eleman sayısı var

tablo.length => satır sayısı yani 2
tablo[0].length => tablonun sıfırıncı elemanın eleman sayısı 4
tablo[1].length => tablonun birinci elemanın eleman sayısı 2


for(int[] dizi:  tablo) // tablonun elemanları gelecek
   for(int sayi : dizi)
     print(sayi);


for(int i=0; i< tablo.length;i++) // i: 0,1
  for(int j=0; j< tablo[i].length; j++)
    print( tablo[i][j])*/

        }

    }

