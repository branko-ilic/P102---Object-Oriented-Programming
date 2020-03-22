package autor;

public class MainAutor {
    public static void main(String[] args) {
        Autor autor = new Autor("Robert", "Dzordan", 1948);

        System.out.println(autor);
        int age = autor.getAge();
        System.out.println(age);
    }
}
