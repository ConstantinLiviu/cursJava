public enum Day {
    LUNI(false),
    MARTI(false),
    MIERCURI(false),
    JOI(false),
    VINERI(false),
    SAMBATA(true),
    DUMINICA(true);

    private boolean isWeekend;

    Day(boolean isWeekendParam){
        this.isWeekend = isWeekendParam;
    }

    public boolean isWeekendDay() {
        if (!isWeekend) {
            System.out.println("Este zi lucratoare");
        } else {
            System.out.println("Este zi de weekend");
        }
        return isWeekend;
    }
}
