public class Casa {
    // cu 'private' am acces doar in interiorul clasei;
    private int nr;

    String strada;
    String oras;
    String judet;

    // getter pentru a prelua o variabila private
    public int getNr() {
        return this.nr;
    }

    public void setNr (int nrParam) {
        this.nr  = nrParam;
    }

    public int calculeazaCodPostal (int valoareData) {
        // ex variabila locala
        // am acces la ea doar in interiorul metodei
        int valoarePrimita = valoareData;
        int codPostal = valoarePrimita*this.nr;
        return codPostal;
    }

    // Constructorul este folosit pentru a instantia un obiect
    // C nu poate fi static
    // C nu intoarce rezultat
    Casa () {
        System.out.println("S-a apelat constructorul");
    }
}
