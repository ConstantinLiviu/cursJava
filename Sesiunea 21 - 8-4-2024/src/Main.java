import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMapNotaCurs = new HashMap<Integer, String>();
        hashMapNotaCurs.put(10, "Chimie");
        hashMapNotaCurs.put(8, "Matematica");
        hashMapNotaCurs.put(5, "Biologie");

        for (Map.Entry<Integer, String> entry: hashMapNotaCurs.entrySet()) {
            System.out.println("key: " + entry.getKey() + " // " + "Value: " + entry.getValue());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1,7,3,2,6,5,4));
        Collections.sort(numbers);

        numbers.forEach(number-> {
            System.out.println(number);
        });

        System.out.println(" ");

        // 1. Create a class named ListUpdater. This class should have a method named updateList that takes an
        // ArrayList of integers and an integer index as parameters. The method should double the element at the
        //  specified index in the list. The method should return the updated list.
        ListUpdater newObject = new ListUpdater();
        ArrayList<Integer> newList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

        newObject.updateList(newList, 5);

        System.out.println(newList);

        // 2. Create a class named HashMapInitializer. In this class, create a method named initializeMap which takes
        // no parameters and returns a HashMap with String keys and Integer values. The method should create a HashMap,
        // add the keys "One", "Two", "Three" associated with values 1, 2, and 3, respectively, and then return the HashMap.

        HashMapInitializer newHashMapObj = new HashMapInitializer();
        newHashMapObj.initializeMap();

        // 3. Create a class named EmployeeDirectory. Inside this class, develop a method named displayEmployeeInfo
        // which takes a HashMap with String keys representing employee IDs and String values representing employee
        // names as a parameter. The method should iterate over the HashMap and print out each employee ID+employee name
        HashMap<String, String> employeesList = new HashMap<>();
        employeesList.put("201", "Ion");
        employeesList.put("553", "Maria");
        employeesList.put("198", "George");
        employeesList.put("890", "Elena");
        employeesList.put("207", "Walter");

        EmployeeDirectory dosarAngajati = new EmployeeDirectory();
        dosarAngajati.displayEmployeeInfo(employeesList);
    }
}