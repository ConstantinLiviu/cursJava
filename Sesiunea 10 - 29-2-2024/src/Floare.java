public class Floare {
    // proprietati clasa
    int numarPetale;
    String culoare;
    String miros;
    boolean areGhiveci;

    // constructor & constructori multipli
    Floare(int numarPetale, String culoare) {
        this.numarPetale = numarPetale;
        this.culoare = culoare;
    }

    Floare(int numarPetaleParam) {
        this.numarPetale = numarPetaleParam;
    }

    // metode
    int metodaCareIntoarceUnNumarIntreg() {
        return 10;
    }

    void metodaCareIntoarceNimic() {
        System.out.println("Metoda returneaza nimic");
        System.out.println("Floarea are " + numarPetale + " petale");
    }

    // Getter
    int getNumarPetale() {
        return numarPetale;
    }

    void setNumarPetale(int nouaValoareParametru) {
        this.numarPetale = nouaValoareParametru;
    }

}
