package Gun45;

public class S64_3 {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if (arr[i].equals("C")) {
                break;
            }
            System.out.print(" Work dane //");
            //break;// break koşulu sağlanırsa döngü durur.
        }
    }
}
