public class Main {
    public static void main(String[] args) {
        // instantiere obiecte, comparare obiecte
        Animal animalObiect = new Animal();

        Animal pisica = new Animal();
        Animal caine = new Animal();

        Animal soarece = pisica;

        System.out.println(pisica == soarece);
        System.out.println(caine == soarece);

        // if/else
        int numarMasini = 10;
        if (numarMasini == 10) {
            System.out.println("Ai 10 masini!");
        } else {
            System.out.println("Nu ai prea multe masini.");
        }

        // 1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println(stringOne == stringTwo);

        // 2. Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.
        int firstNumber = 5;
        int secondNumber = 7;
        System.out.println(firstNumber == secondNumber);

        String firstString = "abc";
        String secondString = "def";
        firstString.equals(secondString);

        // 3. Write a Java program that declares an integer variable age with a value of 20. Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".
        int age = 20;
        if (age > 18) {
            System.out.println("I am an adult");
        } else {
            System.out.println("I am not an adult");
        }

        // 4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
        int heightOne = 15;
        int heightTwo = 17;
        int maximumHeight = heightOne > heightTwo ? heightOne : heightTwo;
        System.out.println(maximumHeight);

        // 5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
        int temperature = 63;
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature>=20 && temperature <=30) {
            System.out.println("Warm");
        } else if (temperature<20) {
            System.out.println("Cold");
        }

        // 7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
        int sideOne = 7;
        int sideTwo = 9;
        int sideThree = 4;
        String equilateral = sideOne==sideTwo&&sideTwo==sideThree ? "echilateral": "not";
        String isosceles = sideOne==sideTwo || sideTwo==sideThree ? "isosceles": "not";
        String scalene = sideOne!=sideTwo&&sideTwo!=sideThree&&sideTwo!=sideThree ? "scalene": "not";

        if (equilateral!="not") {
            System.out.println(equilateral);
        } else if (isosceles!="not") {
            System.out.println(isosceles);
        } else if (scalene!="not") {
            System.out.println(scalene);
        }

        // 8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.
        int someNumber = 12;
        int someNumberFactorial=1;
        for(int i=1; i<=someNumber; i++) {
            someNumberFactorial*=i;
        }
        System.out.println(someNumberFactorial);

    }
}