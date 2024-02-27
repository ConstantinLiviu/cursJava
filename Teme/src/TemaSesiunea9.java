import java.util.Scanner;

public class TemaSesiunea9 {
    public static void main(String[] args) {
//        -parcurgem un for care are indexul de la 1 la 1000. Daca indexul=10 afisam un mesaj, daca indexul=100 afisam un al doilea mesaj, daca  indexul este 900 afisam un al treilea mesaj.
        for (int i = 1; i <= 1000; i++) {
            if (i == 10) System.out.println("Am ajuns la 10");
            if (i == 100) System.out.println("Am ajuns la 100");
            if (i == 900) System.out.println("Am ajuns la 900");
        }

//        -rezolvam exercitiul de mai sus cu while si do while in loc de for.
        int index = 1;
        while(index<=1000) {
            if (index == 10) System.out.println("Am ajuns la 10");
            if (index == 100) System.out.println("Am ajuns la 100");
            if (index == 900) System.out.println("Am ajuns la 900");
            index++;
        }

        int index2 = 1;
        do {
            if (index2 == 10) System.out.println("Am ajuns la 10");
            if (index2 == 100) System.out.println("Am ajuns la 100");
            if (index2 == 900) System.out.println("Am ajuns la 900");
            index2++;
        } while(index2<=1000);

//        -folosind un switch verificam daca variabila primita de la utilizator este mai mare decat 100. Daca este adevarat afisam un mesaj.
        Scanner numarUtilizator = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numar = Long.signum((long) numarUtilizator.nextInt() - 100);
        System.out.println(numar);
        switch (numar) {
            case -1:
                break;
            case 0:
                break;
            case 1:
                System.out.println("Numarul introdus e mai mare de 100");
                break;
            default:
                break;
        }

//        -ce inseamna o clasa? Ce inseamna o metoda/proprietate/ un constructor?(notam intr-un fisier .txt aceste raspunsuri)
//        O clasa reprezinta un tipar pe baza caruia este instantiat un obiect. Clasa determina numarul si tipul de proprietati/metode detinute de obiect si modul in care acestea pot fi accesate si utilizate;
//        O metoda este un set de instructiuni (bloc de cod) accesibil obiectelor instantiate folosind clasa ce are definita metoda in cauza;
//        O proprietate este o variabila declarata in clasa si disponibila obiectelor instantiate pe baza clasei in cauza
//        Un constructor este un bloc de cod/set de instructiuni ce permite instantierea unui obiect in baza clasei folosite pentru a-l defini
    }
}
