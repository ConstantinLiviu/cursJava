public class Contract {
    String numeAngajat;
    String numeCompanie;
    String durataContractului;
    int salariu;

    void Succes() {
        System.out.println("Sunteti angajat!");
    }

    Contract(String numeAngajat, String numeCompanie, String durataContractului, int salariu) {
        this.numeAngajat = numeAngajat;
        this.numeCompanie = numeCompanie;
        this.durataContractului = durataContractului;
        this.salariu = salariu;
    }
}
