import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // String methods

        String denumireFirma = "Curs.Inc";
        denumireFirma = "Altadenumire.Inc";

        // String Builder
        StringBuilder denumireContract = new StringBuilder("Contract studii");
        denumireContract.append(" de anul acesta");
        System.out.println(denumireContract);

        // Append
        denumireContract.append(" +1");
        System.out.println(denumireContract);

        // indexOf
        System.out.println(denumireContract.indexOf("c"));
        // Substring
        System.out.println(denumireContract.substring(0, 3));
        // Insert
        System.out.println(denumireContract.insert(1, 3));
        // System.out.println(denumireContract.insert(1,"sarmale"));

        System.out.println(denumireContract);

        // delete
        System.out.println(denumireContract.delete(0, 8));
        // deleteCharAt
        System.out.println(denumireContract.deleteCharAt(5));
        // reverse
        System.out.println(denumireContract.reverse());
        // toString
        int a=5;
        System.out.println(Integer.toString(a));
        // valueOf
        double sumaContract = 100.22;
        int sumaConstractIntreg = 100;
        String sumaContractString = String.valueOf(sumaContract);
        System.out.println(sumaContractString);

        System.out.println();

        // Local Date/time
        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);

        LocalDateTime momentulCurent = LocalDateTime.now();

        LocalDate dataDeIeri = LocalDate.of(2024,3,4);
        System.out.println(dataDeIeri);

        LocalDateTime momentulDeIeri=LocalDateTime.of(2024,3,4,7,23);

        System.out.println(LocalDate.now().minusDays(1));
        LocalDateTime momentulDeIeri2 = LocalDateTime.of(2024,3,4,10,40,50);
        System.out.println(momentulDeIeri.format(DateTimeFormatter.ofPattern("dd-MM-yyy hh:mm:ss")));




        // EXERCITII
        // 1. Create a Java program that replaces all occurrences of a specified character in a given string with another character and prints the new string.
        String testString = "Aceasta floare este o clasa";
        String stringModificat = testString.replace("a", "4");
        System.out.println(stringModificat);

        // 2. Create a Java program that removes the leading and trailing spaces from a given string and prints the new string.
        String untrimmed = "   +- Un string cu prea multe spatii -+     ";
        System.out.println(untrimmed.trim());
        System.out.println(" ");
        // 3. OOP:
        //-crearea a 2 clase: Fruct, Leguma.
        //-crearea a 4 proprietati pentru fiecare,
        //-2 metode in clasa Fruct care vor afisa "Am rulat metoda+denumirea_metodei"
        //-creare getteri pentru 2 proprietati ale clasei Fruct

        Fruct mar = new Fruct("verde", true, "mar", 8);
        mar.eCopt();
        mar.marimeFruct();

        Leguma cartof = new Leguma("cartof", 6.85,"Ferma Soarelui", 85);
        cartof.afiseazaPret();
        cartof.numeProducator();

    }
}