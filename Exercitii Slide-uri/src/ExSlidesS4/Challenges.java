package ExSlidesS4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {
        // 1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value
        // "OpenAI". Check and print whether they refer to the same object.
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println(stringOne == stringTwo);


        // 2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use
        // an equality operator to compare these two numbers and print the result. Do the same for two String objects
        // firstString and secondString with the same value, but use the equals() method for comparison. Print the
        // result.
        int firstNumber = 5;
        int secondNumber = 7;
        System.out.println(firstNumber == secondNumber);
        System.out.println(stringOne.equals(stringTwo));

        // 3. Write a Java program that declares an integer variable age with a value of 20. Print a statement saying
        // "I am adult" if age is 18 or more, else print "I am not an adult".
        int age = 20;
        System.out.println(age > 18 ? "I am an adult" : "I am not an adult");

        // 4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use
        // a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the
        // result.
        int heightOne = 12;
        int heightTwo = 7;
        int maximumHeight = heightOne > heightTwo ? heightOne : heightTwo;
        System.out.println("Max height is " + maximumHeight);

        // 5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your
        // program to print only the even numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print
        // "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's
        // less than 20.
        int temperature = 32;
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }

        // 7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables
        // sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine
        // and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input first side length:");
        int sideOne = userInput.nextInt();
        System.out.println("Input second side length:");
        int sideTwo = userInput.nextInt();
        System.out.println("Input third side length:");
        int sideThree = userInput.nextInt();

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ?
                "Equilateral" :
                (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne) ? "Isosceles" : "Scalene";

        System.out.println(triangleType);

        // 8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable
        // number and assign a value to it. Then calculate and print the factorial of number.
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Input a number:");
        int userFactorialNumber = userNumber.nextInt();
        int result = 1;
        for (int i = 1; i <= userFactorialNumber; i++) {
            result *= i;
        }
        System.out.println(result);

        // 9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with
        // the value "USA". Check if countryOne and countryTwo are equal using the equals() method and print the result.
        // Then change the value of countryTwo to "UK" and check for equality again. Print the result.
        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println(countryOne.equals(countryTwo));
        countryTwo = "UK";
        System.out.println(countryOne.equals(countryTwo));

        // 10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements
        // to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and
        // observe the output.
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        Collections.addAll(listOne, 1, 6, 3, 7, 9);
        listTwo = listOne;
        listOne.add(11);
        System.out.println(listOne);
        System.out.println(listTwo);

        // 11. Write a Java program where you declare four integer variables: a, b, c, and d. Assign them values of 10,
        // 20, 30, and 40 respectively. Create two more variables additionResult and multiplicationResult. Set
        // additionResult to the sum of a and b and multiplicationResult to the product of c and d. Print the values of
        // additionResult and multiplicationResult.
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int additionResult = a + b;
        int multiplicationResult = c * d;
        System.out.println(additionResult + " " + multiplicationResult);

        // 12. Write a Java program where you declare an integer variable number with a value of 25. Use unary minus
        // operator to change the sign of number and assign it to a variable negativeNumber. Print the values of number
        // and negativeNumber.
        int aValue = 25;
        int negativeNumber = -aValue;
        System.out.println(aValue + " " + negativeNumber);

        // 13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true
        // and false, respectively. Use the logical complement operator to negate the values of both variables and
        // print the new values.
        boolean isRaining = true;
        boolean isSunny = false;
        isRaining = !isRaining;
        isSunny = !isSunny;
        System.out.println(isRaining + " " + isSunny);

        // 14. Write a Java program where you declare an integer variable counter with a value of 0. Use the
        // increment operator to increase the value of counter by 1 and then print the value. After that, use the
        // decrement operator to decrease the value of counter by 1 and then print the value.
        int counter = 0;
        System.out.println(++counter);
        System.out.println(--counter);

        // 15. Write a Java program where you declare an integer variable total with a value of 100. Use the compound
        // assignment operator to decrease the total by 20 and then print the value. Next, use another compound
        // assignment operator to multiply the total by 2 and then print the value.
        int aValue2 = 100;
        aValue2 -= 20;
        System.out.println(aValue2);
        aValue2 *= 2;
        System.out.println(aValue2);

        // 16. Write a Java program where you use unary operators to perform a series of transformations on an
        // integer variable number initialized to 50. First, negate number, then take the absolute value, and finally
        // increment it by 1. Print the result at each step.
        int initialValue = 50;
        initialValue = -initialValue;
        System.out.println("Negate the number: " + initialValue);
        initialValue = initialValue > 0 ? initialValue : -initialValue;
        System.out.println("Absolute value of a number: " + initialValue);
        initialValue++;
        System.out.println(initialValue);

        // 17. Write a Java program that simulates a simple authentication system. Declare a boolean variable
        // hasUsername and hasPassword. Set up a series of logical conditions using these two variables that will
        // check the following conditions:
        boolean hasUsername = true;
        boolean hasPassword = false;

        // If both hasUsername and hasPassword are true, print "Authentication successful".
        if (hasUsername && hasPassword) {
            System.out.println("Authentification successful");
        }
        // If either hasUsername or hasPassword is false, print "Authentication failed".
        else if (!hasUsername || !hasPassword) {
            System.out.println("Authentication failed");
        }
        // If hasUsername is true but hasPassword is false, print "Password is incorrect".

        // Based on the exercise parameters, there is no case that would reach this part of the code block
        // IRL it would be recommended to either turn it into the first else if or set separately as an if block
        else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }

        // 18. Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize
        // the array such that each element is equal to its index incremented by 1. Then use another for loop to
        // decrement each element by 1. Print the array before and after the decrement operation using a for-each loop.
        int[] numbersList = new int[5];
        for (int i = 0; i < numbersList.length; i++) {
            numbersList[i] = i + 1;
        }
        for (int number : numbersList) {
            System.out.println(number);
        }
        for (int i = 0; i < numbersList.length; i++) {
            numbersList[i] = i - 1;
        }
        for (int number : numbersList) {
            System.out.println(number);
        }

        // 19. Write a Java program that takes an integer variable age as input. Use a ternary operator to classify
        // the person into one of the following categories: "Child" (age < 12), "Teenager" (age between 12 and 17),
        // "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print the resulting classification.
        Scanner userAgeInput = new Scanner(System.in);
        System.out.println("Input age:");
        int userAge = userAgeInput.nextInt();
        String category = userAge < 12 ? "Child" : (userAge >= 12 && userAge <= 17) ? "Teenager" :
                (userAge >= 18 && userAge <= 64) ? "Adult" : "Senior";
        System.out.println(category);

        // 20. Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary
        // operators to find and print the largest number among the three.
        Scanner numbers = new Scanner(System.in);
        System.out.println("Input first number:");
        int numberA = numbers.nextInt();
        System.out.println("Input second number:");
        int numberB = numbers.nextInt();
        System.out.println("Input third number:");
        int numberC = numbers.nextInt();
        int greatestNumber = (numberA > numberB) ? ((numberA > numberC) ? numberA : numberC) : ((numberB > numberC) ?
                numberB :
                numberC);

        // 21. Write a Java program that takes a double variable score representing a student’s score on a test. Use
        // a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following
        // scale:

        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59

        Scanner gradeInput = new Scanner(System.in);
        System.out.println("Input student grade:");
        int studentGrade = gradeInput.nextInt();
        char letterGrade = studentGrade >= 90 ? 'A' :
                           studentGrade >= 80 ? 'B' :
                           studentGrade >= 70 ? 'C' :
                           studentGrade >= 60 ? 'D' : 'F';

        // Print the resulting letter grade.
        System.out.println(letterGrade);
    }
}