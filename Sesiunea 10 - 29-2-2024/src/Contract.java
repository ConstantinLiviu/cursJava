public class Contract {
    String numeAngajat;
    String numeCompanie;
    boolean aFostAngajat;
    int salariu;


    Contract(String numeAngajat, String numeCompanie, boolean aFostAngajat, int salariu) {
        this.numeAngajat = numeAngajat;
        this.numeCompanie = numeCompanie;
        this.aFostAngajat = aFostAngajat;
        this.salariu = salariu;
    }

    Contract(int salariu, String numeAngajat) {
        this.salariu = salariu;
        this.numeAngajat = numeAngajat;
    }

    int getSalariu(){
        return this.salariu;
    }

    void setSalariu(int salariuParam) {
        this.salariu = salariuParam;
    }
}
