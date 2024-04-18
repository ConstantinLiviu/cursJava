package TemaSesiunea23Plus24;

public class Main {
    public static void main(String[] args) {
        // Create a method that takes a Day enum as a parameter and uses a switch case statement to print a message
        // depending on the day input.

        DayHomework.MONDAY.dailyMessage(DayHomework.MONDAY.name());
        DayHomework.MONDAY.dailyMessage(DayHomework.FRIDAY.name());
        DayHomework.MONDAY.dailyMessage(DayHomework.SUNDAY.name());
    }
}
