public class Main {
    public static void main(String[] args) {
       Osoba osobaJas = new Osoba("Jaś","Śliweczka", 10);
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Janek");




        Osoba osobaAla = new Osoba("Ala", "Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());
        Osoba osobaX = new Osoba();

        Uczen uczen = new Uczen("Daniel", "Nowy");
        System.out.println("Liczba Uczniow"+Uczen.LiczbaObiektow);
        Uczen uczen2 = new Uczen("Daniel","Stary");
        System.out.println("Liczba Uczniow"+Uczen.LiczbaObiektow);
        Uczen uczen3 = new Uczen("Ala", "Flaka");
        System.out.println("Liczba Uczniow"+Uczen.LiczbaObiektow);
        System.out.println(uczen3);



        Nauczyciel nauczycielSlowik = new Nauczyciel("Marlena", "Słowik", 25, "matematyka");
     System.out.println(nauczycielSlowik);
    }

}