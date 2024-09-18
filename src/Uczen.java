public class Uczen extends Osoba {
        //poniwaz uczen ma te same wlasnosci co osoba to bedzie klasa potomna klasy osoba klasa osoba bedzie klasa bazowa
        private int nr_ewidecyjny;
        static int LiczbaObiektow;

    public Uczen(String imie, String nazwisko, int wiek, int nr_ewidecyjny) {
        super(imie, nazwisko, wiek);
        //wywołanie konstruktora klasy bazowej
        this.nr_ewidecyjny = nr_ewidecyjny;
        LiczbaObiektow++;
    }

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        LiczbaObiektow++;
        nr_ewidecyjny = LiczbaObiektow++;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                " imie"+getImie()+ "nazwsiko"+getNazwisko()+
                " nr_ewidecyjny=" + nr_ewidecyjny +
                "}" ;
    }
}
