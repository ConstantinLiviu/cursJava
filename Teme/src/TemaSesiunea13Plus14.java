import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class TemaSesiunea13Plus14 {
    public static void main(String[] args) {
        // 1. Add 5 hours and 30 minutes to the current time and print it.
        LocalDateTime dataOraCurente = LocalDateTime.now();
        System.out.println(dataOraCurente.plusHours(5).plusMinutes(30));

        // 2. From a given LocalDateTime, extract the date and time and print them separately.
        System.out.println(dataOraCurente.format(DateTimeFormatter.ofPattern("dd-MM-yyy")));
        System.out.println(dataOraCurente.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // 3. Generate a random integer between 1 and 100.
        System.out.println((int) Math.floor(Math.random() *(100 - 1 + 1) + 1));

        // 4. Choose a random element from the array {"apple", "banana", "cherry", "date"}.
        String[] fructe = {"apple", "banana", "cherry", "date"};
        System.out.println(fructe[(int) Math.floor(Math.random() *4)]);

        // 5. Create an ArrayList and add 5 elements to it. Determine and print the size of the ArrayList.
        ArrayList<Integer> sirNumere = new ArrayList<>();
        Collections.addAll(sirNumere, 5,3,1,7,9);
        System.out.println(sirNumere.size());
    }
}
