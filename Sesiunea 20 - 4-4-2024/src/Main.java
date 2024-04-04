import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> curs = new ArrayList<>();
        curs.add("Chimie");
        System.out.println(curs.get(0));

        // HashMaps don't accept primitives
        // HashMaps elements may not keep their order
        HashMap<Integer, String> hashMapNotaCurs = new HashMap<Integer, String>();
        hashMapNotaCurs.put(10, "Chimie");
        hashMapNotaCurs.put(8, "Matematica");
        hashMapNotaCurs.put(5, "Biologie");

        System.out.println(hashMapNotaCurs.get(5));

        System.out.println(" ");

        for(Integer nota: hashMapNotaCurs.keySet()) {
            System.out.println(hashMapNotaCurs.get(nota));
        }

        System.out.println(" ");

        // EXE
        // Create a superclass Vehicle and two subclasses Car and Truck. The superclass has a method fuelType returning
        // "generic fuel". Override this method in both subclasses: Car should return "petrol" and Truck should return
        // "diesel". Now, create objects of Car and Truck but reference them using Vehicle type and call the fuelType
        // method.
        Vehicle myCar = new Car();
        myCar.fuelType();
        Vehicle myTruck = new Truck();
        myTruck.fuelType();


        // -Create a class named ListRetriever. Inside this class, create a method named retrieveElement which
        // takes a List of Strings and an integer index as parameters and returns the element at the specified
        // index from the list.
        ListRetriever newListRetreiever = new ListRetriever();
        List<String> stringsList = List.of("mere", "pere", "nuci");

        newListRetreiever.retrieveElement(stringsList, 2);
    }
}