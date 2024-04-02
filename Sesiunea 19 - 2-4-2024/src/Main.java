import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Clasa ArrayList implements List
        // Un array list accepta multiple tipuri de elemente
        List<String> numeCursanti1 = new ArrayList<>();


        // how to use enums
        Contract contractNou = new Contract("1", "ContractNume1", StariContractEnum.semnat);


        if (StariContractEnum.semnat.name().equals("semnt")) {
            System.out.println("Contract semnat");
        } else {
            System.out.println("Enum element is not available");
        }


//        Description:
//        Design a Geometry class. This class should have multiple methods named area.
//
//        1.	One that takes the radius of a circle and returns its area.
//        2.	Another that takes the base and height of a triangle and returns its area.
//        3.	One more that takes the length and breadth of a rectangle and returns its area.

        Geometry newAreas = new Geometry();
        System.out.println(newAreas.area(5));
        System.out.println(newAreas.area(8,3));
        System.out.println(newAreas.area(5,9));
//
//        Description:
//        Create a class Animal with a method sound that returns a general message "Animal makes a sound". Create
//        another class Dog that inherits from Animal and overrides the sound method to return the message "Dog barks".

        Dog azorel = new Dog();
        azorel.sound();

//        Description:
//        Create a superclass named Fruit with a method taste that returns "Fruit has a taste". Derive two subclasses:
//        Apple and Orange. The Apple class should override the taste method to return "Apple is sweet", while the
//        Orange class should return "Orange is tangy
//
        Apple newApple = new Apple();
        Orange newOrange = new Orange();

        newApple.taste();
        newOrange.taste();
    }
}