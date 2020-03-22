package autor;

public class Autor {
    private String name, surname;
    private int YOB;

    public Autor(String name, String surname, int YOB){
        this.name = name;
        this.surname = surname;
        this.YOB = YOB;
    }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public int getYOB() { return YOB; }

    int getAge(){
        return 2020 - this.YOB;
    }

    public String toString(){ return name + " " + surname + "\nYOB: " + YOB;}
}
