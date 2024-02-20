public class TemaSesiunea6 {
    public static void main(String[] args) {
        // 1. Create a Java program where you define an integer variable with a value of 5. Use an if statement to check if the number is greater than 10. If it is, print "The number is greater than 10"; otherwise, print "The number is not greater than 10".
        int a = 5;
        if(a>10) {
            System.out.println("The number is greater than 10");
        } else {
            System.out.println("The number is not greater than 10");
        }

        // 2. Create a program that defines a string variable with a value of "Hello". Use nested if statements to first check if the length of the string is greater than 5. If it is not, check if the string equals "Hello" and print the appropriate message in each case.
        String cuvant = "Hello";
        if (cuvant.length()>5) {
            System.out.println("Cuvantul are mai mult de 5 litere");
        } else if (cuvant == "Hello") {
            System.out.println("Cuvantul e 'Hello'");
        }

        //3. Create a Java program where you define an integer variable with a value of 75. Use an if-else-if ladder to check the range in which the number falls. Use the ranges 0-50, 51-100, and 101-150, and print a message for each range specifying which range the number falls into.
        int b = 75;
        if(b>=0 && b<=50) {
            System.out.println("Numarul se află în intervalul 0-50");
        } else if (b>=51 && b<=100) {
            System.out.println("Numarul se află în intervalul 51-100");
        } else if (b>=101 && b<=150) {
            System.out.println("Numarul se află în intervalul 101-150");
        }
    }

}
