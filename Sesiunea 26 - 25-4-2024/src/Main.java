import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create a functional interface named ConditionalPrinter that has a single method named print which takes a
        // String and a boolean as parameters and returns void. Implement this interface using a lambda expression
        // that prints the string to the console only if the boolean parameter is true.
        ConditionalPrinter newPrinter = (a, b) -> {
            if (b) {
                System.out.println(a);
            }
        };

        newPrinter.print("Mimi", true);
        newPrinter.print("Ion", false);

        // Assume you have a Student class with fields String name and int grade. Write a Java program using a
        // traditional for loop to filter out the students who scored more than 60

        Student ion = new Student("Ion", 76);
        Student maria = new Student("Maria", 35);
        Student george = new Student("George", 92);
        Student roxana = new Student("Roxana", 46);
        Student didi = new Student("Didi", 69);

        ArrayList<Student> listaStudenti = new ArrayList<>(List.of(ion, maria, george, roxana, didi));

        System.out.println("Lista studentilor cu nota de trecere:");
        for(Student student: listaStudenti) {
            if (student.grade >60) {
                System.out.println(student.name);
            }
        }



        // Given a list of random numbers, find the smallest and largest numbers in the list.

        Random number = new Random();
        int listLength = number.nextInt(2,20);
        ArrayList<Integer> listaNumere = new ArrayList<>();
        for(int i=0; i<=listLength; i++) {
            listaNumere.add(number.nextInt(-20,20));
        }
        Collections.shuffle(listaNumere);
        System.out.println(listaNumere);

        int smallest = listaNumere.get(0), largest = listaNumere.get(0);

        for (int numar : listaNumere) {
            if (numar<smallest) {
                smallest = numar;
            }
            if(numar>largest) {
                largest = numar;
            }
        }
        System.out.println("Cel mai mic numar este: " + smallest);
        System.out.println("Cel mai mare numar este: " + largest);
    }
}