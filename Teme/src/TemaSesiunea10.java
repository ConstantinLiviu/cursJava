import java.util.Scanner;

public class TemaSesiunea10 {
    public static void main(String[] args) {
        // -Create a Java program where you define an integer variable with a value between 1 and 7. Use a switch statement to print the name of the corresponding day of the week. For example, if the variable has a value of 1, it should print "Monday".

        Scanner userInput = new Scanner(System.in);
        System.out.println("Alegeti ziua saptamanii");
        String day = userInput.nextLine().toLowerCase();
        System.out.println("Ziua aleasa este: " + day);

        switch(day) {
            case "luni" -> System.out.println("Monday");
            case "marti" -> System.out.println("Tuesday");
            case "miercuri" -> System.out.println("Wednesday");
            case "joi" -> System.out.println("Thursday");
            case "vineri" -> System.out.println("Friday");
            case "sambata" -> System.out.println("Saturday");
            case "duminica" -> System.out.println("Sunday");
            default -> System.out.println("Nu este o zi a saptamanii");
        }

        //-Create a Java program that uses a while loop to find the sum of numbers from 1 to n, where n is a positive integer entered by the user.

        Scanner userNumber = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numar = userNumber.nextInt();
        System.out.println("Numarul introdus este: " + numar);

        int sum = 0;
        int index = 1;
        while (index<=numar) {
            sum+=index;
            index++;
            System.out.println("Suma este: "+ sum);
        }
        System.out.println("Totalul este: " + sum);

        //-Create a Java program that uses a do-while loop to print numbers from 10 to 1 in descending order.
        int printableNumber = 10;
         do {
             System.out.println(printableNumber);
             printableNumber--;
        } while (printableNumber>0);

        //-Create a Java program that uses a for loop to print even numbers from 2 to 20.
        for(int i=2; i<=20; i++) {
            System.out.println(i);
        }
    }
}
