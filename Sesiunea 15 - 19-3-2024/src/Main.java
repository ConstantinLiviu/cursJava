import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // OOP
        Casa casaNoua = new Casa();
        // casaNoua.nr = 10;
        casaNoua.setNr(10);
        System.out.println(casaNoua.getNr());
        System.out.println(casaNoua.calculeazaCodPostal(20));

        // -Check if an ArrayList is empty or not.
        ArrayList<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(5);
        listaNumere.add(1);
        listaNumere.add(53);
        if (listaNumere.size() !=0) {
            System.out.println("Lista are cel putin un element");
        } else {
            System.out.println("Multime vida!");
        }

    }
}