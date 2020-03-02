package nizovi;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println();
        for (int x : a)
            System.out.print(x + " ");

        sc.close();
    }
}
