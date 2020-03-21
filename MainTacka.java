package tacka;

public class Main {
    public static void main(String[] args) {
        Tacka t1 = new Tacka(1, 3);
        Tacka t2 = new Tacka(3, 6);

        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        t1.translate(2, 3);
        if(t1.equals(t2))
            System.out.println("t1 == t2");
        else
            System.out.println("t1 != t2");

        t1.translate(-2, -2);
        double d = t1.distance(t2);
        System.out.println("Distance: " + d);
    }
}
