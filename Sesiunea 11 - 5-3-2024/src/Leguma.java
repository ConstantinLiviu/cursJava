public class Leguma {
    // proprietati
    String nume;
    double pret;
    String producator;
    int gramaj;

    // constructor
    Leguma(String nume, double pret, String producator, int gramaj) {
        this.nume = nume;
        this.pret = pret;
        this.producator = producator;
        this.gramaj = gramaj;
    }

    // getter
    String getProducator() {
        return this.producator;
    }

    double getPret() {
        return this.pret;
    }

    // metode
    void afiseazaPret() {
        System.out.println(nume + " costa " + pret + "RON/Kg");
        System.out.println("Am rulat metoda afiseazaPret()");
        System.out.println(" ");
    }

    void numeProducator() {
        System.out.println(nume + " cultivat de " + producator);
        System.out.println("Am rulat metoda numeProducator()");
        System.out.println(" ");
    }


}
