import java.util.Scanner;
public class TemaSesiunea5 {
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
        if (firstNum > secondNum) {
            System.out.println("Primul numar e mai mare");
        } else if (secondNum > firstNum) {
            System.out.println("Al doilea numar e mai mare");
        } else {
            System.out.println("Numerele sunt egale");
        }

        // Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.
        if (firstNum >= 1 && firstNum <= 100) {
            System.out.println("Numarul se afla in interval");
        }

        // Write a program where you perform operations between an integer and a double. Display the result and discuss why it is in that format (due to Numeric Promotion).
        int integer = 6;
        double number = 3.5;
        System.out.println(integer-number);
        // Rezultatul este de tipul "double" asa ca variabila integer va fi convertita in tip "double"


        // Create a program that takes two byte values, adds them together, and stores the result in a byte variable. Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.
        byte newByte = 5;
        byte newByte2 = 7;
//        byte sum = (byte) (newByte+newByte2);


        // 5. Create a Java program that demonstrates the use of each compound assignment operator with integers.
        int numar = 1, numar2 = 2, numar3 = 3, numar4 = 4, numar5 = 5, numar6 = 6;
        numar2 += numar;
        numar3 -= numar;
        numar4 *= numar;
        numar5 /= numar;
        numar6 %= numar;
        System.out.println(numar + " " + numar2 + " " + numar3 + " " + numar4 + " " + numar5 + " " + numar6);

        // 6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
        Scanner primulNumar = new Scanner(System.in);
        System.out.println("Introdu primul numar");
        String a1 = primulNumar.nextLine();

        Scanner alDoileaNumar = new Scanner(System.in);
        System.out.println("Introdu al doilea numar");
        String a2 = primulNumar.nextLine();

        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);

        if (b1>b2) {
            System.out.println("Primul numar e mai mare");
        } else if (b1<b2) {
            System.out.println("Al doilea numar e mai mare");
        } else {
            System.out.println("Numerele sunt egale");
        }

        // 7. Write a program where you perform operations between an integer and a double. Display the result.
        int c1 = 5;
        double c2 = 9;
        System.out.println(c1+c2);
        System.out.println(c1-c2);
        System.out.println(c1*c2);
        System.out.println(c1/c2);

        // 8. Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
//        Scanner primulByte = new Scanner(System.in);
//        System.out.println("Introdu primul numar");
//        String byte1 = primulByte.nextLine();
//
//        Scanner alDoileaByte = new Scanner(System.in);
//        System.out.println("Introdu al doilea numar");
//        String byte2 = alDoileaByte.nextLine();
//
//        byte[] newByte3 = byte1.getBytes();
//        byte[] newByte4 = byte2.getBytes();

        // 9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        Scanner lungime = new Scanner(System.in);
        System.out.println("Introdu lungime dreptunghi");
        String lungimeStr = primulNumar.nextLine();

        Scanner latime = new Scanner(System.in);
        System.out.println("Introdu latime dreptunghi");
        String latimeStr = primulNumar.nextLine();

        int valoareLungime = Integer.parseInt(lungimeStr);
        int valoareLatime = Integer.parseInt(latimeStr);

        int arieDreptunghi = valoareLungime * valoareLatime;
        System.out.println(arieDreptunghi);

        // 10. Write a program that reverses the sign of an entered integer using unary minus operator.
        Scanner numarDeInversat = new Scanner(System.in);
        System.out.println("Introdu numar pentru inversare");
        String numarDeInversatStr = primulNumar.nextLine();

        int nrDeInversat = Integer.parseInt(lungimeStr);
        System.out.println(-nrDeInversat);

        // 11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.


    }
}
