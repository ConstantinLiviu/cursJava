public class Animal {

    // metode
    public <E, T> void alearga(E nume, T varsta) {
        System.out.println("Alearga animalul cu numele: " +nume);
        System.out.println("Animalul " +nume + " are " + varsta + " ani");
    }

    // intre <> tipul generic de date
    // K returneaza tipul respectiv de data
    public <K> K mananca(K mancare) {
        System.out.println("S-a apelat metoda mancare()");
        System.out.println(mancare.getClass());
        return mancare;
    }
}
