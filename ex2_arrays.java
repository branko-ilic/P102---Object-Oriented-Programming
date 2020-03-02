package c_ArrayClass;

import java.util.Arrays;

public class ex2_arrays {
    public static void main(String[] args) {
        int[] a = new int[50];
        Arrays.fill(a,43); // fills the whole array with the same value
        show("a", a);

        int[] b = Arrays.copyOfRange(a, 20, 30);
        show("b", b); // copies the elements from given indexes

        int[] c = Arrays.copyOf(a, a.length);
        show("c", c);
    }

    static void show(String name, int[] a){
        System.out.println(name + " " + Arrays.toString(a));
    }
}
