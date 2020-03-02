package nizovi;

//

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int[] a = unesi();
        ispisi1(a);
        ispisi2(a);
    }

    static int[] unesi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza:");
        int n = sc.nextInt();

        int[] tmp = new int[n];
        System.out.println("Unesite " + n + " brojeva");
        for(int i=0; i<n; i++)
            tmp[i] = sc.nextInt();
        return tmp;
    }

    static void ispisi1(int[] tmp){

        for(int i=0; i<tmp.length; i++)
            System.out.print(tmp[i] + " ");
        System.out.println();
    }

    static void ispisi2(int[] tmp){
        for(int x : tmp)
            System.out.print(x + " ");
        System.out.println();
    }
}
