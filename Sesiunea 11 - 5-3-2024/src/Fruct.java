public class Fruct {
    // proprietati
    String culoare;

    boolean eCopt;

    String nume;

    int marimeCM;

    // constructor
    Fruct(String culoare, boolean eCopt, String nume, int marimeCM) {
        this.culoare = culoare;
        this.eCopt = eCopt;
        this.nume = nume;
        this.marimeCM = marimeCM;
    }

    // getteri
    int getMarimeCM() {
        return marimeCM;
    }

    boolean getECopt() {
        return eCopt;
    }

    // metode
    void eCopt() {
        if (eCopt) {
            System.out.println(nume + " s-a copt");
        } else {
            System.out.println(nume + " nu s-a copt");
        }
        System.out.println("Am rulat metoda eCopt()");
        System.out.println(" ");
    }

    void marimeFruct() {
        System.out.println("Fructul are " + marimeCM + "cm diametru");
        System.out.println("Am rulat metoda marimeFruct()");
        System.out.println(" ");
    }
}
