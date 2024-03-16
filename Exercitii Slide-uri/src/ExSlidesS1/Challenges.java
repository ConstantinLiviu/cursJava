package ExSlidesS1;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {
        // 1. Simple Output Program: Write a program that prints your name, age, and favorite color on three separate lines.
        System.out.println("My name is John");
        System.out.println("My age is 23");
        System.out.println("My favorite color is red");

        // 2. Using Variables: Write a program that defines four different variables (an integer, a double, a character, and a string), assigns them values, and then prints them out.
        int age = 89;
        double price = 17.98;
        char character = 'A';
        String word = "book";
        System.out.println(age + " " + price + " " + character + " " + word);

        // 3. Operations: Write a program that performs various operations (addition, subtraction, multiplication, division, and modulus) on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);

        // 4. Simple Input/Output: Write a program that asks the user to enter two numbers, performs addition on those numbers, and prints out the result.
        ArrayList<Integer> numereUtilizator = new ArrayList<>();
        while (numereUtilizator.size()<2) {
            Scanner numere = new Scanner(System.in);
            System.out.println("Introduceti un numar:");
            numereUtilizator.add(numere.nextInt());
        }
        int sum = 0;
        for(int numar : numereUtilizator) {
            sum += numar;
        }
        System.out.println("Suma numerelor este: " + sum);
    }
}
