package TemaSesiunea23Plus24;

public enum DayHomework {
    // Create a method that takes a Day enum as a parameter and uses a switch case statement to print a message
    // depending on the day input.
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dailyMessage(String dayParam) {
        switch (dayParam) {
            case "MONDAY" -> System.out.println("It's " + dayParam.toLowerCase().substring(0,1).toUpperCase() + dayParam.substring(1).toLowerCase());
            case "TUESDAY" -> System.out.println("It's " + dayParam.toLowerCase().substring(0,1).toUpperCase() + dayParam.substring(1).toLowerCase());
            case "WEDNESDAY" -> System.out.println("It's " + dayParam.toLowerCase().substring(0,1).toUpperCase() + dayParam.substring(1).toLowerCase());
            case "THURSDAY" -> System.out.println("It's " + dayParam.toLowerCase().substring(0,1).toUpperCase() + dayParam.substring(1).toLowerCase());
            case "FRIDAY" -> System.out.println("It's " + dayParam.toLowerCase().substring(0,1).toUpperCase() + dayParam.substring(1).toLowerCase());
            case "SATURDAY" -> System.out.println("It's " + dayParam.toLowerCase().substring(0,1).toUpperCase() + dayParam.substring(1).toLowerCase());
            case "SUNDAY" -> System.out.println("It's " + dayParam.toLowerCase().substring(0,1).toUpperCase() + dayParam.substring(1).toLowerCase());
            default -> System.out.println("Not a day of the week");
        }
    }
}
