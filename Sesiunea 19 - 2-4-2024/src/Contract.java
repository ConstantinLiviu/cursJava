public class Contract {
    String id;
    String denumire;
    StariContractEnum stare;

    Contract(String id, String denumire, StariContractEnum stare) {
        this.id = id;
        this.denumire = denumire;
        this.stare = stare;
    }
}
