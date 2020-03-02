package nizovi;

import java.util.Scanner;

public class ex3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = unesi();

        System.out.println("Unesite celobrojnu konstantnu:");
        int c = sc.nextInt();
        pomnoziConst(a, c);
        ispisi(a);
    }

    static void pomnoziConst(int[] a, int c){
        for(int i=0; i<a.length; i++)
            a[i] = a[i]*c;
    }

    static int[] unesi(){
        sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza:");
        int n = sc.nextInt();
        int[] tmp = new int[n];

        System.out.println("Unesite elemente niza:");
        for(int i=0; i<n; i++)
            tmp[i] = sc.nextInt();
        return tmp;
    }

    static void ispisi(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+ " ");
        System.out.println();
    }
}