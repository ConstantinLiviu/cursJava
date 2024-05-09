public class Main {
    public static void main(String[] args) {

        // Design a system where an Employee class has fields for name, position, and salary. Create methods to give a
        // raise, deduct taxes, and print an employee's yearly earnings.

        Employee ion = new Employee("Ion", "supervisor", 3580.75f);
        System.out.println(ion.getSalary());
        ion.raise(120.21f);
        System.out.println(ion.getSalary());
        ion.yearlyEarnings();
        ion.deductTaxes(0.1f);
        System.out.println(ion.getSalary());
        ion.yearlyEarnings();
    }
}