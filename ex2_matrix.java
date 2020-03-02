package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class ex2_matrix {
    public static void main(String[] args) {
        int[][] a = unesi();

        ispisi3(a);
    }

    private static int[][] unesi(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                a[i][j] = sc.nextInt();

        return a;
    }

    static void ispisi3(int[][] a){
        System.out.println(Arrays.deepToString(a));
    }

}
