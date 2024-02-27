public class Laptop {
    int marimeEcran;
    int capacitateSSDGB;
    int ramGB;
    String marca;

    void Oferta() {
        if (ramGB>8){
            System.out.println("Produsul nu se afla in stoc!");
        }
    }

    Laptop(int marimeEcran, int capacitateSSDGB, int ramGB, String marca) {
        this.marimeEcran = marimeEcran;
        this.capacitateSSDGB = capacitateSSDGB;
        this.ramGB = ramGB;
        this.marca = marca;
    }
}
