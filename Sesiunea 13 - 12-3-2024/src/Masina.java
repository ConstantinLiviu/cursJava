public class Masina {
    String marca;
    String culoare;
    int anProductie;
    int kilometriBord;
    static boolean inGarantie = true;
    static int vitezaMaximaKmh = 155;

    Masina(String marca, String culoare, int anProductie, int kilometriBord) {
        this.marca = marca;
        this.culoare = culoare;
        this.anProductie = anProductie;
        this.kilometriBord = kilometriBord;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAnProductie() {
        return anProductie;
    }

    public void setAnProductie(int anProductie) {
        this.anProductie = anProductie;
    }

    public int getKilometriBord() {
        return kilometriBord;
    }

    public void setKilometriBord(int kilometriBord) {
        this.kilometriBord = kilometriBord;
    }

    public static boolean isInGarantie() {
        return inGarantie;
    }

    public static void setInGarantie(boolean inGarantie) {
        Masina.inGarantie = inGarantie;
    }

    public static int getVitezaMaximaKmh() {
        return vitezaMaximaKmh;
    }

    public static void setVitezaMaximaKmh(int vitezaMaximaKmh) {
        Masina.vitezaMaximaKmh = vitezaMaximaKmh;
    }

    static void afisareMarca() {
        System.out.println("Am folosit metoda 'afisareMarca()'");
    }
    static void afisareCuloare() {
        System.out.println("Am folosit metoda 'afisareCuloare()'");
    }
    static void afisareanProductie() {
        System.out.println("Am folosit metoda 'afisareanProductie()'");
    }
    static void afisareKilometriBord() {
        System.out.println("Am folosit metoda 'afisareKilometriBord()'");
    }
}
