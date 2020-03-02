package c_ArrayClass;

import java.util.Arrays;
import java.util.Scanner;

public class ex1_arrays {
    public static void main(String[] args) {
        int[] a = {10, 5, 3, 8, 9, 7, 6, 4, 1, 2};
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i = Arrays.binarySearch(a, x);

        if(i<0)
            System.out.println(x + " ne postoji u nizu");
        else
            System.out.println(x + " se nalazi na poziciji " + i);
    }
}
