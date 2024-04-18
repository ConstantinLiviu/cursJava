import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // instantiere obiect
        Car newCar = new Car("Model", "Marca");

        // clase anonime
        // extind clasa Car
        Car loganAnonim = new Car("Logan", "Dacia") {

            String nume;

            // metoda suprascrisa din clasa anonima
            @Override
            public void functioneaza() {
                System.out.println("Metoda functioneaza() a fost modificata");
            }
        };

        newCar.functioneaza();
        loganAnonim.functioneaza();

        // Interfete functionale
        // @CumparaturiInterface

        // Expresii lambda
        // parametru -> expresie ; pot fi cu sau fara acolade ()->{}
        CumparaturiInterface interfataFunctionala = new CumparaturiInterface() {
            @Override
            public void cumpara() {
                System.out.println("S-a apelat metoda cumpara()");
            }
        };

        interfataFunctionala.cumpara();

        ClasaCareImitaClasaAnonima obiectAnonim = new ClasaCareImitaClasaAnonima();
        obiectAnonim.cumpara();

        // ()->{}
        CumparaturiInterface cumparaturiInterface = () -> System.out.println("S-a apelat metoda cumpara() prin " +
                "lambda");

        cumparaturiInterface.cumpara();

        CumparaturiInterface cumparaturiInterface2 = () -> {
            System.out.println("S-a apelat metoda cumpara() prin lambda");
            System.out.println("Folosind acoladele pot sa scriu mai mult de un rand in expresii lamba");
        };

        // Create a generic method printArray which takes an array of any type and prints each element in the array.
        // Create a generic class Pair which can hold a key-value pair of any type. Implement getKey() and getValue()
        // methods to retrieve the key and value respectively.
        // public class Pair<K, V> {
            // private K key;
            // private V value;

        // Create an enum named Day that represents the days of the week. Include a method that will return whether
        // the day is a weekday or a weekend. Define a constructor to set this property for each day.
        // enum Day {
            // MONDAY(true),
            // private boolean isWeekEndDay;

        Day.LUNI.isWeekendDay();
        Day.SAMBATA.isWeekendDay();

        // lambda
        List<String> names = Arrays.asList("Ioana", "Mihai", "George");
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names);

        List<String> names2 = Arrays.asList("Andreea", "Bogdan", "Catalin");
        names2.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(names2);
    }
}