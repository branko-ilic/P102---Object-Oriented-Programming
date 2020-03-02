package matrix;
//program unosi matricu a zatim vrsi obratnje i-te i j-te vrste

import java.util.Scanner;
import java.util.Arrays;

public class ex3_matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] a = unesi();

        int i = nextSureInt();
        int j = nextSureInt();

        if(i<0 || i>=a.length || j<0 || j>=a.length){
            System.out.println("Indeks vrste mora biti izmedju 0 i " + (a.length-1));
            System.exit(1);
        }
        System.out.println("Pre razmene:");
        ispisi(a);

        System.out.println("Posle razmene:");
        razmeni(a, i, j);
        ispisi(a);
    }

    static int[][] unesi(){
        int n = nextSureInt();
        int m = nextSureInt();

        int[][] a = new int[n][m];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                a[i][j] = nextSureInt();

        return a;
    }

    public static int nextSureInt(){
        if(sc.hasNextInt())
            return sc.nextInt();
        else{
            System.out.println("Niste uneli ceo broj");
            System.exit(1);
            return 1;
        }
    }

    static void ispisi(int[][] a) {
        for (int[] row: a) {
            for (int e: row)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    static void razmeni(int[][] a, int i, int j){
        int[] tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
