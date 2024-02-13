public class TemaSesiunea4 {
    public static void main(String []args) {
        // 1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        int x = 4;
        int y = 2;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        // 2. Create a Java program where you a and decrement the same variable. Display the value of the variable after each operation.
        int a = 1;
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        a--;
        System.out.println(a);
        a--;
        System.out.println(a);

        // 3. Write a program to check if a number is positive or negative using logical complement operator.
        int b = 7;
        if (b>0) {
            System.out.println("Numarul este pozitiv");
        } else if (b<0) {
            System.out.println("Numarul este negativ");
        } else {
            System.out.println("Numarul este 0");
        }

        // 4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
        int numaratoare = 1;
        while (numaratoare<10) {
            System.out.println(numaratoare);
            numaratoare++;

        }
        System.out.println(numaratoare);

        while(numaratoare>=1) {
            System.out.println(numaratoare);
            numaratoare--;
        }
    }
}
