import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Random
        Random aleatoriu = new Random();
        System.out.println(aleatoriu.nextInt(1,10));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti un numar:");
//        int numarUtilizator = scanner.nextInt();
//        System.out.println("Numarul primit este: " + numarUtilizator);

        // Math.function()
        int celMaiMareDintre = Math.max(1,30);
        System.out.println(celMaiMareDintre);

        // ARRAYS
        // acelasi tip de date DOAR!
        // Array numere intregi
        int[] arrayNou = new int[]{10,20,30};
        int numarElemente= arrayNou.length;
        System.out.println(numarElemente);
        // Array stringuri
        String[] listaFructe = new String[]{"mere", "pere"};
        System.out.println(listaFructe[1]);
        // Iterare array pe baza indexului:
        for (int i=0; i<listaFructe.length; i++) {
            System.out.println(listaFructe[i]);
        }
        // Iterarea elementelor in sine:
        for (String fruct:listaFructe) {
            System.out.println(fruct);
        }
        // Copiere array
        String[] listaFructeCopie = Arrays.copyOfRange(listaFructe, 0, 3);
        for(String copieFruct:listaFructeCopie) {
            System.out.println(copieFruct);
        }

        // Array multidimensional
        int[][] numarElementeMatrice = {{1,3}, {3,4}, {5,2}};

        // Sortare elemente array
        Arrays.sort(listaFructe);
        for(String fruct:listaFructe) {
            System.out.println(fruct);
        }

        // EXERCITII:

        // 1. Write a program that prints the current date and time.
        LocalDateTime dataSiOraCurente = LocalDateTime.now();
        System.out.println(dataSiOraCurente.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));

        // 2. Add 5 hours and 30 minutes to the current time and print it.
        System.out.println(dataSiOraCurente.plusHours(5).plusMinutes(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));

        // 3. From a given LocalDateTime, extract the date and time and print them separately.(methods: toLocalDate(), toLocalTime())
        System.out.println(dataSiOraCurente.toLocalDate());
        System.out.println(dataSiOraCurente.toLocalTime());

        // 4. Check if a given date-time is before or after the current date-time.(methods: LocalDateTime.of(), isBefore() )
        LocalDateTime dataSiOraDate = LocalDateTime.of(2024,3,4,7,23);
        System.out.println(dataSiOraDate.isBefore(dataSiOraCurente));

        // 5. Convert a string representing date-time in the format yyyy-MM-dd HH:mm to LocalDateTime.
        String stringDataOra = "2020-10-15 10:20";
        DateTimeFormatter formatareString = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dataOraFormatate = LocalDateTime.parse(stringDataOra, formatareString);
        System.out.println(dataOraFormatate);

        // 6. Generate a random integer between 1 and 300.
        Random numarAleatoriu = new Random();
        System.out.println(aleatoriu.nextInt(1,301));

    }
}