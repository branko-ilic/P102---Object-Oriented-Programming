package studentipckg;

public class Student {
    private String ime, prezime, indeks;
    private double prosek;

    public Student(String ime, String prezime, String indeks, double prosek){
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
        this.prosek = prosek;
    }

    public String getIme() { return ime; }

    public String getPrezime() { return prezime; }

    public String getIndeks() { return indeks; }

    public int getGodinaUpisa(){
        String tmp = "20" + indeks.charAt(2) + indeks.charAt(3);
        return Integer.parseInt(tmp);
    }

    public int getBrojIndeksa(){
        String tmp = "" + indeks.charAt(4) + indeks.charAt(5) + indeks.charAt(6);
        return Integer.parseInt(tmp);
    }

    public void setIndeks(String indeks) {
        if(validirajIndeks(indeks))
            this.indeks = indeks;
        else
            System.out.println("Neispravan format indeksa.");
    }

    private boolean validirajIndeks(String indeks){
        if(indeks.charAt(0) != 'm' && indeks.charAt(1) != 'a')
            return false;

        String dopustiviSmerovi = "mnvlrif";
        if(!dopustiviSmerovi.contains("" + indeks.charAt(1)))
            return false;

        for(int i=2; i<indeks.length(); i++)
            if(!Character.isDigit(indeks.charAt(i)))
                return false;

        return true;
    }

    private String validirajSmer(char studije, char smer){
        if(studije == 'm'){
            switch(smer) {
                case 'm':
                    return "Teorijska matematika";
                case 'r':
                    return "Racunarstvo i informatika";
                case 'v':
                    return "Statistika i aktuarska i finansijska matematika";
                case 'l':
                    return "Profesor matematike i racunarstva";
                case 'n':
                    return "Primenjena matematika";
                case 'i':
                    return "Informatika";
                default:
                    return null;
            }
        }
        else if(studije == 'a' && smer == 'f')
            return "Astrofizika";
        else if(studije == 'a' && smer == 'i')
            return "Astroinformatika";
        else
            return null;
    }

    public String getSmer(){
        char studije = indeks.charAt(0);
        char smer = indeks.charAt(1);

        String rezultatValidacije = validirajSmer(studije, smer);
        if(rezultatValidacije == null)
            return "Smer nije validan";
        else
            return rezultatValidacije;
    }

    public double getProsek() { return prosek; }

    public String toString(){
        return ime + " " + prezime + " " + indeks + " " + prosek;
    }
}
