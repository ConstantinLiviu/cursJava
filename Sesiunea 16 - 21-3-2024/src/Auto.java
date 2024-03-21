public abstract class Auto {
    String nume;
    String model;

    public void franeaza() {
        System.out.println("Autovehiculul franeaza...");
    }
    // Metodele abstracte nu pot avea un corp al functiei
    public abstract void accelereaza();
}
