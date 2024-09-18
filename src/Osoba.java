import java.util.Scanner;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    //konstruktor to metoda wywołania w momenie tworzneia obiektów


    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //przypisz do własności klasy imie (this wskazuje na ten element)
        this.nazwisko = nazwisko;
        //imie które jest parametrem tej metody
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    //metody dostepowe
    //gettery i settery
    public void setImie(String imie) {
        //wpisywanie hasła z klawaitury
        Scanner Scanner = new Scanner(System.in);
        String haslo = Scanner.next();

        if (haslo.equals("qwe123"));
        //jezeli haslo qwe123


    }

}

