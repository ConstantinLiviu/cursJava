public class Main {
    public static void main(String[] args) {
        // Enums

        System.out.println(StareComanda.GOL);
        System.out.println(StareComanda.PENDING.getStareNume());

        // Expresii lambda
        // parametri                   sageata                    cod
        // (String Param1, String Param2) -> Param1.length().compareTo(Param2.length());


        // In a large application, debugging and logging information efficiently is crucial. To facilitate this, we
        // want to implement a custom toString() method for our Employee class to provide a detailed string
        // representation of an Employee object, which can be used for logging and debugging purposes.
        // -Generics allow you to define classes, interfaces, and methods with a placeholder. Create a generic class
        // named Box that can hold an object of any type. Define two methods: set() to set an object and get() to
        // retrieve it

        Employee george = new Employee("George", 152903, 5300);
        System.out.println(george.toString());

        Box<Employee> newBoxObject = new Box<>();
        newBoxObject.setObject(george);
        System.out.println(newBoxObject.getObject());


        // Overriding methods
        // schimband comportamentul serveste ca si clasa anonima
        Car car = new Car("Q7", "BMW") {
            @Override
            public void functioneaza() {
                System.out.println("E in service");
            }
        };
    }
}