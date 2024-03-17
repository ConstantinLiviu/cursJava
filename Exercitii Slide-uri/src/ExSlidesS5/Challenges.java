package ExSlidesS5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {
        // 1. Even or Odd Checker
        // Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd,
        // print "Odd".
        Scanner number = new Scanner(System.in);
        System.out.println("Input a number:");
        int oddOrEven = number.nextInt();
        if (oddOrEven%2==0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // 2. Month Name Finder
        // Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding
        // month or "Invalid Month" if out of range.
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December"};
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 12");
        int monthNumber = userChoice.nextInt();
        if(monthNumber<=0 || monthNumber >=13) {
            System.out.println("Invalid Month");
        } else {
            System.out.println("You've chosen " + months[monthNumber-1]);
        }

        // 3. Counting Negative Numbers
        // Given an array of integers, write a program to count and print the number of negative integers in the array.
        int[] numbers = {1,6,-2,0,115,-200, -19,7};
        int counter = 0;
        for(int negativeNumber: numbers) {
            if (negativeNumber<0) {
                counter++;
                System.out.println(negativeNumber + " is a negative number");
            }
        }

        // 4. String Reverser
        // Ask the user to enter a string. Print the reversed version of this string.
        Scanner userString = new Scanner(System.in);
        System.out.println("Input a word:");
        String toReverse = userString.next();
        StringBuilder reversed = new StringBuilder(toReverse).reverse();
        System.out.println(reversed);

        // 5. Fibonacci Series Generator
        // Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided
        // by the user.
        ArrayList<Integer> fibonacciSeq = new ArrayList<>();
        Collections.addAll(fibonacciSeq, 0, 1);
        Scanner userLimit = new Scanner(System.in);
        System.out.println("Input fibonacci limit:");
        int fibonacciLimit = userLimit.nextInt();

        for (int i=2; i<fibonacciLimit; i++) {
            fibonacciSeq.add(fibonacciSeq.get(fibonacciSeq.size()-1) + fibonacciSeq.get(fibonacciSeq.size()-2));
        }
        System.out.println("First " + fibonacciLimit + " numbers of the fibonacci series are: " + fibonacciSeq);

        // 6. While Loop
        // Write a program that asks the user to enter numbers. The program should continue prompting the user until
        // they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).
        Scanner userNumerbsList = new Scanner(System.in);
        System.out.println("Input numbers, make the last one -1:");
        ArrayList<Integer> usersNumbers = new ArrayList<>();
        usersNumbers.add(userNumerbsList.nextInt());
        while (!usersNumbers.contains(-1)) {
            System.out.println("Input numbers, make the last one -1:");
            usersNumbers.add(userNumerbsList.nextInt());
        }
        usersNumbers.remove(usersNumbers.size()-1);
        int sum = 0;
        for(int integers:usersNumbers) {
            sum+=integers;
        }
        System.out.println("The sum of all numbers entered is " + sum);

        // 7. Do-While Loop
        // Create a program where the user is prompted to guess a predefined number. After each guess, the program
        // should inform the user if the guess is too high or too low. The program should keep prompting the user until
        // they guess correctly. Using a do-while loop, ensure the user is always asked at least once.
        Scanner guessInput = new Scanner(System.in);
        System.out.println("Guess the number (1-20): ");
        int targetNumber = (int) Math.floor(Math.random()*20+1);
        System.out.println(targetNumber);
        int userGuess;
        do {
            userGuess = guessInput.nextInt();
            if (userGuess>targetNumber) {
                System.out.println("Too high, try again (1-20): ");
            } else if (userGuess<targetNumber) {
                System.out.println("Too low, try again (1-20): ");
            } else {
                System.out.println("Congrats! The number is " + targetNumber + " and you guessed it!");
            }
        } while (userGuess != targetNumber);

        // 8. For Loop
        // Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
        ArrayList<Integer> fiboList = new ArrayList<>();
        Collections.addAll(fiboList, 0,1);
        for(int i = 0; i<8; i++){
            fiboList.add(fiboList.get(fiboList.size()-1) + fiboList.get(fiboList.size()-2));
        }
        System.out.println(fiboList);

        // 9. For-Each Loop
        // Given an array of integers, write a program that prints each number in the array followed by "Even" if the
        // number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.
        int[] numbersArr = {1,2,3,4,5,6,7,8,9,10};
        for(int num: numbersArr) {
            if (num%2==0) {
                System.out.println(num + " - even");
            } else {
                System.out.println(num + " - odd");
            }
        }

        // 10. Jump Statements
        // Create a menu-driven program where the user is presented with options:

        // Print "Hello World"
        // Print the user's name.
        // Exit.

        // Based on the user's input, perform the necessary action. Once an action is completed, show the menu again,
        // unless the user chooses the Exit option. Use jump statements to control the flow of the program.
        Scanner userOptions = new Scanner(System.in);
        boolean notExit = true;

        do {
            System.out.println("Choose one from below by typing the text:");
            System.out.println("Print Hello World");
            System.out.println("Print user name");
            System.out.println("Exit");
            String userAnswer = userOptions.nextLine();

            if (userAnswer.equals("Exit")) notExit=false;

            switch (userAnswer) {
                case "Print Hello World" -> System.out.println("Hello World");
                case "Print user name" -> System.out.println("Mark");
                case "Exit" -> System.out.println("Exiting program");
                default -> System.out.println("Not a valid option, try again");
            }
        } while (notExit);

        // 11. Break Statement
        // Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user
        // enters 0, break out of the input loop and then print the average of the numbers entered so far.
        Scanner addNumbers = new Scanner(System.in);
        ArrayList<Integer> userNumbersArr = new ArrayList<>();

        do {
            System.out.println("Input a number:");
            int userNewNumber = addNumbers.nextInt();
            if (userNewNumber == 0) break;
            userNumbersArr.add(userNewNumber);
        } while (true);

        int sum2 = 0;
        for (int item : userNumbersArr) {
            sum2 += item;
        }
        System.out.println("The average is " + sum2 / userNumbersArr.size());

        // 12. Continue Statement
        // Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5.
        // If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that
        // number.
        Scanner addNumbers2 = new Scanner(System.in);
        ArrayList<Integer> userNumbersArr2 = new ArrayList<>();
        int sum3=0;

        while (userNumbersArr2.size()<10){
            System.out.println("Input a number: ");
            int toBeAdded = addNumbers2.nextInt();
            userNumbersArr2.add(toBeAdded);
            if(toBeAdded<=5) {
                continue;
            } else {
                System.out.println(toBeAdded);
                sum3+=toBeAdded;
            }
        }
        System.out.println("Total sum of numbers greater than 5 is: " + sum3);

        // 13. Pathfinding in a Maze
        // Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an
        // end. You have to find a path from the start to the end, moving only up, down, left, or right. You can't move
        // diagonally. If a path exists, print it; otherwise, inform the user that there's no solution.

        // The maze will be represented by a 2D array where:
        // 0 represents an open cell.
        // 1 represents a wall.
        // S represents the start.
        // E represents the end.

        // Example:
        // S 1 0 1
        // 0 1 0 1
        // 0 1 0 1
        // 1 0 0 E

        // Problem Tasks:
        // Read the maze layout from a file or hard-code it into your program.
        // Implement a pathfinding algorithm to navigate from the start to the end.
        // If a path is found, print the maze with the path. You can represent the path with a *.
        // If no path exists, print "No solution found."
        // Hints:
        // Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
        // You might want to represent the maze using a class with methods to detect neighbors, check for walls, etc.

    }
}
