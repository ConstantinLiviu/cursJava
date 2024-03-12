public class Apartament {
    int numarApartament;
    int numarCamere;
    int numarLocatari;
    int etajApartament;

    static boolean eLocuit= true;
    static String numeFamilie = "Popescu";

    Apartament(int numarApartament, int numarCamere, int numarLocatari, int etajApartament) {
        this.numarApartament = numarApartament;
        this.numarCamere = numarCamere;
        this.numarLocatari = numarLocatari;
        this.etajApartament = etajApartament;
    }

    int getNumarApartament() {
        return this.numarApartament;
    }

    void setNumarLocatari(int numarLocatariParam) {
        this.numarLocatari = numarLocatariParam;
    }

    public int getNumarCamere() {
        return numarCamere;
    }

    public void setNumarCamere(int numarCamere) {
        this.numarCamere = numarCamere;
    }

    public int getNumarLocatari() {
        return numarLocatari;
    }

    public int getEtajApartament() {
        return etajApartament;
    }

    public void setEtajApartament(int etajApartament) {
        this.etajApartament = etajApartament;
    }

    public static boolean iseLocuit() {
        return eLocuit;
    }

    public static String getNumeFamilie() {
        return numeFamilie;
    }

    public void setNumarApartament(int numarApartament) {
        this.numarApartament = numarApartament;
    }

    public static void seteLocuit(boolean eLocuit) {
        Apartament.eLocuit = eLocuit;
    }

    public static void setNumeFamilie(String numeFamilie) {
        Apartament.numeFamilie = numeFamilie;
    }

    static void afisareNumarApartament() {
        System.out.println("Am apelat metoda 'afisareNumarApartament()'");
    }
    static void afisareNumarLocatari() {
        if (eLocuit) {
            System.out.println("Aici locuiesc oameni!");
        } else {
            System.out.println("Apartamentul e liber");
        }
    }

    static void afisareNumarCamere() {
        System.out.println("Am apelat metoda 'numarCamere()'");
    }

    static void afisareEtajApartament() {
        System.out.println("Am apelat metoda 'afisareEtajApartament()'");
    }
}
