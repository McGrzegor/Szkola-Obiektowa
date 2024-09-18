public class Main {
    public static void main(String[] args) {
       Osoba osobaJas = new Osoba("Jaś","Śliweczka", 7);
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Janek");
    }
}