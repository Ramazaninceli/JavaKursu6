package Gun46;

public class S152 {
    public static void main(String[] args) {
        int n[][] = {{1,3},
                {2,4}
        };
        for (int i = n.length-1; i >=0 ; i--) {
            for (int j : n[i]) {
                System.out.print(j);

            }

        }
    }
}
