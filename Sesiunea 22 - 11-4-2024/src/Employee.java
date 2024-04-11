public class Employee {
    // Create a class named Employee with fields id, name, and department. Override the equals() and hashCode()
//        methods to establish equality based on the id field. Create a main method where you demonstrate that two
//        Employee objects with the same id are considered equal.

    int id;
    String name;
    String departament;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    public Employee(int idParam, String nameParam, String departamentParam) {
        this.id = idParam;
        this.name = nameParam;
        this.departament = departamentParam;
    }
}
