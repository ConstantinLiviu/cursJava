import java.time.LocalDate;

public class TemaSesiunea12 {

    public static void main(String[] args) {
        // 1. Create a Java program that uses a StringBuilder to concatenate an array of strings. The program should print the final concatenated string. (methods: append())
        StringBuilder stringNou = new StringBuilder("Ana are");
        System.out.println(stringNou.append(" mere"));
        // 2. Create a class named Student with name and age fields. Write a method to display the details of a student.
        Student mircea = new Student("Mircea", 20);
        mircea.displayStudentDetails();
        // 3. Write a program that prints the current date.
        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);
        // 4. Print the date that will be after 10 days from today.
        System.out.println(dataCurenta.plusDays(10));

    }

}
