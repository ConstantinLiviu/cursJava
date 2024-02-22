public class TemaSesiunea8 {
    public static void main(String[] args) {
        // 1. Create a program that defines a string variable with a value of "Hello". Use nested if statements to first check if the length of the string is greater than 5. If it is not, check if the string equals "Hello" and print the appropriate message in each case.
        String cuvant = "Hello";
        if (cuvant.length() > 5) {
            System.out.println("Cuvantul are cinci litere");
        } else if (cuvant == "Hello") {
            System.out.println("Cuvantul este 'Hello'");
        }
        // 2. Create a Java program where you define a char variable with a value of 'A'. Use a switch statement to print a message for the values 'A', 'B', and 'C'. For 'A', print "Excellent"; for 'B', print "Good"; for 'C', print "Average".
        char litera = 'A';
        switch (litera) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            default -> System.out.println("Input invalid");
        }
        // 3. Create a program that defines a string variable with a value of "Winter". Use a switch statement to print a message for each season ("Winter", "Spring", "Summer", "Autumn"). For "Winter", print "It's cold"; for "Spring", print "Flowers bloom"; for "Summer", print "It's hot"; for "Autumn", print "Leaves fall".
        String anotimp = "Winter";
        switch (anotimp) {
        // For "Winter", print "It's cold"; for "Spring", print "Flowers bloom"; for "Summer", print "It's hot"; for "Autumn", print "Leaves fall".
            case "Winter" -> System.out.println("It's cold");
            case "Spring" -> System.out.println("Flowers bloom");
            case "Summer" -> System.out.println("Autumn");
            case "Autumn" -> System.out.println("Leaves fall");
            default -> System.out.println("Nu e un anotimp");
        }
    }
}
