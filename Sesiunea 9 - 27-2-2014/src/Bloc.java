public class Bloc {
    String numeBloc;
    int numarApartamente;
    int anConstructie;
    String adresa;

    void Constructie() {
        System.out.println("Blocul a fost construit in " + anConstructie);
    }

    Bloc(String numeBloc, int numarApartamente, int anConstructie, String adresa) {
        this.numeBloc = numeBloc;
        this.numarApartamente = numarApartamente;
        this.anConstructie = anConstructie;
        this.adresa = adresa;
    }
}
