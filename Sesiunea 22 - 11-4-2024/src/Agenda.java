public class Agenda<Elementgeneric> {
    // Clasa generica

    // variabile generice
    public Elementgeneric tipVariabila;

    // metoda
    public <Elementgeneric> void notat(Elementgeneric elementgeneric) {
        System.out.println("A fost folosita o metoda generica " + elementgeneric );

    }

    // getter
    public Elementgeneric getTipVariabila() {
        return tipVariabila;
    }

    // setter
    public void setTipVariabila(Elementgeneric tipVariabilaParam) {
        this.tipVariabila = tipVariabilaParam;
    }
}
