public class Employee {
    // Design a system where an Employee class has fields for name, position, and salary. Create methods to give a
    // raise, deduct taxes, and print an employee's yearly earnings.
    String name;
    String position;
    float salary;

    public Employee(String name, String position, float salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void raise(float raiseParam) {
        this.salary += raiseParam;
    }

    public void deductTaxes(float percentageParam) {
        this.salary = this.salary + this.salary*percentageParam;
    }

    public void yearlyEarnings() {
        System.out.println(this.name + "'s yearly earnings amount to " + (this.salary*12));
    }

    public float getSalary() {
        return salary;
    }
}
