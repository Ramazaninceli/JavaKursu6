package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

//        int[][] tablo=new int[2][3];
//
//        int[][] tabol2={
//                {4,55},
//                {3,56,77},
//                {23,2,15,68,5,6},
//                {1,4,5,8},
//                {43}       };
//
//        for (int i = 0; i < tabol2.length ; i++) {// satır sayısı
//
//            for (int j = 0; j < tabol2[i].length; j++)// sutün sayısı
//                System.out.print(tabol2[i][j]+ " ");
//
//                System.out.println();
//
//            }

        int[][] tablo4=new int[2][3];

        int[][] tablo3={
                {4,55},
                {3,56,77},
                {23,2,15,68,5,6},
                {1,4,5,8},
                {43}       };

        for (int i = 0; i <tablo3.length ; i++) {
            for (int j = 0; j < tablo3[i].length; j++)
                System.out.print(+tablo3[i][j]+" ");

                System.out.println();



        }


        }
    }

