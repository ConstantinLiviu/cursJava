import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Mamifer mamifer = new Mamifer();
        mamifer.mananca();

        // EXE:
        // 1. Create a contact list application where you can add, remove, and search for contacts by name.
        ArrayList<Contact> agendaTel = new ArrayList<>();
        Contact george = new Contact("George", "0721234567");
        Contact mihaela = new Contact("Mihaela", "0749876543");
        Contact daniel = new Contact("Daniel", "0753692587");
        Contact ioana = new Contact("Ioana", "0731472589");
        Collections.addAll(agendaTel, george,mihaela,daniel,ioana);

        // 1.1. add to contact list:
        Contact liviu = new Contact("Liviu", "0729516237");
        agendaTel.add(liviu);
        for(Contact persoana: agendaTel) {
            System.out.println(persoana.getName() + " - " + persoana.getPhoneNumber());
        }
        System.out.println(" ");

        // 1.2 remove from contact list:
        agendaTel.remove(liviu);
        for(Contact persoana: agendaTel) {
            System.out.println(persoana.getName() + " - " + persoana.getPhoneNumber());
        }
        System.out.println(" ");

        // 1.3 search for contacts by name
        String lookingFor = "ioana";
        for(Contact persoana:agendaTel) {
            if (persoana.getName().toLowerCase().equals(lookingFor)) {
                System.out.println("Contact found: " + persoana.getName() + " - " + persoana.getPhoneNumber());
            }
        }
    }


}