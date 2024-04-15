public enum StareComanda {
    GOL("Nu exista produse in cos"),
    PENDING("In curs de actualizare"),
    HAS_PRODUCTS("Exista produse in cos"),
    PROCESSED("Platit)");

    private final String stareNume;

    String getStareNume() {
        return stareNume;
    }

    StareComanda(String stareNume) {
        this.stareNume = stareNume;
    }
}
