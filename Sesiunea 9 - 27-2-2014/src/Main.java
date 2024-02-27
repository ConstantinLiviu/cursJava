public class Main {
    public static void main(String[] args) {

        // How to break a for loop
        DENUMIRE_FOR:
        for(int i=0; i<=10; i++){
            System.out.println(i);
            if(i%2==0) {
                System.out.println("Numarul " + i + "este par");
                break DENUMIRE_FOR;
            }
        }

        for(int i=0; i<=10; i++){
            System.out.println(i);
            if(i%2==0) {
                System.out.println("Numarul " + i + " este par");
                continue;
            }
            System.out.println("Am trecut de continue");
        }

// -crearea a 3 clase: Bloc, Contract, Laptop
        Laptop lenovo = new Laptop(17, 512, 16, "lenovo");
        lenovo.Oferta();

        Bloc a = new Bloc("A", 32, 1980, "Bvd. Dorobanti, nr.11");
        a.Constructie();

        Contract angajare = new Contract("Ion Popescu", "GigiSolutions", "nelimitat", 3500);
        angajare.Succes();
// -intr-un for(){} cu indexul initializat cu valoarea 10, afisam un mesaj daca indexul ajunge la valoarea 3.
        for(int i=10; i>=0; i--) {
            if (i==3) {
                System.out.println("Indexul a ajuns la 3");
                break;
            }
        }

    }
}