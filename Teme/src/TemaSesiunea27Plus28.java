import java.time.LocalDate;

public class TemaSesiunea27Plus28 {
    // Using Java's built-in date/time libraries, generate a list of all Mondays in the upcoming year. Print out each
    // Monday's date.
    public static void main(String[] args) {
        // get years interval
        int upcomingYear = LocalDate.now().getYear() +1;
        int maxYear = upcomingYear+1;

        // get name of day and turn it to string
        LocalDate first = LocalDate.of(upcomingYear, 1, 1);
        String firstMonday = first.getDayOfWeek().toString();

        // find first "Monday" in the year
        while (firstMonday != "MONDAY") {
            first = first.plusDays(1);
            firstMonday = first.getDayOfWeek().toString();
        }

        // find each additional "Monday" prior to the year changing
        while (upcomingYear<maxYear) {
            System.out.println(first.getDayOfWeek().toString() + ", " + first);
            first = first.plusDays(7);
            upcomingYear = first.getYear();
        }
    }
}
