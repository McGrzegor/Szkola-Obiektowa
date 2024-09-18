public class Main {
    public static void main(String[] args) {





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