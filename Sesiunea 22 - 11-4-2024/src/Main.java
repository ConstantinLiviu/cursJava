import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Generics - metode cu parametri nedefiniti
        // Gen nu accepta primitive
        List<String> listaNume = List.of("nume1", "nume2");

        Animal animal1 = new Animal();
        animal1.mananca("Varza");
        animal1.mananca(12);
        animal1.mananca(true);

//        -creare 4 metode generice(2 cu un parametru, 2 cu 2 parametri).
//        -creare 3 clase generice(1 cu 2 parametri generice, 2 cu 1 parametri generic si 1 metode generica)
//        -
//                keep
//        Fixat
//        Create a class named Employee with fields id, name, and department. Override the equals() and hashCode()
//        methods to establish equality based on the id field. Create a main method where you demonstrate that two
//        Employee objects with the same id are considered equal.
//

        ClasaGenerica1 obiectGeneric1 = new ClasaGenerica1<>("Ion", 2);
        System.out.println(obiectGeneric1.prenume);
        ClasaGenerica2 obiectGeneric2 = new ClasaGenerica2<>(5800);
        obiectGeneric2.verificareSold(3600);
        ClasaGenerica3 obiectGeneric3 = new ClasaGenerica3<>(83.5);
        obiectGeneric3.catCantareste(65);

        Employee ion = new Employee(12,"Ion", "Contabilitate");
        Employee george = new Employee(12, "George", "IT");

        System.out.println(ion.equals(george));
    }
}