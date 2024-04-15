public class Employee {
    public String nume;
    public int id;
    public float salariu;

    public Employee(String nume, int id, float salariu) {
        this.nume = nume;
        this.id = id;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Employee: nume= " + nume + "; id= " + id + "; salariu= " + salariu;
    }

}
