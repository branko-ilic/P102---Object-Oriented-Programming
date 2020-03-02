package matrix;

import java.util.Arrays;

public class ex1_matrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        ispisi2(a);
    }

    static void ispisi1(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
    }

    static void ispisi2(int[][] a){
        for(int[] tmp : a) {
            for (int x : tmp)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    static void ispisi3(int[][] a){
        System.out.println(Arrays.deepToString(a));
    }
}