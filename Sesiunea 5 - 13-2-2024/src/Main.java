public class Main {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(3 + 6 * ++a);

        // Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        int length = 5;
        int width = 10;

        int rectangleArea = length * width;
        System.out.println(rectangleArea);

        // Write a program that reverses the sign of an entered integer using unary minus operator.
        int b = 10;
        int c = -b;
        System.out.println(c);

        // Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(!bool1);
        System.out.println(!bool2);

        // Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
        int increment = 1;
        ++increment;
        System.out.println(increment);
        ++increment;
        System.out.println(increment);
        ++increment;
        System.out.println(increment);

        int decrement = 10;
        --decrement;
        System.out.println(decrement);
        --decrement;
        System.out.println(decrement);
        --decrement;
        System.out.println(decrement);

        // Create a Java program that demonstrates the use of each compound assignment operator with integers.
        int aa = 2, bb = 3;
        int d = 5, e = 1, f = 19, g = 4;
        d *= aa;
        e += bb;
        f -= aa;
        g /= bb;

        //Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
        int pretIntreg = 150;
        double pretRedus = 150 - 150 * 0.3;
        System.out.println(pretRedus);

        // Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
        int firstNum = 5;
        int secondNum = 8;
        if (firstNum>secondNum) {
            System.out.println("Primul numar e mai mare");
        } else if (secondNum>firstNum) {
            System.out.println("Al doilea numar e mai mare");
        } else {
            System.out.println("Numerele sunt egale");
        }

        // Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.
        if (firstNum>=1 && firstNum<=100) {
            System.out.println("Numarul se afla in interval");
        }

    }
}