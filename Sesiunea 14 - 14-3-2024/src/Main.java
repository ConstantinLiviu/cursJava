import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Declarare array list
        // Diferit de array avand o lungime variabila
        ArrayList<String> numeMasini = new ArrayList<>();

        // Adaugare elemente in Array list
        numeMasini.add("Masina1");
        numeMasini.add("Masina2");
        numeMasini.add("Masina3");
        System.out.println(" ");

        // Iterare elemente Array list
        for(String numeMasina: numeMasini) {
            System.out.println(numeMasina);
        }
        System.out.println(" ");

        // Accesare elemente din array list
        System.out.println(numeMasini.get(1));
        System.out.println(" ");

        // Lungime array list
        System.out.println("Lungimea arrayListului este: " + numeMasini.size());
        System.out.println(" ");

        // Verificare AL gol
        System.out.println(numeMasini.isEmpty());
        System.out.println(" ");

        // Stergere element
        numeMasini.remove("Masina1");
        for(String numeMasina: numeMasini) {
            System.out.println(numeMasina);
        }
        System.out.println(" ");

        // Golire AL
        // numeMasini.clear();
        // System.out.println(numeMasini);

        // Contine el X?
        System.out.println(numeMasini.contains("Masina2"));

        // EXERCITII
        ArrayList<String> listaCumparaturi = new ArrayList<>();
        // listaCumparaturi.add("Cartofi");
        // listaCumparaturi.add("Carne");
        // listaCumparaturi.add("Lapte");
        // listaCumparaturi.add("Ciocolata");
        // listaCumparaturi.add("Paine");
        Collections.addAll(listaCumparaturi, "Cartofi", "Carne", "Lapte", "Ciocolata", "Paine");
        System.out.println(listaCumparaturi);
        System.out.println(" ");

        // 1. Remove the third element from an ArrayList.
        listaCumparaturi.remove(2);
        System.out.println(listaCumparaturi);
        System.out.println(" ");

        // 2. Check if an ArrayList contains the element "Grape".
        System.out.println(listaCumparaturi.contains("Grape"));
        System.out.println(" ");

        // 3. Clear all elements from an ArrayList.
        // commented out to avoid having to recreate the ArrayList
        // listaCumparaturi.clear();
        // System.out.println(listaCumparaturi);
        // System.out.println(" ");

        // 4. Print each element of an ArrayList using a for-loop.
        for(String itemCumparaturi: listaCumparaturi) {
            System.out.println(itemCumparaturi);
        }

        // 5. Insert the value "Mango" into the second position of an ArrayList.
        listaCumparaturi.add(1, "Mango");
        System.out.println(listaCumparaturi);
        System.out.println(" ");

        // 6. Replace the first element of an ArrayList with the value "Penguin".
        listaCumparaturi.set(0,"Penguin");
        System.out.println(listaCumparaturi);
        System.out.println(" ");

        // BONUS:
        // 1. Design a shopping cart system where products can be added, removed, and the total price can be calculated.
        // Created Product class

        // create shopping cart list
        ArrayList<Product> cart = new ArrayList<>();

        // create products
        Product produsNou = new Product("Laptop", 3500);
        Product produsNou2 = new Product("RAM", 480);

        // Add products
        cart.add(produsNou);
        cart.add(produsNou2);
        // System.out.println(cart.get(0).getName());
        // for (Product produs: cart) {
            // System.out.println(produs.getName()+ " : " + produs.getPrice());
        // }

        // Remove product
        cart.remove(1);

        // add another product
        Product produsNou3 = new Product("Mouse", 75);
        cart.add(produsNou3);

        // calculate final price
        double sum = 0;
        for (Product produs: cart) {
            sum+= produs.getPrice();
        }
        System.out.println("Suma totala de plata a produselor este: " + sum);
    }
}