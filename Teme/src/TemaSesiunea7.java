import java.util.Scanner;

public class TemaSesiunea7 {
    public static void main(String[] args) {
// 1. Create a simple program that takes a number as input and uses if-else statements to categorize the number as "positive," "negative," or "zero."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarUtilizator = scanner.nextInt();
        System.out.println("Numarul introdus este: " + numarUtilizator);

        if (numarUtilizator == 0) {
            System.out.println("zero");
        } else if (numarUtilizator>0) {
            System.out.println("pozitive");
        } else {
            System.out.println("negative");
        }
// 2. Create a program that takes a number as input and uses if statement to print whether the number is "positive" or "non-positive".
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarUtilizator2 = scanner.nextInt();
        System.out.println("Numarul introdus este: " + numarUtilizator);

        if (numarUtilizator2 > 0) {
            System.out.println("positive");
        } else {
            System.out.println("non-positive");
        }
// 3. Create a program that takes three numbers as input and print the largest number among them.
        Scanner scanner3 = new Scanner(System.in);
        int numere[] = new int[3];

        for (int i = 0; i < numere.length; i++) {
            System.out.println("Introduceti un numar:");
            numere[i] = scanner3.nextInt();
        }
        int max = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] > max) {
                max = numere[i];
            }
        }

        System.out.println("Cel mai mare numar este " + max);

// 4. Challenge 17 ->slide 04
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Exista username?(true/false):");
        boolean hasUsername = scanner4.nextBoolean();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Exista parola?(true/false):");
        boolean hasPassword = scanner5.nextBoolean();

        if (hasUsername == true && hasPassword == true) {
            System.out.println("Authentication successful");
        } else if (hasUsername == true && hasPassword == false) {
            System.out.println("Password is incorrect");
        } else if (hasUsername == false || hasPassword == false) {
            System.out.println("Authentication failed");
        }
    }
}
