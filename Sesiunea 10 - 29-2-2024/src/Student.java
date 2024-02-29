public class Student {
    int anStudiu;
    String nume;
    boolean areRestante;
    boolean iaBursa;

    Student(int anStudiu, String nume, boolean areRestante, boolean iaBursa) {
        this.anStudiu = anStudiu;
        this.nume = nume;
        this.areRestante = areRestante;
        this.iaBursa = iaBursa;
    }

    Student(String nume, int anStudiu) {
        this.nume = nume;
        this.anStudiu = anStudiu;
    }

    boolean getIaBursa() {
        return this.iaBursa;
    }

    void setAreRestante(boolean areRestanteParam) {
        this.areRestante = areRestanteParam;
    }
}
