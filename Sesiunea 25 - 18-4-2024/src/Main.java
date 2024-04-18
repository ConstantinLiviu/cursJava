import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Lambda:
        // Create a functional interface named Calculator that has a single method named calculate which takes two
        // integers as parameters and returns an integer. Implement this interface using a lambda expression in a way
        // that it performs addition of the two parameters.

        Calculator suma = (a,b) -> a+b;
        System.out.println(suma.sum(3,5));

        // differences and similarities between lambda expressions and anonymous classes. Create a functional
        // interface named GreetingService with a single method greet which takes a String parameter and returns void.
        // Implement this interface first using an anonymous class and then using a lambda expression.

        GreetingService greetingAnon = new GreetingService() {
            @Override
            public void greeting(String greetingParam) {
                System.out.println("Hello, " + greetingParam + "!");
            }
        };

        GreetingService greetingLambda = (a) -> System.out.println("Hello, " + a + "!");

        greetingAnon.greeting("Mihai");
        greetingLambda.greeting("Ion");

        // For this problem, you need to explore predefined functional interfaces in Java. Utilize Function<T,R>
        // interface from java.util.function package to create a lambda expression that takes a string as input and
        // returns its length.

        // Lambda expression to calculate the length of a string
        Function<String, Integer> stringLength = str -> str.length();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduceti text:");
        String string = userInput.nextLine();
        userInput.close();
        System.out.println(stringLength.apply(string));
    }
}