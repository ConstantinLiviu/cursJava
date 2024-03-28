public class Main {
    public static void main(String[] args) {
        // Polymorphism
        // exista 2 tipuri de polymorphism:
        // overloading

        ClasaPrincipala clasaSecundara = new ClasaSecundara();
        clasaSecundara.metodaClasei();

        ClasaSecundara obj2 = new ClasaSecundara();
        obj2.metodaClasei();

        // EXE
        // Problem Statement:
        // Design a class named Circle that contains:

        // A private double data field named radius that specifies the radius of the circle. The default value is 1.
        // A no-arg constructor that creates a default circle.
                // A constructor that creates a circle with the specified radius.
                // A method named getArea() that returns the area of this circle.
                // A method named getCircumference() that returns the circumference of the circle.

        // Description:
        // Create a class named Calculator. This class should have three methods with the name add.

        // 1.	One method should take two integer parameters and return their sum.
        // 2.	Another should take three integer parameters and return their sum.
        // 3.	The last one should take two double parameters and return their sum.

        Circle cerc = new Circle();
        Calculator calculator = new Calculator();
        System.out.println(cerc.getArea(15));

        System.out.println(calculator.addTwoNumbers(1,5));
        System.out.println(calculator.addThreeNumbers(2, 9, 16));
        System.out.println(calculator.addDoubles(5.42, 1.11));
    }
}