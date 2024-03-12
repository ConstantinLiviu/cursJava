import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for loop
        // initializator; conditie iterare(true cel putin la inceput); pas incrementare
        for (int index = 0; index <= 10; index++) {
            System.out.println(index);
        }
        // switch
        // expresie de testat
        int numarCursuri = 5;
        switch (numarCursuri) {
//            case 3:
//                System.out.println("Cazul 3");
//                break;
//            case 10:
//                System.out.println("Este 10");
//                break;
//            case 9:
//                System.out.println("e corect");
//                break;
            case 5 -> System.out.println("Este 5");
            default -> System.out.println("Nimic");

//            default:
//                System.out.println("Nimic");
//                break;
        }

        // while
        // conditie adevarata; codul se executa pana conditia devine falsa
        int zileVacanta = 4;
        while (zileVacanta > 0) {
            System.out.println("Au mai ramas " + zileVacanta + " zile de vacanta");
            zileVacanta--;
        }

        // do {} while ()
        // intai se executa codul si apoi se verifica conditia
        int numaratoare = 5;
        do {
            numaratoare++;
            System.out.println("Am ajuns la " + numaratoare);
        } while (numaratoare < 10);

        // 1. Write a program that uses a for loop to print numbers from 1 to 10, each on a new line.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // 2. Develop a program that uses a for loop to count the number of even and odd numbers in a range from 1 to n, where n is input by the user. Print the counts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti limita maxima a intervalului");
        int n = scanner.nextInt();
        System.out.println("");

        int even = 0;
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even++;
//                System.out.println("Numar par: " + i);
            } else {
                odd++;
//                System.out.println("Numar impar: " + i);
            }
        }
        System.out.println("");
        System.out.println("Numere pare: " + even);
        System.out.println("Numere impare: " + odd);
        System.out.println("");
        // 3. Create a Java program where you define an integer variable with a value of 5. Use an if statement to check if the number is
        //greater than 10. If it is, print "The number is greater than 10"; otherwise, print "The number is not greater than 10".
        int variable = 5;
        if (variable > 10) {
            System.out.println("The number is greater than 10");
        } else {
            System.out.println("The number is not greater than 10");
        }
    }
}