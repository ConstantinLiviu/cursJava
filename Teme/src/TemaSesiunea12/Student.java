package TemaSesiunea12;

public class Student {
    // Clasa pentru TemaSesiunea12.TemaSesiunea12
    String nume;
    int varsta;

    Student(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    void displayStudentDetails() {
        System.out.println(nume + " - " + varsta);
    }
}
