import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contract contract = new Contract();
        // Accesul la o metoda statica e garantata prin apelarea clasei/obiectului; nu are rost rost apelarea pe obiectul instantiat
        // In cadrul metodelor/variabilelor statice avem acces la ele prin intermediul clasei; nu e necesara instantierea
        // contract.metodaContract();
        Contract.metodaContract();

        // -//-
        // contract.numarPagini;
        System.out.println(Contract.numarPagini);

        // ArrayList
        ArrayList arrayList1 = new ArrayList<>();

        // EXERCITII
        // 1. creare clase Bloc, Apartament, Masina.
        // V
        // 2. 4 proprietati pentru fiecare.
        // V
        // 3. creare getteri, setteri.
        // V
        // 4. creare 4 metode statice pentru fiecare clasa.
        // V
        // 5. creare 2 proprietati statice pentru fiecare clasa.
        // V
        // 6. creare 1 obiect pentru fiecare clasa cu proprietatile populate.
        Apartament sapte = new Apartament(7,3,3,1);
        Bloc a2 = new Bloc("a2", "Str. Plopilor", 52, 163);
        Masina logan = new Masina("logan", "rosie", 2017, 23000);
    }
}