@FunctionalInterface
public interface ConditionalPrinter {

    void print(String stringParam, Boolean blooleanParam);

    // Create a functional interface named ConditionalPrinter that has a single method named print which takes a
    // String and a boolean as parameters and returns void. Implement this interface using a lambda expression
    // that prints the string to the console only if the boolean parameter is true.
}
