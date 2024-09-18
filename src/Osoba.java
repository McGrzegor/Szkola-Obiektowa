public class Osoba {
    String imie;
    String nazwisko;
    int wiek;
            //konstruktor to metoda wywołania w momenie tworzneia obiektów


    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //przypisz do własności klasy imie (this wskazuje na ten element)
        this.nazwisko = nazwisko;
        //imie które jest parametrem tej metody
        this.wiek = wiek;
    }
}
