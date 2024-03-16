package ExSlidesS3;

import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {
        // I. Binary Arithmetic Operators:
        // 1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        int a = 2;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double) a/b);
        System.out.println(b%a);

        // 2. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        double length = 12.3;
        double width = 5.7;
        System.out.println("Rectangle area is " + length*width + "cm2");

        // II. Unary Operators:
        // 1. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
        int number = 20;
        System.out.println(++number);
        System.out.println(++number);
        System.out.println(++number);
        System.out.println(--number);
        System.out.println(--number);
        // 2. Write a program that reverses the sign of an entered integer using unary minus operator.
        int inverseNumber = 10;
        System.out.println(-inverseNumber);

        // III. Logical Complement and Negation Operators:
        // 1. Write a program to check if a number is positive or negative using logical complement operator.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        System.out.println(userNumber);

        if (!(userNumber > 0)) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero or positive.");
        }


        // 2. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
        Scanner userBool = new Scanner(System.in);
        System.out.println("Write true or false:");
        boolean userChoice = userBool.nextBoolean();
        System.out.println("Write true or false:");
        boolean userChoice2 = userBool.nextBoolean();
        System.out.println(!userChoice + " " + !userChoice2);

        // IV. Increment and Decrement Operators:
        // 1. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
        int increment = 1;
        for(int i=1; i<=10; i++) {
            increment++;
        }
        for(int i=increment; i>=1; i--) {
            increment--;
        }

        // 2. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
        Scanner userDouble = new Scanner(System.in);
        System.out.println("Input a number:");
        double changeNumber = userDouble.nextDouble();
        System.out.println("Your number is: " + changeNumber);
        double increment1 = ++changeNumber;
        System.out.println("Increment is " + increment1);
        System.out.println("New number is " + increment1);
        double decrement1 = --changeNumber;
        System.out.println("Decrement is " + decrement1);
        System.out.println("Final number is " + decrement1);

        // V. Assignment and Compound Assignment Operators:
        // 1. Create a Java program that demonstrates the use of each compound assignment operator with integers.
        int numar = 3, numar2 = 2, numar3 = 3, numar4 = 4, numar5 = 5, numar6 = 6;
        numar2 += numar;
        numar3 -= numar;
        numar4 *= numar;
        numar5 /= numar;
        numar6 %= numar;
        System.out.println(" ");
        System.out.println(numar + " " + numar2 + " " + numar3 + " " + numar4 + " " + numar5 + " " + numar6);

        // 2. Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
        Scanner price = new Scanner(System.in);
        System.out.println("Input the price:");
        double userPrice = price.nextDouble();
        Scanner discount = new Scanner(System.in);
        System.out.println("Input the discount (percentage): ");
        double userDiscount = discount.nextDouble()/100;
        System.out.println("Discounted price is " + (userPrice - userPrice*userDiscount));

        // VI. Relational Operators:
        // 1. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
        Scanner userNumbers = new Scanner(System.in);
        System.out.println("Input first number");
        double firstUserNumber = userNumbers.nextDouble();
        System.out.println("Input second number");
        double secondUserNumber = userNumbers.nextDouble();
        if (firstUserNumber> secondUserNumber) {
            System.out.println("First number is greater");
        } else if (firstUserNumber == secondUserNumber) {
            System.out.println("Equal numbers");
        } else {
            System.out.println("Second number is greater");
        }

        // 2. Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.
        Scanner checkUserNumber = new Scanner(System.in);
        System.out.println("Input a number: ");
        double numberToCheck = checkUserNumber.nextDouble();
        if(numberToCheck>= 1 && numberToCheck<=100) {
            System.out.println("Number is in range");
        } else {
            System.out.println("Number is out of range");
        }

        // VII. Numeric Promotion:
        // 1. Write a program where you perform operations between an integer and a double. Display the result and discuss why it is in that format (due to Numeric Promotion).
        int testInt = 6;
        double testDouble = 12.6;
        System.out.println(testInt + testDouble);
        // to perform the operation java converts the int to a temporary double variable

        // 2. Create a program that takes two byte values, adds them together, and stores the result in a byte variable. Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.
        byte testByte = 23;
        byte testByte2 = 11;
        int byteSum = testByte+testByte2;
        byteSum = (byte) byteSum;
        // as java performs the operation, both byte types are expanded to int types. To get back a byte value we need to cast it to a byte type

    }
}
