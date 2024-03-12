public class Bloc {
    String numeBloc;
    String adresaStrada;
    int adresaNumar;
    int numarLocatari;

    static boolean eReabilitat = true;

    static int anConstructie = 1995;

    Bloc(String numeBloc, String adresaStrada, int adresaNumar, int numarLocatari) {
        this.numeBloc = numeBloc;
        this.adresaStrada = adresaStrada;
        this.adresaNumar = adresaNumar;
        this.numarLocatari = numarLocatari;
    }

    public String getNumeBloc() {
        return numeBloc;
    }

    public void setNumeBloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public String getAdresaStrada() {
        return adresaStrada;
    }

    public void setAdresaStrada(String adresaStrada) {
        this.adresaStrada = adresaStrada;
    }

    public int getAdresaNumar() {
        return adresaNumar;
    }

    public void setAdresaNumar(int adresaNumar) {
        this.adresaNumar = adresaNumar;
    }

    public int getNumarLocatari() {
        return numarLocatari;
    }

    public void setNumarLocatari(int numarLocatari) {
        this.numarLocatari = numarLocatari;
    }

    public static boolean iseReabilitat() {
        return eReabilitat;
    }

    public static int getAnConstructie() {
        return anConstructie;
    }

    public static void seteReabilitat(boolean eReabilitat) {
        Bloc.eReabilitat = eReabilitat;
    }

    public static void setAnConstructie(int anConstructie) {
        Bloc.anConstructie = anConstructie;
    }

    static void afisareNumeBloc() {
        System.out.println("Am folosit metoda 'afisareNumeBloc()'");
    }
    static void afisareAdresaStrada() {
        System.out.println("Am folosit metoda 'afisareAdresaStrada()'");
    }
    static void afisareAdresaNumar() {
        System.out.println("Am folosit metoda 'afisareAdresaNumar()'");
    }
    static void afisareNumarLocatari() {
        System.out.println("Am folosit metoda 'afisareNumarLocatari()'");
    }
}
