public class Om {
    int varsta;
    String nume;
    String profesie;
    double inaltime;

    Om(int varsta, String nume, String profesie, double inaltime) {
        this.varsta = varsta;
        this.nume = nume;
        this.profesie = profesie;
        this.inaltime = inaltime;
    }

    Om(String nume, String profesie) {
        this.nume = nume;
        this.profesie = profesie;
    }

    int getVarsta() {
        return this.varsta;
    }

    void setVarsta(int varstaParam) {
        this.varsta = varstaParam;
    }
}
