import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instantiere fara constructor
//        Person persoana1 = new Person();
//        persoana1.name = "Alex";
//        persoana1.age = 27;
//        Person persoana2 = new Person();
//
//        System.out.println("Varsta este: " + persoana1.age);

        // instantiere cu constructor de clasa
        Person persoana3 = new Person("George", 40);
        System.out.println(persoana3);
        System.out.println(persoana3.age);
        System.out.println(persoana3.name);

        Person persoana4 = new Person("Mihaela", 22);
        System.out.println(persoana4.age);
        System.out.println(persoana4.name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarUtilizator = scanner.nextInt();
        System.out.println("Numarul introdus este: " + numarUtilizator);

        // EXE
        Masina golf4 = new Masina("rosie", "Volkswagen", 2021);
        Masina fordFocus = new Masina("alba", "Ford", 2016);
        Masina lada = new Masina("bej", "Lada", 2002);

        Contract angajare1 = new Contract("Ion Georgescu", "CGS", 2500);
        Contract angajare2 = new Contract("Mircea Petrescu", "Endava", 4000);
        Contract angajare3 = new Contract("Ana Miron", "SRI", 5280);

        Bloc bloculA = new Bloc(4,36, "A");
        Bloc bloculB = new Bloc(10,220, "B");
        Bloc bloculL3 = new Bloc(8,124, "L3");

        if(golf4.anFabricatie >2020) {
            System.out.println("(Golf 4) Este noua!");
        }
        if(fordFocus.anFabricatie >2020) {
            System.out.println("(Ford Focus) Este noua!");
        }
        if(lada.anFabricatie >2020) {
            System.out.println("(Lada) Este noua!");
        }
    }
}
