package Gun45;

public class S46 {
    public static void main(String[] args) {

        String names[] ={"Thomas","Peter","joseph"};
        String pwd[]=new String[3];
        int idx=0;



            try {
                for (String n:names ) {

                    pwd[idx] = n.substring(2, 6);// omas
                    idx++;//1
                }

            }catch (Exception e){
                System.out.println("Invalıd name");//ınvalid name
            }



        for (String p: pwd ) {//
            System.out.println("p = " + p);// omas,null,null

        }
    }

    }

